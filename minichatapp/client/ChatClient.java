package minichatapp.client;

import java.io.*;
import java.net.*;

import minichatapp.util.Protocol;

public class ChatClient {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));

            System.out.print("Enter your name: ");
            String name = keyboard.readLine();
            output.println(name);

            new Thread(new ChatReceiver(input)).start();

            String msg;

            while ((msg = keyboard.readLine()) != null) {
                output.println(msg);

                if (msg.equalsIgnoreCase(Protocol.EXIT)) {
                    break;
                }
            }

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}