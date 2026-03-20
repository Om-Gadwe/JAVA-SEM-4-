package assignments.DAY10;
/* 
class account{
    double balance;
    void calculateinterest(){
        System.out.println("calculating interest");
        balance=balance+balance*0.02;
    }
}
class savingacc extends account{
    void calculateinterest(){
        System.out.println("calculating interest for saving account");
        balance=balance+balance*0.04;
        if(balance>50000){
            System.out.println("adding a loyalty bonus of 500");
            balance=balance+500;
        }
    }
}
class fixedeposit extends account{
    void calculateinterest(){
        System.out.println("calculating interest for fixed deposit");
        double x = balance*0.02;
        balance=balance+balance*0.04;
        if(balance>50000){
            System.out.println("adding a loyalty bonus of 500");
            balance=balance+500;
        }
        balance = balance+x;
    }
}
public class fl10 {
    public static void main(String[] args) {
        savingacc sa=new savingacc();
        sa.balance=10000;
        sa.calculateinterest();
        System.out.println("balance in saving account: "+sa.balance);
        savingacc s=new savingacc();
        s.balance=60000;
        s.calculateinterest();
        System.out.println("balance in saving account: "+s.balance);
        fixedeposit fd=new fixedeposit();
        fd.balance=60000;
        fd.calculateinterest();
        System.out.println("balance in fixed deposit: "+fd.balance);
    }
}
*/

class employee{
    String name;
    double salary;
    void calculatesalary(){
        System.out.println("calculating bonus");
        salary=salary+salary*0.05;
    }
}
class manager extends employee{
    void calculatesalary(){
        super.calculatesalary();
        System.out.println("adding a fixed bonus of 2000 for manager");
        salary=salary+2000;
    }
}
class executive extends manager{
    void calculatesalary(){
        double x =salary*0.1;
        super.calculatesalary();
        System.out.println("adding a 10% bonus for executive");
        salary = salary + x;
    }
}
public class fl10 {
    public static void main(String[] args) {
        manager m=new manager();
        m.name="John";
        m.salary=10000;
        m.calculatesalary();
        System.out.printf("salary of manager %s is: $%.2f%n", m.name, m.salary);
        executive e=new executive();
        e.name="Alice";
        e.salary=10000;
        e.calculatesalary();
        System.out.printf("salary of executive %s is: $%.2f%n", e.name, e.salary);
    }
}
