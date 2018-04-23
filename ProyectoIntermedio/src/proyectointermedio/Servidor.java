/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointermedio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.ArrayList;
/**
 *
 * @author emanuel
 */
public class Servidor extends Thread{
    private PrintStream ps;
    private String nombreCliente;
    private BufferedReader entrada;
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private Socket s;
    
    public Servidor(Socket s) throws IOException{
        this.s = s;
        entrada = new BufferedReader(new InputStreamReader(s.getInputStream()));
        nombreCliente = s.getInetAddress().getCanonicalHostName();
        System.out.println("Conexion aceptada desde " + s.getRemoteSocketAddress());
    }
    
    
    public static void llenarLista(Cliente c){
        clientes.add(c);
    }
    
    private void imprimirLista(){
        for(Cliente c: clientes){
            System.out.println(c);
        }
    }
    
    private void enviarTodos(String cadena){
        for(Cliente c: clientes){
            c.getSocket()
        }
    }
    
    public void enviar(String mensaje) throws IOException{
        ps.println("Servidor dice: " + mensaje);
    }
    
    public String recibir() throws IOException{
        String str = entrada.readLine();
        return str;
    }
    
    public void cerrar() throws IOException{
        entrada.close();
    }
    
    @Override
    public void run(){      
        try {
            String cadena = "";
                while(!cadena.equals("quit")){
                cadena = recibir();
                //System.out.println(nombreCliente + " dice: " + cadena);
                if(cadena.equals("add")){
                System.out.println("Cliente nuevo agregado: " + nombreCliente);
                //System.out.println(cadena);
                        while(!cadena.equals("quit")){
                                cadena = recibir();
                                if (cadena.equals("list")){
                                    System.out.println("Imprimiendo clientes...");
                                    imprimirLista();
                                }
                                if (cadena.equals("text")){
                                    cadena = recibir();
                                    System.out.println(nombreCliente + " dice: " + cadena);
                                    
                                
                                }
                                if (cadena.equals("text_to")){
                                    System.out.println("Usuario: ");
                                    cadena = recibir();
                                    String user_to = cadena;
                                    //Buscar en la lista de sockets el socket que tenga ese nombre
                                    //Implementar cliente-cliente
                            }
                         }
                    }
                }
                cerrar();
                System.out.println(nombreCliente + " ha salido del chat");
        } catch (IOException ioe) {
            System.out.println("Se cerro la conexion con " + nombreCliente);
        }
        finally{
            try {
                cerrar();
            } catch (IOException ioe) {}
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        ServerSocket ss;
        ss = new ServerSocket(0);
        System.out.println("Servidor aceptando conexiones en el puerto: " + ss.getLocalPort());
        
        while(true){
            Socket cliente = ss.accept();
            Servidor hilo = new Servidor(cliente);
            hilo.start();
        }
    }
}
