package rmi;

import java.rmi.*;

public interface hello extends Remote {
    String sayHello() throws RemoteException;
}