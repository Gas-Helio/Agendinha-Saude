package Servidor;

import java.io.*;
import java.net.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Servidor extends Thread {

    ConectaBanco bd = new ConectaBanco();

    public Servidor(Socket c) throws IOException {
        String salvar;

        System.out.println("\nNova conexão com o cliente " + c.getInetAddress().getHostAddress());

        try (Scanner s = new Scanner(c.getInputStream())) {

            salvar = s.nextLine();
            String[] msg = salvar.split("#");
            System.out.println("Operação: " + msg[0]);
            System.out.println("Mensagem: " + msg[1]);
            System.out.println("Tipo: " + msg[2]);

            if ("Salvar".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    SalvarPaciente(msg[1]);
                }
                if ("Consulta".equals(msg[2])) {
                    SalvarConsulta(msg[1]);
                }
            }

            if ("Recuperar".equals(msg[0])) {
                PrintStream ps = new PrintStream(c.getOutputStream());
                String envia = Pegar(msg[1], msg[2]);
                ps.println(envia);
                System.out.println("A resposta foi enviado Cliente!\n" + envia);
            }
        }
    }

    public String Pegar(String cod, String tip) throws FileNotFoundException, IOException {
        String recebe = null;
        File Arquivo = new File("Opa.txt");

        FileReader reader = new FileReader(Arquivo);
        try (BufferedReader input = new BufferedReader(reader)) {
            String[] aux;

            String linha = input.readLine();
            while (linha != null) {
                aux = linha.split(";");

                if (aux[0].equals(cod)) {
                    recebe = linha;
                    break;
                }

                linha = input.readLine();
            }
        }
        return recebe;
    }

    private void SalvarPaciente(String salvar) throws IOException {
        String[] coluna = salvar.split(";");

        bd.connection();

        String sql = "insert into paciente (CPF, Nome, Idade, Peso, Altura, Login, Senha) values (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setString(5, coluna[4]);
            stm.setString(6, coluna[5]);
            stm.setString(7, coluna[6]);

            stm.execute();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
        }
    }

    private void SalvarConsulta(String salvar) throws IOException {
        String[] coluna = salvar.split(";");

        bd.connection();

        String sql = "insert into consultas (id, CPFM, CPFP, DataC, Horario) values (?, ?, ?, ?, ?)";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(0, coluna[0]);
            stm.setString(1, coluna[1]);
            stm.setString(2, coluna[2]);
            stm.setString(3, coluna[3]);
            stm.setString(4, coluna[4]);

            stm.execute();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
        }
    }

//    public static void main(String[] args) throws IOException {
//        ServerSocket servidor = new ServerSocket(12345);
//        System.out.println("Porta 12345 aberta!");
//
//        while (true) {
//            Servidor handler = new Servidor(servidor.accept());
//            Thread t = new Thread(handler);
//            t.start();
//        }
//    }
}
