import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {

    static Vector<ClientHandler> clients = new Vector<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                ClientHandler client = new ClientHandler(socket);
                clients.add(client);

                Thread t = new Thread(client);
                t.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Broadcast method
    public static void broadcast(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }
}

// Client Handler Thread
class ClientHandler implements Runnable {

    private Socket socket;
    private BufferedReader input;
    private PrintWriter output;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run() {
        String msg;
        try {
            while ((msg = input.readLine()) != null) {
                System.out.println("Client: " + msg);

                // Send to all other clients
                ChatServer.broadcast(msg, this);
            }
        } catch (Exception e) {
            System.out.println("Client disconnected");
        }
    }

    public void sendMessage(String msg) {
        output.println(msg);
    }
}