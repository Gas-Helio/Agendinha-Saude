package Servidor;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Patrick
 */
public class Consulta_Gerenciar extends javax.swing.JFrame {

    public Consulta_Gerenciar() {
        initComponents();
        bd.connection();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        CadastrarConsulta = new javax.swing.JButton();
        AlterarConsulta = new javax.swing.JButton();
        ExcluirConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaConsulta = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciar Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        CadastrarConsulta.setText("Cadastrar");
        CadastrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarConsultaActionPerformed(evt);
            }
        });

        AlterarConsulta.setText("Alterar");
        AlterarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarConsultaActionPerformed(evt);
            }
        });

        ExcluirConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        ExcluirConsulta.setText("Excluir");
        ExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirConsultaActionPerformed(evt);
            }
        });

        TabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Médico", "Paciente", "Data", "Horário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaConsulta);
        if (TabelaConsulta.getColumnModel().getColumnCount() > 0) {
            TabelaConsulta.getColumnModel().getColumn(0).setResizable(false);
            TabelaConsulta.getColumnModel().getColumn(0).setPreferredWidth(1);
            TabelaConsulta.getColumnModel().getColumn(1).setResizable(false);
            TabelaConsulta.getColumnModel().getColumn(1).setPreferredWidth(200);
            TabelaConsulta.getColumnModel().getColumn(2).setResizable(false);
            TabelaConsulta.getColumnModel().getColumn(2).setPreferredWidth(200);
            TabelaConsulta.getColumnModel().getColumn(3).setResizable(false);
            TabelaConsulta.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CadastrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(AlterarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(ExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CadastrarConsulta)
                    .addComponent(AlterarConsulta)
                    .addComponent(ExcluirConsulta))
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
                .addContainerGap(39, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlterarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarConsultaActionPerformed
        int selecionados = TabelaConsulta.getSelectedRow();
        if (selecionados >= 0) {
            int cod = modeloTable.getCod(selecionados);

            bd.connection();
            bd.executaSQL("SELECT * FROM consulta WHERE Id = '" + cod + "'");

            try {
                bd.rs.first();

                String[] obj = new String[]{
                    Integer.toString(bd.rs.getInt("Id")),
                    bd.rs.getString("Id_Med"),
                    bd.rs.getString("Id_Pac"),
                    bd.rs.getString("DataC"),
                    bd.rs.getString("Horario")
                };

                new Consulta_Agendar(2, obj, null, null).setVisible(true);
                preencherTabela();
                dispose();
            } catch (SQLException e) {
                Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!!");
        }
    }//GEN-LAST:event_AlterarConsultaActionPerformed

    private void CadastrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarConsultaActionPerformed
        new Medico_Selecionar().setVisible(true);
        dispose();
    }//GEN-LAST:event_CadastrarConsultaActionPerformed

    private void ExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirConsultaActionPerformed
        int selecionados = TabelaConsulta.getSelectedRow();
        if (selecionados >= 0) {
            int op = JOptionPane.showConfirmDialog(this, "Deseja excluir esse componente?");
            if (op == 0) {
                int cod = modeloTable.getCod(selecionados);
                ArrayList<Consulta_Objeto> bean = new ArrayList();
                selecionados = TabelaConsulta.convertRowIndexToModel(selecionados);
                bean.add(modeloTable.getComponentes(selecionados));
                deleta(cod);

                for (Consulta_Objeto p : bean) {
                    dados = modeloTable.excluir(p);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!!");
        }
    }//GEN-LAST:event_ExcluirConsultaActionPerformed

    public void deleta(int cod) {
        bd.connection();

        String sql = "DELETE FROM consulta WHERE Id = '" + cod + "'";

        try {
            PreparedStatement stm = bd.con.prepareStatement(sql);
            stm.execute();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preencherTabela() {
        dados = new ArrayList();
        bd.executaSQL("select * from consulta");

        try {
            bd.rs.first();
            if (bd.rs.wasNull()) {
                CriarTabela();
            } else {
                do {
                    consulta = new Consulta_Objeto();
                    try {
                        consulta.setID(bd.rs.getInt("Id"));
                        consulta.setNMed(Integer.toString(bd.rs.getInt("Id_Med")));
                        consulta.setNPac(Integer.toString(bd.rs.getInt("Id_Pac")));
                        consulta.setData(bd.rs.getString("DataC"));
                        consulta.setHora(bd.rs.getString("Horario"));
                        dados.add(consulta);
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Consulta_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } while (bd.rs.next());
                CriarTabela();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CriarTabela() {
        modeloTable = new Consulta_ConfigTabel1(dados);

        TabelaConsulta.setModel(modeloTable);

        TabelaConsulta.getColumnModel().getColumn(0).setPreferredWidth(40);
        TabelaConsulta.getColumnModel().getColumn(1).setPreferredWidth(200);
        TabelaConsulta.getColumnModel().getColumn(2).setPreferredWidth(200);
        TabelaConsulta.getColumnModel().getColumn(3).setPreferredWidth(129);
        TabelaConsulta.getColumnModel().getColumn(4).setPreferredWidth(129);

        TabelaConsulta.getTableHeader().setReorderingAllowed(false);
        TabelaConsulta.setAutoResizeMode(TabelaConsulta.AUTO_RESIZE_OFF);
        TabelaConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Consulta_Gerenciar().setVisible(true);
        });
    }

    ConectaBanco bd = new ConectaBanco();
    ArrayList<Consulta_Objeto> dados;
    Consulta_Objeto consulta;
    static Consulta_ConfigTabel1 modeloTable;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarConsulta;
    private javax.swing.JButton CadastrarConsulta;
    private javax.swing.JButton ExcluirConsulta;
    private javax.swing.JTable TabelaConsulta;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
