import java.io.*;
import java.net.*;

public class ChatClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            // Thread to read messages from server
            Thread readThread = new Thread(() -> {
                String msg;
                try {
                    while ((msg = input.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (Exception e) {
                }
            });

            readThread.start();

            // Main thread → send messages
            String message;
            while (true) {
                message = keyboard.readLine();
                output.println(message);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}