package Servidor;

import java.io.*;
import java.net.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class Servidor extends Thread {
    
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
            }
            
            if ("Recuperar".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    RecuperarPaciente(c, msg[1]);
                }
                if ("Medico".equals(msg[2])) {
                    RecuperarMedicos(c);
                }
                if ("Consulta".equals(msg[2])) {
                    RecuperarConsulta(c, msg[1]);
                }
                System.out.println("A resposta foi enviado Cliente!\n");
            }
            
            if ("Excluir".equals(msg[0])) {
                if ("Paciente".equals(msg[2])) {
                    ExcluirPaciente(msg[1]);
                }
                if ("Consulta".equals(msg[2])) {
                    ExcluirConsulta(msg[1]);
                }
            }
        }
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
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void AlterarPaciente(String up) {
        String[] coluna = up.split(";");
        
        bd.connection();
        
        String update = "UPDATE paciente SET Nome = ?, Idade = ?, Peso = ?, Altura = ?, Login = ?, Senha = ? WHERE CPF = ?";
        
        try {
            PreparedStatement stm = bd.con.prepareStatement(update);
            
            stm.setString(1, coluna[1]);
            stm.setString(2, coluna[2]);
            stm.setString(3, coluna[3]);
            stm.setString(4, coluna[4]);
            stm.setString(5, coluna[5]);
            stm.setString(6, coluna[6]);
            stm.setString(7, coluna[0]);
            stm.execute();
            stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RecuperarPaciente(Socket c, String msg) throws IOException, SQLException {
        String[] col = msg.split(";");
        System.out.println("Login: " + col[0] + "\nSenha: " + col[1]);
        bd.connection();
        bd.executaSQL("select * from paciente");
        
        try {
            bd.rs.first();
            PrintWriter output = new PrintWriter(c.getOutputStream());
            String bora = "";
            
            do {
                String Login = bd.rs.getString("Login");
                String Senha = bd.rs.getString("Senha");
                
                if (Login.equals(col[0]) && Senha.equals(col[1])) {
                    bora = bd.rs.getString("CPF") + ";"
                            + bd.rs.getString("Nome") + ";"
                            + bd.rs.getString("Idade") + ";"
                            + bd.rs.getString("Peso") + ";"
                            + bd.rs.getString("Altura") + ";"
                            + Login + ";"
                            + Senha;
                    
                    System.out.println("Retornando: " + bora);
                    break;
                }
            } while (bd.rs.next());
            
            output.println(bora);
            output.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirPaciente(String cod) {
        bd.connection();
        
        String sql = "DELETE FROM paciente WHERE CPF = " + cod;
        
        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            stm.execute();
            stm.close();
            
            ExcluirConPac(cod);
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirConPac(String cod) {
        bd.connection();
        
        String sql = "DELETE FROM consulta WHERE Id_Pac = " + cod;
        
        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            stm.execute();
            stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RecuperarMedicos(Socket c) throws IOException, SQLException {
        bd.connection();
        bd.executaSQL("select * from medico");
        
        try {
            bd.rs.first();
            PrintWriter output = new PrintWriter(c.getOutputStream());
            String bora = "";
            
            do {
                bora += bd.rs.getString("CPF") + ";"
                        + bd.rs.getString("Nome") + ";"
                        + bd.rs.getString("Especializacao") + "#";
                
            } while (bd.rs.next());
            
            System.out.println("Retornando: " + bora);
            output.println(bora);
            output.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void SalvarConsulta(String salvar) throws IOException {
        String[] coluna = salvar.split(";");
        System.out.println("Entrou pra salvar: " + salvar);
        
        bd.connection();
        
        String sql = "insert into consulta (Id_Med, Id_Pac, DataC, Horario) values (?, ?, ?, ?)";
        
        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            
            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            
            stm.execute();
            stm.close();
            System.out.println("É pra ter salvo.");
            
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void RecuperarConsulta(Socket c, String msg) throws IOException, SQLException {
        bd.connection();
        bd.executaSQL("select * from consulta where Id_Pac = " + msg);
        
        try {
            bd.rs.first();
            PrintWriter output = new PrintWriter(c.getOutputStream());
            String bora = "";
            
            do {
                bora += bd.rs.getInt("Id") + ";"
                        + bd.rs.getInt("Id_Med") + ";"
                        + bd.rs.getInt("Id_Pac") + ";"
                        + bd.rs.getString("DataC") + ";"
                        + bd.rs.getString("Horario") + "#";
                
            } while (bd.rs.next());
            
            System.out.println("Retornando: " + bora);
            output.println(bora);
            output.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirConsulta(String cod) {
        bd.connection();
        
        String sql = "DELETE FROM consulta WHERE Id = " + cod;
        
        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
