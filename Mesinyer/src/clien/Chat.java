/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clien;

/**
 *
 * @author alice
 */
public class Chat {
    /*Creamos una nueva conexion*/
    public static Conector conec;
    public static void main(String[] args) {
        Cliente clien = new Cliente();
        /*Sea visible el JFrame*/
        clien.setVisible(true);
    }
    
    public static void iniciaCliente(String ip, int puerto){
        /**
        *Iniciamos el hilo
        * */
        conec = new Conector(ip, puerto);
        conec.start();
    
    }
}
