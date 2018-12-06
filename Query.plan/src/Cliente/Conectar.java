package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectar {

    Paciente_Objeto Pac;
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

    public void update(String msg, String tipo) throws IOException {
        try (Socket c = this.criarsock()) {

            try (PrintStream saida = new PrintStream(c.getOutputStream())) {
                String novo = "Alterar#" + msg + "#" + tipo;
                saida.println(novo);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso");
            }
        }
    }

    public void excluir(String msg, String tipo) throws IOException {
        try (Socket c = this.criarsock()) {

            try (PrintStream saida = new PrintStream(c.getOutputStream())) {
                String novo = "Excluir#" + msg + "#" + tipo;
                saida.println(novo);
                JOptionPane.showMessageDialog(null, "Excluído com sucesso");
            }
        }
    }

    public Paciente_Objeto RecebendoPacientes(String msg) throws IOException {
        try (Socket c = this.criarsock(); PrintStream saida = new PrintStream(c.getOutputStream())) {
            saida.println("Recuperar#" + msg + "#Paciente");

            ServerSocket ss = new ServerSocket(5001);
            Socket s = ss.accept();
            Scanner leitor = new Scanner(s.getInputStream());

            String linha = "";
            System.out.println("Oia ele aq");
            
            while (leitor.hasNext()) {
                linha += leitor.nextLine();
            }

            System.out.println(linha);
            String[] coluna = linha.split(";");

            Pac = new Paciente_Objeto(coluna[0], coluna[1], coluna[2], coluna[3], coluna[4], coluna[5], coluna[6]);
        } catch (IOException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Pac;
    }

    public ArrayList RecebendoMedicos(String msg) throws IOException {
        try (Socket c = this.criarsock(); PrintStream saida = new PrintStream(c.getOutputStream())) {
            saida.println("Recuperar#" + msg + "#Medico");
            Scanner s = new Scanner(c.getInputStream());
            String salvar = s.nextLine();

            String[] coluna = salvar.split(";");

            Med.add(new Object[]{
                coluna[0], coluna[1], coluna[3]
            });
        }
        return Med;
    }
}
