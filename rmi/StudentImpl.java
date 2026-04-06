package rmi;

import java.rmi.*;
import java.rmi.server.*;

public class StudentImpl extends UnicastRemoteObject implements Student {

    public StudentImpl() throws RemoteException {}

    public String getStudent(int roll) throws RemoteException {

        if (roll == 1)
            return "Roll:1 Name: Om Branch: IT";

        else if (roll == 2)
            return "Roll:2 Name: Rahul Branch: CS";

        else if (roll == 3)
            return "Roll:3 Name: Sneha Branch: AIDS";

        else
            return "Student not found";
    }
}