package rmi;

import java.rmi.*;
import java.rmi.registry.*;

public class server {
    public static void main(String[] args) {
        try {
            helloImpl obj = new helloImpl();

            LocateRegistry.createRegistry(1099); // start registry
            Naming.rebind("HelloService", obj);

            System.out.println("Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}