import java.rmi.*;

public interface ModInterface extends Remote {
    int findMod(int a, int b) throws RemoteException;
}