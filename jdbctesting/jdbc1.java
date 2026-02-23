import java.sql.*;
import java.util.Scanner;
class jdbc1 {

    static String url = "jdbc:mysql://localhost:3306/test1";
    static String username = "root";
    static String password = "OmonMySQL@26";

    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Connection Established Successfully\n");

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Insert Student");
            System.out.println("2. Update Marks");
            System.out.println("3. Delete Student");
            System.out.println("4. Show All Students");
            System.out.println("5. Count Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    insertStudent(con, sc);
                    break;

                case 2:
                    updateMarks(con, sc);
                    break;

                case 3:
                    deleteStudent(con, sc);
                    break;

                case 4:
                    showStudents(con);
                    break;

                case 5:
                    countStudents(con);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        con.close();
        sc.close();
        System.out.println("Connection Closed.");
    }

    // INSERT
    static void insertStudent(Connection con, Scanner sc) throws Exception {
        String query = "INSERT INTO students VALUES (?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);

        System.out.print("Enter ID: ");
        ps.setInt(1, sc.nextInt());

        sc.nextLine();
        System.out.print("Enter Name: ");
        ps.setString(2, sc.nextLine());

        System.out.print("Enter Age: ");
        ps.setInt(3, sc.nextInt());

        sc.nextLine();
        System.out.print("Enter Course: ");
        ps.setString(4, sc.nextLine());

        System.out.print("Enter Marks: ");
        ps.setInt(5, sc.nextInt());

        int rows = ps.executeUpdate();
        System.out.println(rows + " Student Inserted Successfully");

        ps.close();
    }

    // UPDATE
    static void updateMarks(Connection con, Scanner sc) throws Exception {
        String query = "UPDATE students SET marks=? WHERE stname=?";
        PreparedStatement ps = con.prepareStatement(query);

        System.out.print("Enter Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter New Marks: ");
        int marks = sc.nextInt();

        ps.setInt(1, marks);
        ps.setString(2, name);

        int rows = ps.executeUpdate();
        System.out.println(rows + " Student Updated");

        ps.close();
    }

    // DELETE
    static void deleteStudent(Connection con, Scanner sc) throws Exception {
        String query = "DELETE FROM students WHERE student_id=?";
        PreparedStatement ps = con.prepareStatement(query);

        System.out.print("Enter Student ID to Delete: ");
        ps.setInt(1, sc.nextInt());

        int rows = ps.executeUpdate();
        System.out.println(rows + " Student Deleted");

        ps.close();
    }

    // SELECT
    static void showStudents(Connection con) throws Exception {
        String query = "SELECT * FROM students";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        System.out.println("\nID  Name   Age  Course  Marks");
        System.out.println("--------------------------------");

        while (rs.next()) {
            System.out.println(
                rs.getInt("student_id") + "  " +
                rs.getString("stname") + "  " +
                rs.getInt("age") + "  " +
                rs.getString("course") + "  " +
                rs.getInt("marks")
            );
        }

        rs.close();
        ps.close();
    }

    // COUNT
    static void countStudents(Connection con) throws Exception {
        String query = "SELECT COUNT(*) FROM students";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Total Students: " + rs.getInt(1));
        }

        rs.close();
        ps.close();
    }
}
