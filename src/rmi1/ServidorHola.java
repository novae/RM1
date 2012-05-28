
package rmi1;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
public class ServidorHola extends UnicastRemoteObject implements InterfazHola {
    public ServidorHola() throws RemoteException{
        super();
    }
    
}
