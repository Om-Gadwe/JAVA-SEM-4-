package assignments.Homework;
import java.util.Scanner;
class Calc {
    double a, b;
    Calc(double a, double b) {
        this.a = a;
        this.b = b;
    }
    void run(int pick) {
        switch (pick) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;
            case 2:
                System.out.println("Multiplication = " + (a * b));
                break;
            case 3:
                if (b == 0)
                    System.out.println("Division not possible (second number is 0)");
                else
                    System.out.println("Division = " + (a / b));
                break;
            case 4:
                System.out.println("Subtraction = " + (a - b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
public class hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("\n1. Sum");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");
        System.out.println("4. Subtraction");
        System.out.print("Choose operation: ");
        int pick = sc.nextInt();
        Calc job = new Calc(a, b);
        job.run(pick);
        sc.close();
    }
}
