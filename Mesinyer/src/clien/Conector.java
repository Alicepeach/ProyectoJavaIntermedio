/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clien;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author alice
 */
public class Conector extends Thread{
    private BufferedReader entrada;
    private Socket sckt;
    private ServerSocket  servSckt;
    private InputStreamReader inSckt;
    private DataOutputStream salida;
    private PrintStream ps;
    
    public Conector(String ip, int puerto){
        try{
            sckt  = new Socket(ip, puerto);
            //Recibe los datos del socket
            inSckt =  new InputStreamReader(sckt.getInputStream());
            entrada = new BufferedReader(inSckt);
            salida = new DataOutputStream(sckt.getOutputStream());            
            /*Preparamos texto para enviar*/
            salida.writeUTF("Conexion segura");
            ps = new PrintStream(sckt.getOutputStream());
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha fallado la conexión");
        }
    }
    
    //@Override
    public void run(){
      String cadena = "";
        while(!cadena.equals("quit")){
                try{
                    cadena = entrada.readLine();
                    Cliente.txtConversacion.setText(Cliente.txtConversacion.getText() + "\n" + cadena);
                }catch(Exception e){}
        }   
    }
    
    public void enviarZumbido(String msg){
        try {
            salida.writeUTF(msg+"\n");
        } catch (Exception e) {
        }
    }
   
    public void desconectar(){
        try {
            sckt.close();
            servSckt.close();
        } catch (Exception e) {
        }
    }   
}
