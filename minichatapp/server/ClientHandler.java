package minichatapp.server;

import java.io.*;
import java.net.*;
import minichatapp.model.User;
import minichatapp.util.Protocol;

public class ClientHandler implements Runnable {

    private Socket socket;
    private User user;
    private BufferedReader input;
    private PrintWriter output;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            output = new PrintWriter(socket.getOutputStream(), true);

            // 🔹 LOGIN
            String name = input.readLine();
            user = new User(name, output);
            UserManager.addUser(user);

            System.out.println(name + " joined");

            // 🔥 Broadcast join message
            MessageRouter.broadcast("🔵 " + name + " joined the chat", user);

            String message;

            while ((message = input.readLine()) != null) {

                if (message.equalsIgnoreCase(Protocol.EXIT)) {
                    break;
                }

                MessageRouter.broadcast(user.getName() + ": " + message, user);
            }

        } catch (Exception e) {
            System.out.println("Client error / disconnected");
        } finally {
            try {
                if (user != null) {
                    // 🔥 REMOVE USER
                    UserManager.removeUser(user);

                    // 🔥 Broadcast leave message
                    MessageRouter.broadcast("🔴 " + user.getName() + " left the chat", user);

                    System.out.println(user.getName() + " left");
                }

                socket.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}