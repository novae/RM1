
package rmi1;
import java.rmi.Naming;
import javax.swing.JOptionPane;

public class ClienteHola {
    public static void main(String[]args){
        try{
            InterfazHola obj= (InterfazHola)Naming.lookup("/ServidorHola");
            String mensage=obj.diHola();
            JOptionPane.showMessageDialog(null,"Mensage obtenido del objeto remoto: "+mensage);
        }
        catch(Exception e){
            System.out.println("Error: "+e);
            e.printStackTrace(System.out);
        }
    }
}
