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

            // LOGIN
            String name = input.readLine();
            user = new User(name, output);
            UserManager.addUser(user);

            System.out.println(name + " joined");

            String message;

            while ((message = input.readLine()) != null) {

                if (message.equalsIgnoreCase(Protocol.EXIT)) {
                    break;
                }

                MessageRouter.broadcast(user.getName() + ": " + message, user);
            }

        } catch (Exception e) {
            System.out.println("Client error");
        } finally {
            try {
                UserManager.removeUser(user);
                socket.close();
            } catch (Exception e) {}
        }
    }
}