package assignments;
/*
//calling one constructor from another constructor
class Demo{
    Demo(){
        this("default constructor"); // calling parameterized constructor
    }
    Demo(String msg){
        System.out.println(msg);
    }
}
public class FL5 {
    public static void main(String[] args) {
        new Demo();
    }
}
*/
/*
//runtime polymorphism
class animal{
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{
    void eat(){
        System.out.println("barking...");
    }
}
public class FL5 {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
    }
}
*/
/*
//use of this keyword to refer current class instance variable
class student{
    String name;

    student(String  name){
        this.name=name; // refer to current class instance variable
    }
    void display(){
        System.out.println("name:"+this.name);
    }
}
public class FL5 {
    public static void main(String[] args) {
        student s = new student("om");
        s.display();
    }
}
*/
//use of super keyword to refer parent class method 
/* 
class parent{
    void display(){
        System.out.println("parent class method");
    }
}
class child extends parent{
    void display(){
        super.display();
        System.out.println("child class method");
    }
}
public class FL5 {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}*/
// calling parent class constructor from child class
class parent{
    parent(){
        System.out.println("parent class method");
    }
}
class child extends parent{
    child(){
        super();
        System.out.println("child class method");
    }
}
public class FL5 {
    public static void main(String[] args) {
        new child();
    }
}
