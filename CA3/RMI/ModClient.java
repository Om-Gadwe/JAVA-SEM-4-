import java.rmi.*;
import java.util.Scanner;

public class ModClient {
    public static void main(String[] args) {
        try {
            ModInterface obj = (ModInterface) Naming.lookup("rmi://localhost/ModService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = obj.findMod(a, b);
            System.out.println("Modulus result from server: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}