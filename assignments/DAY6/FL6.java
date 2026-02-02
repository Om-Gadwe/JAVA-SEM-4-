package  assignments.DAY6;
//1)
/* 
//use of final keyword to declare constant variable
class FinalClass{
    final int a = 10;
    void display() {
        System.out.println("Value of a: " + a);
    }
}
public class FL6 {
    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.display();
    }
}
*/

//2)
/* 
//use of final keyword to prevent method overriding
class parent {
    final void eat() {
        System.out.println("parent class eat method");
    }
}
class child extends parent {
    // void eat() { // cannot override final method
    //     System.out.println("child class eat method");
    // }
}
public class FL6 {
    public static void main(String[] args) {
        child d = new child();
        d.eat();
    }
}
*/

//3)
/* 
//use of final keyword to prevent inheritance
final class parent {
    void eat() {
        System.out.println("parent class eat method");
    }
}
// class child extends parent { // cannot inherit final class
//     void eat() {
//         System.out.println("child class eat method");
//     }
// }
public class FL6 {
    public static void main(String[] args) {
        // child d = new child();
        // d.eat();
        parent p = new parent();
        p.eat();
    }
}
*/

//4)
/*
//use of abstract class and method
abstract class parent {
    abstract void eat();
    void message() {
        System.out.println("this is a parent class");
    }
}
class child extends parent {
    void eat() {
        System.out.println("child class eat method");
    }
}
public class FL6 {
    public static void main(String[] args) {
        parent p = new child();
        p.message();
        p.eat();
    }
}
*/

//5)
/*
//use of interface
interface animal {
    void eat();
}
class dog implements animal {
    public void eat() {
        System.out.println("barking...");
    }
}
public class FL6 {
    public static void main(String[] args) {
        animal d = new dog();
        d.eat();
    }
} 
*/