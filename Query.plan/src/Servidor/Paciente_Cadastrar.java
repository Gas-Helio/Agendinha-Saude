package Servidor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author raahp
 */
public class Paciente_Cadastrar extends javax.swing.JFrame {

    int aux;
    String Id;

    public Paciente_Cadastrar(int x, String[] obj) {
        aux = x;

        initComponents();
        if (aux == 2) {
            Id = obj[0];
            Preencher(obj);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        NomeCadastroUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CPFCadastroUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IdadeCadastroUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PesoCadastroUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AlturaCadastroUsuario = new javax.swing.JTextField();
        ButaoCadastrarUsuario = new javax.swing.JButton();
        ButaoCancelarCadastroUsuario = new javax.swing.JButton();
        LoginCadastroUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SenhaCadastroUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 236, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel2.setText("Nome: ");

        jLabel1.setText("CPF:");

        jLabel4.setText("Nascimento:");

        jLabel5.setText("Peso:");

        jLabel6.setText("Altura:");

        ButaoCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/success.png"))); // NOI18N
        ButaoCadastrarUsuario.setText("Cadastrar");
        ButaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        ButaoCancelarCadastroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        ButaoCancelarCadastroUsuario.setText("Cancelar");
        ButaoCancelarCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoCancelarCadastroUsuarioActionPerformed(evt);
            }
        });

        jLabel7.setText("Login:");

        jLabel8.setText("Senha:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButaoCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(ButaoCancelarCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SenhaCadastroUsuario)
                            .addComponent(LoginCadastroUsuario)
                            .addComponent(AlturaCadastroUsuario)
                            .addComponent(PesoCadastroUsuario)
                            .addComponent(IdadeCadastroUsuario)
                            .addComponent(NomeCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(CPFCadastroUsuario))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NomeCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CPFCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IdadeCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PesoCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlturaCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaCadastroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButaoCadastrarUsuario)
                    .addComponent(ButaoCancelarCadastroUsuario))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoCadastrarUsuarioActionPerformed
        if (aux == 2) {
            Alterar();
            new Paciente_Gerenciar().preencherTabela();
        } else {
            Cadastrar();
            if (aux == 1) {
                new Paciente_Gerenciar().preencherTabela();
            }
        }
        dispose();
    }//GEN-LAST:event_ButaoCadastrarUsuarioActionPerformed

    private void ButaoCancelarCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoCancelarCadastroUsuarioActionPerformed
        dispose();
        if (aux == 1 || aux == 2) {
            new Paciente_Gerenciar().setVisible(true);
        }
    }//GEN-LAST:event_ButaoCancelarCadastroUsuarioActionPerformed

    public void Preencher(String[] obj) {
        ButaoCadastrarUsuario.setText("Alterar");
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        CPFCadastroUsuario.setText(obj[1]);
        NomeCadastroUsuario.setText(obj[2]);
        IdadeCadastroUsuario.setText(obj[3]);
        PesoCadastroUsuario.setText(obj[4]);
        AlturaCadastroUsuario.setText(obj[5]);
        LoginCadastroUsuario.setText(obj[6]);
        SenhaCadastroUsuario.setText(obj[7]);
    }

    private void Cadastrar() {
        String[] coluna = {
            CPFCadastroUsuario.getText(),
            NomeCadastroUsuario.getText(),
            IdadeCadastroUsuario.getText(),
            PesoCadastroUsuario.getText(),
            AlturaCadastroUsuario.getText(),
            LoginCadastroUsuario.getText(),
            SenhaCadastroUsuario.getText()
        };
        
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

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }

    public void Alterar() {
        String[] coluna = {
            CPFCadastroUsuario.getText(),
            NomeCadastroUsuario.getText(),
            IdadeCadastroUsuario.getText(),
            PesoCadastroUsuario.getText(),
            AlturaCadastroUsuario.getText(),
            LoginCadastroUsuario.getText(),
            SenhaCadastroUsuario.getText()
        };

        bd.connection();

        String update = "UPDATE paciente SET CPF = ?, Nome = ?, Idade = ?, Peso = ?, Altura = ?, Login = ?, Senha = ? WHERE Id = ?";

        try {
            PreparedStatement stm = bd.con.prepareStatement(update);

            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setString(5, coluna[4]);
            stm.setString(6, coluna[5]);
            stm.setString(7, coluna[6]);
            stm.setInt(8, Integer.parseInt(Id));
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Paciente_Cadastrar(0, null).setVisible(true);
        });
    }

    ConectaBanco bd = new ConectaBanco();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaCadastroUsuario;
    private javax.swing.JButton ButaoCadastrarUsuario;
    private javax.swing.JButton ButaoCancelarCadastroUsuario;
    private javax.swing.JTextField CPFCadastroUsuario;
    private javax.swing.JTextField IdadeCadastroUsuario;
    private javax.swing.JTextField LoginCadastroUsuario;
    private javax.swing.JTextField NomeCadastroUsuario;
    private javax.swing.JTextField PesoCadastroUsuario;
    private javax.swing.JTextField SenhaCadastroUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
