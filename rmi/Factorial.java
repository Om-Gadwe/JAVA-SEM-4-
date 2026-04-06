package rmi;

import java.rmi.*;

public interface Factorial extends Remote {
    int fact(int n) throws RemoteException;
}