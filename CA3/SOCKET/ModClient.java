import java.io.*;
import java.net.*;
import java.util.Scanner;
public class ModClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);

            BufferedReader in = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            out.println(num1);
            out.println(num2);

            String result = in.readLine();
            System.out.println("Modulus result from server: " + result);

            socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}