package view;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.TableModel;
import model.Area;
import model.AreaDao;
import model.AreaFormacao;
import model.AreaFormacaoDao;

/**
 *
 * @author Clayd Nandza
 */
public class CadastroAreas extends javax.swing.JFrame {
        AreaDao areaDao = new AreaDao();
        AreaFormacaoDao areaforDao = new AreaFormacaoDao();
        Area areas = new Area();
        AreaFormacao areasfor = new AreaFormacao();
       

    /**
     * Creates new form CadastroAreas
     */
    public CadastroAreas() {
        initComponents(); 
        preencherTabela(areaDao.listar(areas));
        preencherTabelaFor(areaforDao.listar(areasfor));
        preencherCombo();
        
        btnEliminarRamo.setEnabled(false);
        jtfIdRamo.setVisible(false);
        btnEliminarFormacao.setEnabled(false);
        jtfIdFormacao.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTrabalho = new javax.swing.JLabel();
        jtfRamos = new javax.swing.JTextField();
        btnAdiRamo = new javax.swing.JButton();
        btnEliminarRamo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAreas = new javax.swing.JTable();
        jtfIdRamo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTrabalho1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfAreaFormacao = new javax.swing.JTextField();
        btnAdicionarFormacao = new javax.swing.JButton();
        btnEliminarFormacao = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabAreasFor = new javax.swing.JTable();
        boxRamos = new javax.swing.JComboBox<>();
        jtfIdFormacao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        pnlVoltar = new javax.swing.JPanel();
        lblVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(170, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        lblTrabalho.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        lblTrabalho.setText("Ramo");
        lblTrabalho.setPreferredSize(new java.awt.Dimension(80, 25));

        btnAdiRamo.setFont(new java.awt.Font("Sitka Display", 0, 15)); // NOI18N
        btnAdiRamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/plus_math_24px.png"))); // NOI18N
        btnAdiRamo.setText("Adicionar");
        btnAdiRamo.setPreferredSize(new java.awt.Dimension(85, 30));
        btnAdiRamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiRamoActionPerformed(evt);
            }
        });

        btnEliminarRamo.setFont(new java.awt.Font("Sitka Display", 0, 15)); // NOI18N
        btnEliminarRamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/delete_trash_24px.png"))); // NOI18N
        btnEliminarRamo.setText("Eliminar");
        btnEliminarRamo.setPreferredSize(new java.awt.Dimension(85, 30));
        btnEliminarRamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRamoActionPerformed(evt);
            }
        });

        tabAreas.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        tabAreas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Ramo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabAreas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAreasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabAreas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jtfIdRamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jtfRamos, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnAdiRamo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btnEliminarRamo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jtfIdRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfRamos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdiRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 45)); // NOI18N
        jLabel1.setText("Cadastrar Areas");

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTrabalho1.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        lblTrabalho1.setText("Especialidade");
        lblTrabalho1.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(lblTrabalho1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 26, 125, -1));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        jLabel4.setText("Ramo");
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 25));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 69, 125, -1));
        jPanel3.add(jtfAreaFormacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 26, 240, 25));

        btnAdicionarFormacao.setFont(new java.awt.Font("Sitka Display", 0, 15)); // NOI18N
        btnAdicionarFormacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/plus_math_24px.png"))); // NOI18N
        btnAdicionarFormacao.setText("Adicionar");
        btnAdicionarFormacao.setPreferredSize(new java.awt.Dimension(85, 30));
        btnAdicionarFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarFormacaoActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdicionarFormacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 155, -1));

        btnEliminarFormacao.setFont(new java.awt.Font("Sitka Display", 0, 15)); // NOI18N
        btnEliminarFormacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/delete_trash_24px.png"))); // NOI18N
        btnEliminarFormacao.setText("Eliminar");
        btnEliminarFormacao.setPreferredSize(new java.awt.Dimension(85, 30));
        btnEliminarFormacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFormacaoActionPerformed(evt);
            }
        });
        jPanel3.add(btnEliminarFormacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 155, -1));

        tabAreasFor.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        tabAreasFor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Ramo", "Area de Formacao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabAreasFor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAreasForMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabAreasFor);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 193, 435, 170));

        boxRamos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(boxRamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 72, 240, 25));
        jPanel3.add(jtfIdFormacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 0, 46, -1));

        jPanel4.setBackground(new java.awt.Color(0, 153, 204));

        pnlVoltar.setBackground(new java.awt.Color(0, 153, 204));
        pnlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVoltarMouseClicked(evt);
            }
        });

        lblVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/back_to_32px.png"))); // NOI18N
        lblVoltar.setIconTextGap(10);

        javax.swing.GroupLayout pnlVoltarLayout = new javax.swing.GroupLayout(pnlVoltar);
        pnlVoltar.setLayout(pnlVoltarLayout);
        pnlVoltarLayout.setHorizontalGroup(
            pnlVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVoltarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        pnlVoltarLayout.setVerticalGroup(
            pnlVoltarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 110, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 560, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(505, 546, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdiRamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiRamoActionPerformed
        try{
            if(jtfRamos.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Prencha o campo"," Atencao",INFORMATION_MESSAGE);
            } else  {
                Area area = new Area();
                AreaDao areadao = new AreaDao();
                area.setArea(jtfRamos.getText());
                areadao.salvar(area);
                jtfRamos.setText(" ");
                preencherTabela(areadao.listar(area));
                preencherCombo();
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroAreas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdiRamoActionPerformed

    private void btnEliminarRamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRamoActionPerformed
        int retorno = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente eliminar?");
        if (retorno ==JOptionPane.OK_OPTION){
            try {
                Area area = new Area();
                AreaDao areafordao = new AreaDao();
                areafordao.eliminar(Area.class, Long.parseLong(jtfIdRamo.getText()));
                JOptionPane.showConfirmDialog(null, "Apagado com sucesso","", JOptionPane.DEFAULT_OPTION, 1);
                preencherTabela(areafordao.listar(area));
                jtfRamos.setText("");
            } catch (HeadlessException | NumberFormatException ex) {
            }

        } else {
            JOptionPane.showConfirmDialog(null, "Nenhum item foi selecionado","", JOptionPane.DEFAULT_OPTION, 1);
        }
        btnAdiRamo.setEnabled(true);
    }//GEN-LAST:event_btnEliminarRamoActionPerformed

    private void tabAreasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAreasMouseClicked
        int i = tabAreas.getSelectedRow();
        TableModel model3 = tabAreas.getModel();
        jtfRamos.setText((String) model3.getValueAt(i, 1));
        btnAdiRamo.setEnabled(false);
        btnEliminarRamo.setEnabled(true);

    }//GEN-LAST:event_tabAreasMouseClicked

    private void btnAdicionarFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarFormacaoActionPerformed
        try{
            if(jtfAreaFormacao.getText().isEmpty() || boxRamos.getSelectedIndex()==-1){
                JOptionPane.showMessageDialog(null,"Prencha os todos campos"," Atencao",INFORMATION_MESSAGE);
            } else  {
                AreaFormacao areafor = new AreaFormacao();
                AreaFormacaoDao areafordao = new AreaFormacaoDao();
                areafor.setArea(boxRamos.getSelectedItem().toString());
                areafor.setEspecilidade(jtfAreaFormacao.getText());
                areafordao.salvar(areafor);
                preencherTabelaFor(areafordao.listar(areafor));
            }
        } catch (Exception ex) {
            Logger.getLogger(CadastroAreas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarFormacaoActionPerformed

    private void btnEliminarFormacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFormacaoActionPerformed
        int retorno = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente eliminar?");
        if (retorno == JOptionPane.OK_OPTION){
            try {
                AreaFormacao area = new AreaFormacao();
                AreaFormacaoDao areaformacaoDao = new AreaFormacaoDao();
                areaformacaoDao.eliminar(AreaFormacao.class, Long.parseLong(jtfIdRamo.getText()));
                JOptionPane.showConfirmDialog(null, "Apagado com sucesso","", JOptionPane.DEFAULT_OPTION, 1);

                preencherTabelaFor(areaformacaoDao.listar(area));
                jtfAreaFormacao.setText("");
                boxRamos.setSelectedIndex(0);
            } catch (HeadlessException | NumberFormatException ex) {
            }

        } else {
            JOptionPane.showConfirmDialog(null, "Nenhum item foi selecionado","", JOptionPane.DEFAULT_OPTION, 1);
        }
        btnAdicionarFormacao.setEnabled(true);
    }//GEN-LAST:event_btnEliminarFormacaoActionPerformed

    private void pnlVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_pnlVoltarMouseClicked

    private void tabAreasForMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAreasForMouseClicked
        int i = tabAreas.getSelectedRow();
        TableModel model4 = tabAreas.getModel();
        jtfAreaFormacao.setText((String) model4.getValueAt(i, 1));
        boxRamos.setToolTipText((String) model4.getValueAt(i, 2));
        btnAdicionarFormacao.setEnabled(false);
        btnEliminarFormacao.setEnabled(true);
        
    }//GEN-LAST:event_tabAreasForMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAreas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAreas().setVisible(true);
            }
        });
    }
    
    
    private void preencherTabela(List<Area> areas){
         DefaultTableModel model = new DefaultTableModel();
         tabAreas.setModel(model);
         model.addColumn("ID");
         model.addColumn("Ramo");
         tabAreas.getColumnModel().getColumn(0).setPreferredWidth(10);
         
         areas.forEach((area) -> {
             model.addRow(new Object[]{ area.getId(), area.getArea()});
        });
     }
    
     private void preencherCombo(){
        AreaDao areaDao = new AreaDao(); 
        ArrayList<Area> lista = new ArrayList<Area>();
        lista = areaDao.listar();
    
        boxRamos.removeAllItems();
        boxRamos.addItem(null);
    
        for (Area area : lista){
            boxRamos.addItem(area.toString());
        }
    }
    
    private void preencherTabelaFor(List<AreaFormacao> areasFormacao){
         DefaultTableModel model = new DefaultTableModel();
         tabAreasFor.setModel(model);
         model.addColumn("ID");
         model.addColumn("Ramo");
         model.addColumn("Area de Formacao");
         tabAreasFor.getColumnModel().getColumn(0).setPreferredWidth(10);
         
         areasFormacao.forEach((areaFormacao) -> {
             model.addRow(new Object[]{ areaFormacao.getId(), areaFormacao.getArea(), areaFormacao.getEspecilidade()});
        });
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxRamos;
    public javax.swing.JButton btnAdiRamo;
    private javax.swing.JButton btnAdicionarFormacao;
    private javax.swing.JButton btnEliminarFormacao;
    private javax.swing.JButton btnEliminarRamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfAreaFormacao;
    private javax.swing.JTextField jtfIdFormacao;
    private javax.swing.JTextField jtfIdRamo;
    private javax.swing.JTextField jtfRamos;
    private javax.swing.JLabel lblTrabalho;
    private javax.swing.JLabel lblTrabalho1;
    private javax.swing.JLabel lblVoltar;
    private javax.swing.JPanel pnlVoltar;
    private javax.swing.JTable tabAreas;
    private javax.swing.JTable tabAreasFor;
    // End of variables declaration//GEN-END:variables
}
