package Servidor;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "com.mysql.jdbc.Driver";
    private String caminho = "jdbc:mysql://localhost/dipai";
    private String usuario = "root";
    private String senha = "";
    public Connection con;

    public void connection() {
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            System.out.println("Conectado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
        }
    }

    public void executaSQL(String SQL) {
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(SQL);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
        }
    }
}