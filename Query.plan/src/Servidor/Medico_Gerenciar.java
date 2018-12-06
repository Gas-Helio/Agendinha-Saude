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
public class Medico_Gerenciar extends javax.swing.JFrame {

    

    public Medico_Gerenciar() {
        initComponents();
        bd.connection();
        preencherTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaMedicos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gerenciar Médicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        jButton1.setText("Excluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TabelaMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Especialidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaMedicos);
        if (TabelaMedicos.getColumnModel().getColumnCount() > 0) {
            TabelaMedicos.getColumnModel().getColumn(0).setResizable(false);
            TabelaMedicos.getColumnModel().getColumn(0).setPreferredWidth(1);
            TabelaMedicos.getColumnModel().getColumn(1).setResizable(false);
            TabelaMedicos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TabelaMedicos.getColumnModel().getColumn(2).setResizable(false);
            TabelaMedicos.getColumnModel().getColumn(2).setPreferredWidth(150);
            TabelaMedicos.getColumnModel().getColumn(3).setResizable(false);
            TabelaMedicos.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selecionados = TabelaMedicos.getSelectedRow();
        if (selecionados > 0) {
            int cod = modeloTable.getCod(selecionados);

            bd.connection();
            bd.executaSQL("SELECT * FROM medico WHERE Id = '" + cod + "'");

            try {
                bd.rs.first();

                String[] obj = new String[]{
                    Integer.toString(bd.rs.getInt("Id")),
                    bd.rs.getString("CPF"),
                    bd.rs.getString("Nome"),
                    bd.rs.getString("CRM"),
                    bd.rs.getString("Especializacao"),
                    bd.rs.getString("Descricao"),
                    bd.rs.getString("Valor")
                };

                new Medico_Cadastrar(2, obj).setVisible(true);
                preencherTabela();
                dispose();
            } catch (SQLException e) {
                Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!!");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Medico_Cadastrar(1, null).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int selecionados = TabelaMedicos.getSelectedRow();
        if (selecionados > 0) {
            int op = JOptionPane.showConfirmDialog(this, "Deseja excluir esse componente?");
            if (op == 0) {
                int cod = modeloTable.getCod(selecionados);
                ArrayList<Medico_Objeto> bean = new ArrayList<>();
                selecionados = TabelaMedicos.convertRowIndexToModel(selecionados);
                bean.add(modeloTable.getComponentes(selecionados));
                deleta(cod);

                for (Medico_Objeto p : bean) {
                    dados = modeloTable.excluir(p);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void deleta(int cod) {
        bd.connection();

        String sql = "DELETE FROM medico WHERE Id = '" + cod + "'";

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
        bd.executaSQL("select * from medico");

        try {
            bd.rs.first();
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            do {
                medico = new Medico_Objeto();
                try {
                    medico.setID(bd.rs.getInt("Id"));
                    medico.setCPF(bd.rs.getString("CPF"));
                    medico.setNome(bd.rs.getString("Nome"));
                    medico.setEsp(bd.rs.getString("Especializacao"));
                    dados.add(medico);
                } catch (SQLException ex) {
                    Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
                }

            } while (bd.rs.next());
        } catch (SQLException ex) {
            Logger.getLogger(Medico_Gerenciar.class.getName()).log(Level.SEVERE, null, ex);
        }

        CriarTabela();
    }

    public void CriarTabela() {
        modeloTable = new Medico_ConfigTabel(dados);

        TabelaMedicos.setModel(modeloTable);

        TabelaMedicos.getColumnModel().getColumn(0).setPreferredWidth(40);
        TabelaMedicos.getColumnModel().getColumn(1).setPreferredWidth(100);
        TabelaMedicos.getColumnModel().getColumn(2).setPreferredWidth(180);
        TabelaMedicos.getColumnModel().getColumn(3).setPreferredWidth(159);

        TabelaMedicos.getTableHeader().setReorderingAllowed(false);
        TabelaMedicos.setAutoResizeMode(TabelaMedicos.AUTO_RESIZE_OFF);
        TabelaMedicos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Medico_Gerenciar().setVisible(true);
        });
    }

    ConectaBanco bd = new ConectaBanco();
    ArrayList<Medico_Objeto> dados;
    Medico_Objeto medico;
    static Medico_ConfigTabel modeloTable;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaMedicos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
