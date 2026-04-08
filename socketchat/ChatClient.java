import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server!");

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            String msg;

            while (true) {
                // Send to server
                System.out.print("You: ");
                String message = keyboard.readLine();
                output.println(message);

                if (message.equalsIgnoreCase("bye")) {
                    break;
                }

                // Receive from server
                msg = input.readLine();
                System.out.println("Server: " + msg);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}