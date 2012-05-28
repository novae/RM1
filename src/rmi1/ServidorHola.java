
package rmi1;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;
import javax.swing.JOptionPane;
public class ServidorHola extends UnicastRemoteObject implements InterfazHola {
    public ServidorHola() throws RemoteException{
        super();
    }
    public String diHola()throws RemoteException{
        return "Hola";
    }
    
    public static void main(String args[]){
        try{
            ServidorHola obj=new ServidorHola();
            Naming.rebind("/ServidorHola", obj);
            JOptionPane.showMessageDialog(null,"Objeto Registrado en el Servidor de Nombres");
        }
        catch(Exception e){
            System.err.println("ERROR: "+e);
            e.printStackTrace(System.out);
        }
    }
    
}
