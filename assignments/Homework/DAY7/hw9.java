package assignments.Homework.DAY7;
//SCENARIO BASED QUESTIONS
//Library Management System
/*
import java.util.ArrayList;
class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }
}
class Library {
    ArrayList<Book> list = new ArrayList<>();
    void addBook(Book b) {
        list.add(b);
    }
    void searchByTitle(String name) {
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).title.equals(name)) {
                System.out.println("Book Found:");
                System.out.println(list.get(i).title);
                System.out.println(list.get(i).author);
                System.out.println(list.get(i).isbn);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found");
        }
    }

    void displayAll() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).title);
            System.out.println(list.get(i).author);
            System.out.println(list.get(i).isbn);
            System.out.println("----------------");
        }
    }
}

public class hw9 {
    public static void main(String[] args) {

        Library lib = new Library();

        Book b1 = new Book("Java", "James", "101");
        Book b2 = new Book("Python", "Guido", "102");

        lib.addBook(b1);
        lib.addBook(b2);

        lib.displayAll();
        lib.searchByTitle("Java");
    }
}
*/


//Student Grade Management System
/*
import java.util.ArrayList;
class Student {
    String name;
    ArrayList<Double> grades = new ArrayList<>();
    Student(String n) {
        name = n;
    }
    void addGrade(double g) {
        grades.add(g);
    }
    void showDetails() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        double avg = 0;
        if (grades.size() > 0) {
            avg = sum / grades.size();
        }
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.println("Average: " + avg);
    }
}
class GradeManager {
    ArrayList<Student> list = new ArrayList<>();
    void addStudent(Student s) {
        list.add(s);
    }
    void displayAll() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).showDetails();
            System.out.println("----------------");
        }
    }
}
public class hw9 {
    public static void main(String[] args) {

        GradeManager gm = new GradeManager();

        Student s1 = new Student("Om");
        s1.addGrade(80);
        s1.addGrade(90);
        gm.addStudent(s1);
        gm.displayAll();
    }
}
*/


//Online Shopping Cart
/*
import java.util.ArrayList;
class Product {
    String name;
    double price;
    Product(String n, double p) {
        name = n;
        price = p;
    }
}
class Cart {
    ArrayList<Product> list = new ArrayList<>();
    void addProduct(Product p) {
        list.add(p);
    }
    void removeProduct(String name) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)) {
                list.remove(i);
                break;
            }
        }
    }
    void showCart() {
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).price);
            total = total + list.get(i).price;
        }
        System.out.println("Total: " + total);
    }
}
public class hw9 {
    public static void main(String[] args) {
        Cart c = new Cart();
        c.addProduct(new Product("Laptop", 50000));
        c.addProduct(new Product("Mouse", 500));
        c.showCart();
        c.removeProduct("Mouse");
        System.out.println("After removing:");
        c.showCart();
    }
}
*/


//Bank Account System
/*
import java.util.ArrayList;
class Account {
    String number;
    String name;
    double balance;
    Account(String n, String nm, double b) {
        number = n;
        name = nm;
        balance = b;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance");
        } else {
            balance = balance - amount;
        }
    }
    void show() {
        System.out.println(number + " " + name + " " + balance);
    }
}
class Bank {
    ArrayList<Account> list = new ArrayList<>();
    void addAccount(Account a) {
        list.add(a);
    }
    void showAll() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }
    }
}
public class hw9 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("101", "Om", 10000);
        Account a2 = new Account("102", "Rahul", 5000);
        bank.addAccount(a1);
        bank.addAccount(a2);
        a1.deposit(2000);
        a1.withdraw(5000);
        bank.showAll();
    }
}
*/


//Employee Payroll
/* 
import java.util.ArrayList;
class Employee {
    String id;
    String name;
    String role;
    double base;
    double salary;
    Employee(String i, String n, String r, double b) {
        id = i;
        name = n;
        role = r;
        base = b;
    }
    void calculate() {
        if (role.equals("Manager")) {
            salary = base + (0.20 * base);
        } 
        else if (role.equals("Developer")) {
            salary = base + (0.10 * base);
        } 
        else if (role.equals("Designer")) {
            salary = base + (0.05 * base);
        } 
        else if (role.equals("Intern")) {
            salary = 1000;
        } 
        else {
            salary = base;
        }
    }
    void show() {
        System.out.println(id + " " + name + " " + role + " " + salary);
    }
}
class Payroll {
    ArrayList<Employee> list = new ArrayList<>();
    void add(Employee e) {
        list.add(e);
    }
    void showAll() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).calculate();
            list.get(i).show();
        }
    }
}
public class hw9 {
    public static void main(String[] args) {
        Payroll p = new Payroll();
        Employee e1 = new Employee("E1", "Om", "Manager", 50000);
        Employee e2 = new Employee("E2", "Riya", "Intern", 20000);
        p.add(e1);
        p.add(e2);
        p.showAll();
    }
}
*/