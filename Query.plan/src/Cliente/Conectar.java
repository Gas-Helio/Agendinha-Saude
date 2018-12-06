package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conectar {

    ArrayList<Paciente_Objeto> Pac = new ArrayList();
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

    public ArrayList<Paciente_Objeto> RecebendoPacientes() throws IOException {
        try (Socket c = this.criarsock(); PrintStream saida = new PrintStream(c.getOutputStream())) {
            saida.println("Recuperar# opa #Paciente");

            Scanner s = new Scanner(c.getInputStream());
            String salvar = s.nextLine();
            System.out.println("Eita: " + salvar);
            int cont = Integer.parseInt(salvar);

            for (int x = 0; x < cont; x++) {
                s = new Scanner(c.getInputStream());
                salvar = s.nextLine();
                System.out.println("Opa: " + salvar);

                String[] coluna = salvar.split(";");
                Med.add(new Paciente_Objeto(Integer.parseInt(coluna[0]), coluna[1], coluna[2], coluna[3], coluna[4], coluna[5], coluna[6], coluna[7]));
            }
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
