package assignments.DAY9;
/*
//SCENARIO 1 (LOGISTICTECH SMART WAREHOUSE SYSTEM INVENTORT MANAGEMENT)
import java.lang.reflect.Array;
import java.util.*;
import java.time.LocalDate;


interface Taxable {
    double calculateTax();
}

abstract class item implements Taxable{
    protected String itemid;
    protected String name;
    protected double baseprice;

    public item(String itemid, String name, double baseprice) {
        this.itemid = itemid;
        this.name = name;
        this.baseprice = baseprice;
    }

    public String getitemid(){
        return itemid;
    }

    public double getpricewithtax(){
        return baseprice + calculateTax();
    }

    public double getbaseprice(){
        return baseprice;
    }

    public abstract void display();
}

//perishable item that has tax 
class perishable extends item {
    private LocalDate expirydate;
    public perishable(String itemid, String name, double baseprice, LocalDate expirydate) {
        super(itemid, name, baseprice);
        this.expirydate = expirydate;
    }

    public double calculateTax() {
        return baseprice * 0.05; // 5% tax for perishable items
    }

    public void display() {
        System.out.println("Perishable Item:");
        System.out.println("ID: " + itemid);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + baseprice);
        System.out.println("Price with Tax: " + getpricewithtax());
        System.out.println("Expiry Date: " + expirydate);
    }
}

//electronic item that has warrenty
class electronic extends item{
    private int warrantyperiod; // in months

    public electronic(String itemid, String name, double baseprice, int warrantyperiod) {
        super(itemid, name, baseprice);
        this.warrantyperiod = warrantyperiod;
    }

    public double calculateTax() {
        return baseprice * 0.15; // 15% tax for electronic items
    }

    public void display() {
        System.out.println("Electronic Item:");
        System.out.println("ID: " + itemid);
        System.out.println("Name: " + name);
        System.out.println("Base Price: " + baseprice);
        System.out.println("Price with Tax: " + getpricewithtax());
        System.out.println("Warranty Period: " + warrantyperiod + " months");
    }
}
public class FL9 {
    private static ArrayList<item> inventroy = new ArrayList<>();

    public static void additem(item i){
        inventroy.add(i);
    }
    public static void displayinventory(){
        for(item i : inventroy){
            i.display();
            System.out.println();
        }
    }

    //search by id
    public static void searchbyid(String id){
        boolean found = false;
        for(item i : inventroy){
            if(i.getitemid().equals(id)){
                i.display();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Item with ID " + id + " not found.");
        }
    }


    // calculate total value of inventory
    public static void calculatetotalvalue(){
        double totalvalue = 0.0;
        for(item i : inventroy){
            totalvalue += i.getpricewithtax();
        }
        System.out.println("Total value of inventory: " + totalvalue);
    }


    //sort by price
    public static void sortbyprice(){
        Collections.sort(inventroy, new Comparator<item>() {
            public int compare(item i1, item i2) {
                return Double.compare(i1.getbaseprice(), i2.getbaseprice());
            }
        });
    }

    public static void main(String[] args) {
        additem(new perishable("P001", "Milk", 50.0, LocalDate.of(2024, 7, 1)));
        additem(new electronic("E001", "Laptop", 50000.0, 24));
        displayinventory();
        System.out.println("Search for item with ID P001:");
        searchbyid("P001");
        calculatetotalvalue();
        System.out.println("Sorting inventory by price:");
        sortbyprice();
        displayinventory();
    }
}
*/

//SCENARIO 2
import java.util.*;
class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // default book is available
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() { 
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean status) {
        this.isAvailable = status;
    }

    public void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void displayBooks() {
        for (Book b : books) {
            b.display();
            System.out.println();
        }
    }

    public void displayAvailableBooks() {
        for (Book b : books) {
            if (b.isAvailable()) {
                b.display();
                System.out.println();
            }
        }
    }

    public void borrowBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {

                if (b.isAvailable()) {
                    b.setAvailable(false);
                    System.out.println("You have borrowed: " + b.getTitle());
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {

                if (!b.isAvailable()) {
                    b.setAvailable(true);
                    System.out.println("You have returned: " + b.getTitle());
                } else {
                    System.out.println("This book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}

public class FL9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        lib.addBook(new Book("ISBN001", "The Great Gatsby", "F. Scott Fitzgerald"));
        lib.addBook(new Book("ISBN002", "To Kill a Mockingbird", "Harper Lee"));
        lib.addBook(new Book("ISBN003", "1984", "George Orwell"));

        while (true) {

            System.out.println("\n1. Display all books");
            System.out.println("2. Display available books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    lib.displayBooks();
                    break;

                case 2:
                    lib.displayAvailableBooks();
                    break;

                case 3:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowIsbn = sc.nextLine();
                    lib.borrowBook(borrowIsbn);
                    break;

                case 4:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnIsbn = sc.nextLine();
                    lib.returnBook(returnIsbn);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}