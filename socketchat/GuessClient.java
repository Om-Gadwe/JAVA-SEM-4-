import java.io.*;
import java.net.*;
import java.util.Scanner;

public class GuessClient {

    public static void main(String[] args) {

        String serverAddress = "localhost";
        int port = 1234;

        try {

            Socket socket =
                    new Socket(serverAddress, port);

            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream()
                            )
                    );

            PrintWriter output =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );

            Scanner scanner = new Scanner(System.in);

            System.out.println(
                    "Guess number between 1 and 100"
            );

            while (true) {

                System.out.print("Enter guess: ");

                int guess = scanner.nextInt();

                output.println(guess);

                String response =
                        input.readLine();

                System.out.println(response);

                if (response.equals(
                        "Correct! You guessed it!"
                )) {
                    break;
                }
            }

            socket.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}