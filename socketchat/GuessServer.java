import java.io.*;
import java.net.*;
import java.util.Random;

public class GuessServer {

    public static void main(String[] args) {

        int port = 1234;

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            System.out.println("Server started...");
            System.out.println("Waiting for client...");

            Socket socket = serverSocket.accept();

            System.out.println("Client connected!");

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

            Random random = new Random();

            int numberToGuess =
                    random.nextInt(100) + 1;

            System.out.println(
                    "Secret number: " + numberToGuess
            );

            String guess;

            while ((guess = input.readLine()) != null) {

                int userGuess = Integer.parseInt(guess);

                if (userGuess < numberToGuess) {

                    output.println("Too low!");

                } else if (userGuess > numberToGuess) {

                    output.println("Too high!");

                } else {

                    output.println("Correct! You guessed it!");
                    break;
                }
            }

            socket.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}