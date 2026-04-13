package minichatapp.client;

import java.io.BufferedReader;
import java.io.IOException;

public class ChatReceiver implements Runnable {

    private BufferedReader input;

    public ChatReceiver(BufferedReader input) {
        this.input = input;
    }

    public void run() {
        try {
            String message;

            while ((message = input.readLine()) != null) {
                System.out.println(message);
            }

        } catch (IOException e) {
            System.out.println("Disconnected from server");
        }
    }
}