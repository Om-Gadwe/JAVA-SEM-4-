package assignments.Homework.DAY1;
import java.util.Scanner;
class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1) DETAILS IN SEPRATE LINES
        /*
        String name = "Om Gadwe";
        int rollNo = 125;
        String address = "Pune-Maharashtra";

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Address: " + address);
        */
        //2)DIVISION CASES
        /*
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            System.out.println("Division = " + (a / b));
        }
        */
        //3)Pass 2 float variables into function Addition stored in double in main
        /*
        float x = 40.67f;
        float y = 5.33f;
        double result = add_float(x, y);
        System.out.println("Addition = " + result);
        */
        //4)Child class inherits Parent class
        /*
        Child obj = new Child();
        obj.showParent();
        obj.showChild();
        */
        //5)Fucntion overloading
        /*
        Calculator c = new Calculator();
        c.add(10, 20);         
        c.add(10.5, 5.5);      
        */
        //6)String reversal 
        /*
        String str = "Hello";
        //using predefined function
        String rev1 = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed using predefined func = " + rev1);
        //without predefined function
        String rev2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev2 = rev2 + str.charAt(i);
        }
        System.out.println("Reversed without predefined func = " + rev2);
        */
        sc.close();
    }
    static float add_float(float a, float b) {
        return a + b;
    }
}
class Parent{
    void showParent() {
        System.out.println("This is Parent class method");
    }
}
class Child extends Parent {
    void showChild() {
        System.out.println("This is Child class method");
    }
}
class Calculator {
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
    void add(double a, double b) {
        System.out.println("Addition = " + (a + b));
    }
}
//print() prints on the same line, while println() prints and moves to the next line.