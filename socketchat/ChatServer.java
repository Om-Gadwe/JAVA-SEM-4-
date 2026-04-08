import java.io.*;
import java.net.*;
public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started... Waiting for client");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {
                // Receive from client
                if ((msg = input.readLine()) != null) {
                    System.out.println("Client: " + msg);
                }

                // Send to client
                System.out.print("You: ");
                String reply = keyboard.readLine();
                output.println(reply);

                if (reply.equalsIgnoreCase("bye")) {
                    break;
                }
            }

            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
