/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serv;

/**
 *
 * @author alice
 */
public class Chat {
    public static Conector conec;
    public static void main(String[] args) {
        Servidor server = new Servidor();
        server.setVisible(true);
    }
    
    public static void iniciaServer(){
        conec = new Conector(Integer.parseInt(Servidor.txtPuerto.getText()));
        conec.start();
    }
}
