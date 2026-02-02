package assignments.Homework.DAY4;
public class hw6 {
    //Parameterized method
    /*
    static void showData(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);

        showData(name, age);
    }
    */
    //Three different objects accessing variables
    /*
    public static void main(String[] args) {

        Student s = new Student("Om", 101);
        College c = new College("SIU");
        Course cr = new Course("CSE");

        s.display();
        c.display();
        cr.display();
    }
    */
}
class Student {
    String name;
    int roll;
    Student(String n, int r) {
        name = n;
        roll = r;
    }
    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}
class College {
    String collegeName;
    College(String c) {
        collegeName = c;
    }
    void display() {
        System.out.println("College: " + collegeName);
    }
}
class Course {
    String courseName;
    Course(String c) {
        courseName = c;
    }
    void display() {
        System.out.println("Course: " + courseName);
    }
}


