package Servidor;

import java.io.IOException;
import java.net.ServerSocket;

public class Servidor_Master {
    public Servidor_Master() throws IOException{
        
        new Servidor_Menu().setVisible(true);
        
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");

        while (true) {
            Servidor handler = new Servidor(servidor.accept());
            Thread t = new Thread(handler);
            t.start();
        }
    }
    
    public static void main(String[] args) throws IOException {
        new Servidor_Master();
    }
}
