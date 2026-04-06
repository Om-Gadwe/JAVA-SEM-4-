package rmi;

import java.rmi.*;
import java.rmi.server.*;

public class helloImpl extends UnicastRemoteObject implements hello {

    public helloImpl() throws RemoteException {}

    public String sayHello() throws RemoteException {
        return "Hello from RMI Server!";
    }
}