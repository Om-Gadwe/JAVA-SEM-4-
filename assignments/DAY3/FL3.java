package assignments.DAY3;
/* 
class Student{
    String name;
    int age;
    // Student(){                  [default constructor]
    //     name = "Unknown";
    //     age = 0;
    // }
    Student(String s,int a){     // parameterized constructor
        name = s;
        age = a;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
} 
public class FL3 {
    public static void main(String[] args) {
        Student student1 = new Student("OM", 19);
        student1.display();
    }
}
*/
// static variable example
/* class Counter{
    static int count = 0;

    Counter(){
        count++;
        System.out.println("Counter value: " + count);
    }
}
public class FL3 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
*/
/* 
//instance variable example
class FL3{
    String name;
    int id;
    public static void main(String[] args) {
        FL3 s1 = new FL3();  
        FL3 s2 = new FL3();                        // FL3 = Student 
        s1.name = "OM";
        s1.id = 121;
        s2.id = 122;
        s2.name = "AMIT";
        System.out.println("Name: " + s1.name);
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s2.name);
        System.out.println("ID: " + s2.id);
    }
}
*/
//instance method example
class FL3{
    String name;
    void display(){
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        FL3 p = new FL3();
        p.name = "OM";
        p.display();
    }
}