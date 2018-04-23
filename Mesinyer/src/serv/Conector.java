/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */

/*
*Extiende de Hilo
*/
public class Conector extends Thread {
    
    private Socket sckt;
    private ServerSocket serSckt;
    private InputStreamReader entradaSckt;
    private DataOutputStream salida;
    private BufferedReader entrada;
    private ServerSocket  servSckt;
    private InputStreamReader inSckt;
    private PrintStream ps;
    
    /*
    *
    */
    public Conector(int puerto){
        try{
           serSckt = new ServerSocket(puerto);
           sckt = serSckt.accept();
            
           entradaSckt = new InputStreamReader(sckt.getInputStream());
           entrada = new BufferedReader(entradaSckt);
           salida = new DataOutputStream(sckt.getOutputStream());
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha fallado la conexión");
        }
    }
    
}
