package assignments.Homework;
import java.util.Scanner;
class Profile {
    String nm;
    int age;
    void setData(String nm, int age) {
        this.nm = nm;
        this.age = age;
    }
    void printData() {
        System.out.println("Name: " + nm);
        System.out.println("Age: " + age);
    }
}
public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Profile p = new Profile();

        System.out.print("Enter name: ");
        String nm = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        p.setData(nm, age);

        System.out.println();
        p.printData();

        sc.close();
    }
}
/*Here we create an object Profile p = new Profile(); and then call methods like p.setData() and p.printData() using that object.
These methods are not static, so they cannot be called directly with class name.
They use object’s data (like name and age) and then display it. */