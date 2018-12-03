package Cliente;

import Servidor.ConectaBanco;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conectar {

    ArrayList Pac = new ArrayList();
    ArrayList Med = new ArrayList();

    public Conectar() throws IOException {
        super();
    }

    public Socket criarsock() throws IOException {
        Socket c = new Socket("127.0.0.1", 12345);
        System.out.println("O cliente se conectou ao servidor!");
        return c;
    }

    public void salvar(String msg, String tipo) throws IOException {
        try (Socket c = this.criarsock()) {

            try (PrintStream saida = new PrintStream(c.getOutputStream())) {
                String novo = "Salvar#" + msg + "#" + tipo;
                saida.println(novo);
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
            }
        }
    }

    public ArrayList RecebendoMedicos(String msg) throws IOException {
        try (Socket c = this.criarsock(); PrintStream saida = new PrintStream(c.getOutputStream())) {
            saida.println("Recuperar#" + msg + "#Medico");
            Scanner s = new Scanner(c.getInputStream());
            String salvar = s.nextLine();

            String[] coluna = salvar.split(";");

            Pac.add(new Object[]{
                coluna[0], coluna[1], coluna[3]
            });
        }
        return Med;
    }
}
