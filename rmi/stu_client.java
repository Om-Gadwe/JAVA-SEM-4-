package rmi;

import java.rmi.*;
import java.util.Scanner;

public class stu_client {
    public static void main(String[] args) {
        try {
            Student obj = (Student) Naming.lookup("rmi://localhost/StudentService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();

            String result = obj.getStudent(roll);

            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}