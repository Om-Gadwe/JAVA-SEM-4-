import java.rmi.*;
import java.rmi.registry.*;

public class ModServer {
    public static void main(String[] args) {
        try {
            ModImpl obj = new ModImpl();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/ModService", obj);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}