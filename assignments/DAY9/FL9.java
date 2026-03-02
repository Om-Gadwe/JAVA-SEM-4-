package assignments.DAY9;
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
        System.out.println("Total value of inventory:");
        calculatetotalvalue();
        System.out.println("Sorting inventory by price:");
        sortbyprice();
        displayinventory();
    }
}
