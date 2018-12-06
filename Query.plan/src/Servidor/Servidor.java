package Servidor;

import java.io.*;
import java.net.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Servidor extends Thread {

    ConectaBanco bd = new ConectaBanco();
    ArrayList<Paciente_Objeto> pac = new ArrayList();
    Paciente_Objeto paci = new Paciente_Objeto();

    public Servidor(Socket c) throws IOException, SQLException {
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

            if ("Alterar".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    AlterarPaciente(msg[1]);
                }
                if ("Consulta".equals(msg[2])) {
                    SalvarConsulta(msg[1]);
                }
            }

            if ("Recuperar".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    RecuperarPaciente(c);
                }
                if ("Consulta".equals(msg[2])) {
                    SalvarConsulta(msg[1]);
                }
                System.out.println("A resposta foi enviado Cliente!\n");
            }
            
            if ("Excluir".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    ExcluirPaciente(msg[1]);
                }
                if ("Consulta".equals(msg[2])) {
                    SalvarConsulta(msg[1]);
                }
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

    public void AlterarPaciente(String up) {
        String[] coluna = up.split(";");

        bd.connection();

        String update = "UPDATE paciente SET Nome = ?, Idade = ?, Peso = ?, Altura = ?, Login = ?, Senha = ? WHERE CPF = ?";

        try {
            PreparedStatement stm = bd.con.prepareStatement(update);

            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setString(5, coluna[4]);
            stm.setString(6, coluna[5]);
            stm.setString(7, coluna[6]);
            stm.setString(0, coluna[0]);
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }

    public void RecuperarPaciente(Socket c) throws IOException, SQLException {
        int recebe = 0;
        PreparedStatement ps = bd.con.prepareStatement("SELECT count(*) as cont FROM paciente");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            recebe = rs.getInt("cont");
        }
        rs.close();
        ps.close();

        PrintWriter out = new PrintWriter(c.getOutputStream());
        out.println(recebe);

        bd.executaSQL("select * from paciente");

        try {
            bd.rs.first();

            do {
                out = new PrintWriter(c.getOutputStream());
                out.println(bd.rs.getInt("Id") + ";"
                        + bd.rs.getString("CPF") + ";"
                        + bd.rs.getString("Nome") + ";"
                        + bd.rs.getString("Idade") + ";"
                        + bd.rs.getString("Peso") + ";"
                        + bd.rs.getString("Altura") + ";"
                        + bd.rs.getString("Login") + ";"
                        + bd.rs.getString("Senha"));

            } while (bd.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirPaciente(String cod) {
        bd.connection();

        String sql = "DELETE FROM paciente WHERE CPF = '" + cod + "'";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SalvarConsulta(String salvar) throws IOException {
        String[] coluna = salvar.split(";");

        bd.connection();

        String sql = "insert into consultas (CPFM, CPFP, DataC, Horario) values (?, ?, ?, ?)";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);

            stm.setString(0, coluna[0]);
            stm.setString(1, coluna[1]);
            stm.setString(2, coluna[2]);
            stm.setString(3, coluna[3]);

            stm.execute();
            stm.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
        }
    }

    public static ServerSocket servidor;

//    public static void main(String[] args) throws IOException, SQLException {
//        servidor = new ServerSocket(12345);
//        System.out.println("Porta 12345 aberta!");
//
//        while (true) {
//            Servidor handler = new Servidor(servidor.accept());
//            Thread t = new Thread(handler);
//            t.start();
//        }
//    }
}
