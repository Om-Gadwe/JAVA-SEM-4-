package rmi;

import java.rmi.*;
import java.rmi.server.*;

public class FactorialImpl extends UnicastRemoteObject implements Factorial {

    public FactorialImpl() throws RemoteException {}

    public int fact(int n) throws RemoteException {
        int res = 1;
        for(int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}