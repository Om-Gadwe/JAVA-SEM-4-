package assignments.Homework.DAY6;
//1)write a program in java where we will be using final class, final method, and final variable within a single program
/* 
final class Parent {
    final int FIXED_VALUE = 100;
    final void display() {
        System.out.println("Final variable value: " + FIXED_VALUE);
        System.out.println("This is a final method inside a final class.");
    }
}
public class hw8 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }
}
*/
//2)write a program in java where we will be using the abstract keyword to design a calculator application
/* 
abstract class Calculator {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    void show() {   // concrete method allowed in abstract class
        System.out.println("Simple Calculator Application");
    }
}
class MyCalculator extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}
public class hw8 {
    public static void main(String[] args) {
        MyCalculator calc = new MyCalculator();
        calc.show();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
    }
}
*/
//3)write a program in java to implement interface to solve the diamond problem
//The Diamond Problem occurs in multiple inheritance when a class inherits from two classes (or interfaces) that have the same method name, and the compiler gets confused about which method to use.
//This forms a diamond-shaped inheritance structure, which is why it is called the Diamond Problem.
/*
interface A {
    default void show() {
        System.out.println("Show from Interface A");
    }
}
interface B {
    default void show() {
        System.out.println("Show from Interface B");
    }
}
class C implements A, B {
    public void show() {
        A.super.show();  
        B.super.show();
        System.out.println("Show from Class C");
    }
}
public class hw8 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
*/