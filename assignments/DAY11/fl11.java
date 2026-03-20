package assignments.DAY11;
/*Create an abstract class payment with attributes transactionid and amount.
abstract class payment{
    private String transactionid;
    private double amount;

    public payment(String transactionid, double amount) {
        this.transactionid = transactionid;
        this.amount = amount;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public double getAmount() {
        return amount;
    }

    abstract double processpayment();
}

class creditcard extends payment{
    public creditcard(String transactionId, double amount) { 
        super(transactionId, amount); 
    }

    public double processpayment(){
        double fee = getAmount() * 0.02;
        return getAmount() + fee;
    }
}

class upi extends payment{
    public upi(String transactionId, double amount) {
        super(transactionId, amount); 
    }

    public double processpayment(){
        return getAmount();
    }
}

class totalpayment {
    public static double totalamount(payment[] arr){
        double total = 0;
        for (payment p : arr){
            total+= p.processpayment();
        }
        return total;
    }
}

public class fl11 {
    public static void main(String[] args) {
        payment p1 = new upi("ABC001", 1000);
        payment p2 = new creditcard("ABC002",2000);
        System.out.println(p1.processpayment());
        System.out.println(p2.processpayment());
        payment[] arr = {p1, p2};

        double total = totalpayment.totalamount(arr);
        System.out.println("Total amount: " + total);
    }
*/

/*Create an abstract class device with
abstract class device{
    public String brand;
    abstract void turnon();
}

interface remotecontrol{
    void connecttowifi();
}

interface powersaving{
    String getenergyrating();
}

class smarttv extends device implements remotecontrol, powersaving{
    public smarttv(String brand){
        this.brand = brand;
    }
    public void turnon(){
        System.out.println(brand + " TV is booting up...");
    }
    public void connecttowifi(){
        System.out.println("Connecting to Home_5G...");
    }
    public String getenergyrating(){
        return "A++";
    }
}

class electrickettle extends device{

    public electrickettle(String brand){
        this.brand = brand;
    }

    public void turnon(){
        System.out.println(brand + " Kettle is heating water...");
    }
}

public class fl11{
    public static void main(String[] args){
        System.out.println("USING OBJECT OF SMART TV AND REFERNCE OF DEVICE");
        device d = new smarttv("Sony");
        d.turnon();
        System.out.println("USING OBJECT OF SMART TV AND REFERNCE OF REMOTE CONTROL");
        remotecontrol r = new smarttv("LG");
        r.connecttowifi();
        System.out.println("USING OBJECT OF SMART TV AND REFERNCE OF POWER SAVING");
        powersaving p = new smarttv("Samsung");
        System.out.println("Energy Rating: " + p.getenergyrating());
        System.out.println("USING OBJECT OF ELECTRIC KETTLE AND REFERNCE OF DEVICE");
        device k = new electrickettle("Philips");
        k.turnon();
    }
}
*/

/*Create an abstract class transport with attributes trackingid and destination.
import java.util.ArrayList;
abstract class Transport {
    String trackingId;
    String destination;
    public Transport(String trackingId, String destination) {
        this.trackingId = trackingId;
        this.destination = destination;
    }
    abstract void dispatch();
}
interface GPS {
    String getCoordinates();
}
interface Autonomous {
    void selfNavigate();
}
class Truck extends Transport {
    public Truck(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Truck " + trackingId + " leaving for " + destination);
    }
}
class CargoShip extends Transport {
    public CargoShip(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Cargo Ship " + trackingId + " sailing to " + destination);
    }
}
class DeliveryDrone extends Transport implements GPS, Autonomous {

    public DeliveryDrone(String trackingId, String destination) {
        super(trackingId, destination);
    }

    public void dispatch() {
        System.out.println("Drone" + trackingId+"going to" + destination);
    }

    public String getCoordinates(){
        return "40 N,74 W";
    }

    public void selfNavigate(){
        System.out.println("Drone navigating");
    }
}
public class fl11 {
    public static void main(String[] args) {
        // TC1
        Transport t = new DeliveryDrone("D101", "New York");
        t.dispatch();
        // TC2
        GPS g = new DeliveryDrone("D101", "New York");
        System.out.println(g.getCoordinates());
        // TC3
        if (t instanceof GPS) {
            System.out.println("This transport supports GPS");
        } else {
            System.out.println("No GPS support");
        }
        ArrayList<Transport> list = new ArrayList<>();
        list.add(new Truck("T201", "Delhi"));
        list.add(new CargoShip("C301", "Mumbai"));
        list.add(new DeliveryDrone("D102", "Pune"));
        for (Transport X : list) {
            X.dispatch();
        }
    }
}
*/

abstract class library{
    private String itemid;
    private String title;
    protected boolean isReserved = false;
    public library(String itemid, String title){
        this.itemid = itemid;
        this.title = title;
    }
    void showdetails(){
        System.out.println("Item ID: " + itemid);
        System.out.println("Title: " + title);
    }
    public String getTitle(){
        return title;
    }
    abstract void processloan();
}

class textbook extends library{
    public textbook(String itemid, String title){
        super(itemid, title);
    }
    void processloan(){
        if (!isReserved){
            isReserved = true;
            System.out.println("Textbook '" + getTitle() + "' issued for 14 days.");
        } else {
            System.out.println("Error: '" + getTitle() + "' is already on loan.");
        }
    }
}
class research extends library{
    public research(String itemid, String title){
        super(itemid, title);
    }
    void processloan(){
        System.out.println("Generating secure PDF download link...");
    }
}
public class fl11{
    public static void main(String[] args){
        textbook t = new textbook("B101", "Java Core");
        t.processloan();  
        t.processloan();  
        research r = new research("R99", "AI Ethics");
        r.processloan();
    }
}



