package rmi;
import java.rmi.*;
public class client {
    public static void main(String[] args) {
        try {
            hello obj = (hello) Naming.lookup("rmi://localhost/HelloService");

            String msg = obj.sayHello();
            System.out.println("Message from server: " + msg);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}