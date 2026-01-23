package assignments.Homework;
import java.util.Scanner;
class StudentCard {
    static String clg = "Symbiosis Institute of Technology";
    String nm;
    int sem;
    String prn;

    StudentCard(String nm, int sem, String prn) {
        this.nm = nm;
        this.sem = sem;
        this.prn = prn;
    }
    void show() {
        System.out.println("College: " + clg);
        System.out.println("Name: " + nm);
        System.out.println("Semester: " + sem);
        System.out.println("PRN: " + prn);
    }
}
public class hw4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String nm = sc.nextLine();

        System.out.print("Enter semester: ");
        int sem = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();

        StudentCard s = new StudentCard(nm, sem, prn);
        System.out.println();
        s.show();

        sc.close();
    }
}
