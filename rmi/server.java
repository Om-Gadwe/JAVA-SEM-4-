package rmi;

import java.rmi.*;
import java.rmi.registry.*;

public class server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Naming.rebind("HelloService", new helloImpl());
            Naming.rebind("CalcService", new CalculatorImpl());
            Naming.rebind("FactService", new FactorialImpl());
            System.out.println("Server running (Hello + Calculator)...");
        }
        catch (Exception e){
            e.printStackTrace();                   
        }
    }
}