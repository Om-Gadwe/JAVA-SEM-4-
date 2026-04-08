package rmi;

import java.rmi.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("1. Hello Service");
            System.out.println("2. Calculator Service");
            System.out.println("3. Factorial"); 
            int choice = sc.nextInt();

            if (choice == 1) {
                hello h = (hello) Naming.lookup("rmi://localhost/HelloService");
                System.out.println(h.sayHello());

            } else if (choice == 2) {
                Calculator c = (Calculator) Naming.lookup("rmi://localhost/CalcService");

                System.out.print("Enter a: ");
                int a = sc.nextInt();

                System.out.print("Enter b: ");
                int b = sc.nextInt();

                System.out.println("1.Add 2.Sub 3.Mul 4.Div");
                int op = sc.nextInt();

                switch (op) {
                    case 1: System.out.println(c.add(a, b)); break;
                    case 2: System.out.println(c.sub(a, b)); break;
                    case 3: System.out.println(c.mul(a, b)); break;
                    case 4: System.out.println(c.div(a, b)); break;
                    default: System.out.println("Invalid choice");
                }
            }
            else if (choice == 3) {
                Factorial f = (Factorial) Naming.lookup("rmi://localhost/FactService");
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                System.out.println("Factorial = " + f.fact(n));
            }   

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}