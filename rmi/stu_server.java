package rmi;

import java.rmi.*;
import java.rmi.registry.*;

public class stu_server {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            Naming.rebind("StudentService", new StudentImpl());

            System.out.println("Student Server running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}