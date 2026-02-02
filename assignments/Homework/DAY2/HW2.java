package assignments.Homework.DAY2;
import java.util.Scanner;
class UserInfo {
    String nm;
    int rn;
    String prn;
    UserInfo(String nm, int rn, String prn) {
        this.nm = nm;
        this.rn = rn;
        this.prn = prn;
    }
    void show() {
        System.out.println("Name: " + nm);
        System.out.println("Roll No: " + rn);
        System.out.println("PRN: " + prn);
    }
}
public class HW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nm = sc.nextLine();
        System.out.print("Enter roll no: ");
        int rn = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();
        UserInfo obj = new UserInfo(nm, rn, prn);
        obj.show();

        sc.close();
    }
}
