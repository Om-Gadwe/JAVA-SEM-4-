import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SearchStudent {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "OmonMySQL@26";

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.print("Enter Roll Number to search: ");
            int roll = sc.nextInt();

            String query = "SELECT * FROM Stu WHERE prn = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, roll);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("\nStudent Found:");
                System.out.println("Roll No: " + rs.getInt("prn"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Course: " + rs.getString("course"));
            } else {
                System.out.println("No student found with Roll No: " + roll);
            }
            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
