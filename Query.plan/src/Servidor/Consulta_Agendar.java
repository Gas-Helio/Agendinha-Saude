package Servidor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class Consulta_Agendar extends javax.swing.JFrame {

    int aux;
    String Id;
    
    public Consulta_Agendar(int x, String[] obj) {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CPFMedico = new javax.swing.JTextField();
        CPFPaciente = new javax.swing.JTextField();
        DataConsulta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AgendarConsulta = new javax.swing.JButton();
        CancelarConsulta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DataConsultaCalendar = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agendar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jLabel1.setText("CPF Médico:");

        jLabel5.setText("Horario:");

        AgendarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendar.png"))); // NOI18N
        AgendarConsulta.setText("Agendar");
        AgendarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendarConsultaActionPerformed(evt);
            }
        });

        CancelarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        CancelarConsulta.setText("Cancelar");
        CancelarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarConsultaActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF Paciente:");

        jLabel4.setText("Data:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPFPaciente)
                            .addComponent(DataConsulta)
                            .addComponent(CPFMedico)
                            .addComponent(DataConsultaCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AgendarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(CancelarConsulta)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPFMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CPFPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DataConsultaCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgendarConsulta)
                    .addComponent(CancelarConsulta))
                .addContainerGap())
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarConsultaActionPerformed
        dispose();
        new Consulta_Gerenciar().setVisible(true);
    }//GEN-LAST:event_CancelarConsultaActionPerformed

    private void AgendarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendarConsultaActionPerformed
        if (aux == 2) {
            Alterar();
            new Consulta_Gerenciar().setVisible(true);
        } else {
            Cadastrar();
            if (aux == 1) {
                new Consulta_Gerenciar().setVisible(true);
            }
        }
        dispose();
    }//GEN-LAST:event_AgendarConsultaActionPerformed

    private void Cadastrar() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String data = formato.format(DataConsultaCalendar.getDate());
        String[] coluna = {CPFMedico.getText(), CPFPaciente.getText(), data, DataConsulta.getText()};

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

            JOptionPane.showMessageDialog(null, "Agendado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }
    
    public void Alterar() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String data = formato.format(DataConsultaCalendar.getDate());
        String[] coluna = {CPFMedico.getText(), CPFPaciente.getText(), data, DataConsulta.getText()};

        bd.connection();

        String update = "UPDATE consulta SET Id_Med = ?, Id_Pac = ?, DataC = ?, Horario = ? WHERE Id = ?";

        try {
            PreparedStatement stm = bd.con.prepareStatement(update);

            stm.setString(1, coluna[0]);
            stm.setString(2, coluna[1]);
            stm.setString(3, coluna[2]);
            stm.setString(4, coluna[3]);
            stm.setInt(5, Integer.parseInt(Id));
            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "Alterado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão!!");
            ex.printStackTrace();
        }
    }
    
     public void Preencher(String[] obj) {
        AgendarConsulta.setText("Reagendar");
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alterar Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        CPFMedico.setText(obj[1]);
        CPFMedico.setEditable(false);
        CPFPaciente.setText(obj[2]);
        CPFPaciente.setEditable(false);
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Consulta_Agendar(0, null).setVisible(true);
        });
    }

    ConectaBanco bd = new ConectaBanco();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendarConsulta;
    private javax.swing.JTextField CPFMedico;
    private javax.swing.JTextField CPFPaciente;
    private javax.swing.JButton CancelarConsulta;
    private javax.swing.JTextField DataConsulta;
    private com.toedter.calendar.JDateChooser DataConsultaCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
