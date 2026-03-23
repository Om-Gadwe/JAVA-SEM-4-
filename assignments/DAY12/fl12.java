package assignments.DAY12;
// SCENARIO BASED QUESTION #3
/* Create an abstract class named "Plan" with the following properties and methods:
abstract class plan{
    private String patientname;
    private double basefee;
    public plan(String patientname, double basefee) {
        this.patientname = patientname;
        this.basefee = basefee;
    }
    public String getPatientname() {
        return patientname;
    }
    public double getBasefee() {
        return basefee;
    }
    public abstract double calculatefee();
}
class silverplan extends plan{
    public silverplan(String patientname, double basefee) {
        super(patientname, basefee);
    }
    @Override
    public double calculatefee() {
        double x = getBasefee() + (getBasefee() * 0.15); // Silver plan adds 15% to the base fee
        return x;
    }
}
class goldplan extends plan{
    public goldplan(String patientname, double basefee) {
        super(patientname, basefee);
    }
    @Override
    public double calculatefee() {
        System.out.println("Calculating fee for Gold Plan... and adding a discount of $20.00 as wellness discount");   
        double y = getBasefee() + (getBasefee() * 0.10);
        return y - 20.00; // Gold plan adds 10% to the base fee
    }
}
public class fl12 {
    public static void main(String[] args) {
        plan s = new silverplan("John", 100.00);
        plan g = new goldplan("Sophia", 200.00);
        plan g2  = new goldplan("Max", 50.00);
        
        System.out.println("Patient: " + s.getPatientname() + ", Silver Plan Fee: $" + s.calculatefee());
        System.out.println("Patient: " + g.getPatientname() + ", Gold Plan Fee: $" + g.calculatefee());
        System.out.println("Patient: " + g2.getPatientname() + ", Gold Plan Fee: $" + g2.calculatefee());
    }
}
*/


/*
abstract class robot{ 
    private String batteryid;
    protected double chargelevel;
    public robot(String batteryid, double chargelevel) {
        this.batteryid = batteryid;
        this.chargelevel = chargelevel;
    }
    public String getBatteryid() {
        return batteryid;
    }
    public double getChargelevel() {
        return chargelevel;
    }
    public void reportstatus() {
        System.out.println("Battery ID: " + batteryid + ", Charge Level: " + chargelevel + "%");
    }
    public abstract void performtask();
}
class dronerobot extends robot{
    public dronerobot(String batteryid, double chargelevel) {
        super(batteryid, chargelevel);
    }
    public void performtask() {
        if(chargelevel < 0){
            System.out.println("Battery level cannot be negative!");
            return;
        }
        if (chargelevel < 15) {
            System.out.println("Low battery!");
        } else {
            chargelevel -= 15;
            System.out.println("Drone task completed at 2x speed.");
        }
    }
}
class groundrobot extends robot{
    public groundrobot(String batteryid, double chargelevel) {
        super(batteryid, chargelevel);
    }
    public void performtask() {
        if(chargelevel < 0){
            System.out.println("Battery level cannot be negative!");
            return;
        }
        if (chargelevel < 5) {
            System.out.println("Low battery!");
        } else {
            System.out.println("Performing surface check...");
            chargelevel -= 5;
            System.out.println("Ground task completed.");
        }
    }
}

public class fl12{
    public static void main(String[] args){
        robot[] fleet = {
            new dronerobot("D-1", 20),
            new groundrobot("G-5", 10),
            new dronerobot("D-2", 10),
            new groundrobot("G-6", -10)
        };
        for (robot r : fleet){
            r.performtask();
            r.reportstatus();
        }
    }
}
*/

abstract class media{
    private String title;
    private int duration;
    protected boolean ispremium;
    public media(String title, int duration, boolean ispremium) {
        this.title = title;
        this.duration = duration;
        this.ispremium = ispremium;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public boolean isIspremium() {
        return ispremium;
    }
    public void getdetails() {
        System.out.println("Title: " + title + ", Duration: " + duration + " minutes, Premium: " + ispremium);
    }
    public abstract void playcontent();
}
class movie extends media{
    public movie(String title, int duration, boolean ispremium) {
        super(title, duration, ispremium);
    }
    public void playcontent() {
        if (ispremium) {
            System.out.println("Verifiying subscription....Playing movie: " + getTitle());
        } else {
            System.out.println("Playing free movie: " + getTitle());
        }
    }
}
class podcast extends media{
    public podcast(String title, int duration) {
        super(title, duration, false);
    }
    public void playcontent() {
        System.out.println("Loading advertisement...");
        System.out.println("Playing podcast: " + getTitle() + " for " + getDuration() + " minutes.");
    }
}
public class fl12{
    public static void main(String[] args){
        media[] library = {
            new movie("Inception", 148, true),
            new podcast("Tech Talk", 30),
            new movie("Free Guy", 115, false),
        };
        for (media m : library){
            m.getdetails();
            m.playcontent();
        }
    }
}