package rmi;

import java.rmi.*;

public interface Student extends Remote {
    String getStudent(int roll) throws RemoteException;
}