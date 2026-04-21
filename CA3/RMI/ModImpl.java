import java.rmi.*;
import java.rmi.server.*;

public class ModImpl extends UnicastRemoteObject implements ModInterface {

    public ModImpl() throws RemoteException {
        super();
    }

    public int findMod(int a, int b) throws RemoteException {
        System.out.println("Server computing: " + a + " % " + b);
        return a % b;
    }
}