import java.io.*;
import java.net.*;
public class ModServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            int num1 = Integer.parseInt(in.readLine());
            int num2 = Integer.parseInt(in.readLine());

            int result = num1 % num2;
            System.out.println("Received: " + num1 + " % " + num2 + " = " + result);

            out.println(result);

            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}