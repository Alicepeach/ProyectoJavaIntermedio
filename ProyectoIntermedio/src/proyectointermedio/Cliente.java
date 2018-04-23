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
import java.net.Socket;

/**
 *
 * @author David Silva
 */
public class Cliente {

    private PrintStream ps;
    private final Socket s;

    public PrintStream getPs() {
        return ps;
    }
    
    public Socket getSocket() {
        return this.s;
    }
    
    public void setPs(PrintStream ps) {
        this.ps = ps;
    }

    public static BufferedReader getBr() {
        return br;
    }

    public static void setBr(BufferedReader br) {
        Cliente.br = br;
    }
    private final String nombre;
    private static BufferedReader br;

    public void conectar() throws IOException {

        ps = new PrintStream(s.getOutputStream());
        br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String cadena;     
    }

    public void enviar(String s) throws IOException {
        ps.println(s);
    }

    public void cerrar() {
        ps.close();
    }

    public Cliente(Socket s, String nombre) {
        this.s = s;
        this.nombre = nombre;
    }
    
    
}
