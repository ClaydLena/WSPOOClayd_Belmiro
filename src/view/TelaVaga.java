package view;

import controller.Selecao;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.*;



public class TelaVaga extends javax.swing.JFrame {
  
    public TelaVaga() {
        initComponents();
        preencherBoxArea();
        preencherBoxEmpregador();
        preencherBoxFuncao();
        jtfId.setVisible(false);
        VagasDao vagasDao = new VagasDao();
        preencherTabela(vagasDao.listar());
        btnEncaminhar.setEnabled(false);
        btnApagar.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        boxArea = new javax.swing.JComboBox<>();
        boxFuncao = new javax.swing.JComboBox<>();
        boxRegime = new javax.swing.JComboBox<>();
        boxEmpregador = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRegistar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnEncaminhar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        boxLimiteIdade = new javax.swing.JComboBox<>();
        boxNivelAcademico = new javax.swing.JComboBox<>();
        jtfId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabVagas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAreas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(170, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel2.setText("Area de Actuacao");

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel3.setText("Funcao");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel4.setText("Regime de Trablaho");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel5.setText("Empregador");

        boxArea.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxFuncao.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        boxRegime.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxRegime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tempo Inteiro", "Tempo Parcial", "Freelancer" }));

        boxEmpregador.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxEmpregador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        jLabel6.setText("Exigencias");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel7.setText("Limite de Idade");

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 18)); // NOI18N
        jLabel8.setText("Nivel Academico");

        btnRegistar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnRegistar.setText("Registar");
        btnRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistarActionPerformed(evt);
            }
        });

        btnApagar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnEncaminhar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnEncaminhar.setText("Encaminhar");
        btnEncaminhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncaminharActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        boxLimiteIdade.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxLimiteIdade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18-25", "25-30", "30-35", "Nenhum" }));

        boxNivelAcademico.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        boxNivelAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico", "Medio", "Tecnico Profissional", "Superior" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(boxFuncao, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxRegime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(boxEmpregador, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnEncaminhar)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(boxLimiteIdade, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(boxNivelAcademico, javax.swing.GroupLayout.Alignment.LEADING, 0, 197, Short.MAX_VALUE)))
                                    .addComponent(boxArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxArea, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxFuncao, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxRegime, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(boxEmpregador, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxLimiteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boxNivelAcademico)
                        .addGap(3, 3, 3)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistar)
                    .addComponent(btnEncaminhar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabVagas.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        tabVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod", "Area", "Funcao", "Regime", "Empregador", "Limite de Idade", "Nivel Academico"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabVagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabVagasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabVagas);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        jLabel1.setText("REGISTO DE VAGAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAreas.setBackground(new java.awt.Color(255, 255, 255));
        btnAreas.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnAreas.setText("Gerir Areas");
        btnAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                .addContainerGap())
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

    private void btnRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistarActionPerformed
        try {
            String areaAux = (boxFuncao.getSelectedItem().toString());
            if((boxArea.getSelectedIndex()!=-1) & (boxFuncao.getSelectedIndex()!=-1) & (boxRegime.getSelectedIndex()!=-1)
                    & (boxEmpregador.getSelectedIndex()!=-1) & (boxLimiteIdade.getSelectedIndex()!=-1) & (boxNivelAcademico.getSelectedIndex()!=-1)){
                 DAO dao = new DAO(); 
                 Vagas vaga = new Vagas();
                 VagasDao vagasDao = new VagasDao();
                 vaga.setArea(boxArea.getSelectedItem().toString());
                 vaga.setFuncao(boxFuncao.getSelectedItem().toString()); 
                 vaga.setRegime(boxRegime.getSelectedItem().toString());
                 vaga.setNomeEmpregador(boxEmpregador.getSelectedItem().toString());
                 vaga.setLimiteIdade(boxLimiteIdade.getSelectedItem().toString());
                 vaga.setNivelAcademico(boxNivelAcademico.getSelectedItem().toString()); 
                 vagasDao.salvar(vaga);
                 preencherTabela(vagasDao.listar());
                
            } else {
                 JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaVaga.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistarActionPerformed

    private void tabVagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabVagasMouseClicked
        btnVoltar.setEnabled(false);
        btnRegistar.setEnabled(false);
        
        btnEncaminhar.setEnabled(true);
        btnApagar.setEnabled(true);
        
        int i = tabVagas.getSelectedRow();
        TableModel tabmodel = tabVagas.getModel();
        jtfId.setText(Long.toString((Long) tabmodel.getValueAt(i,0)));
        boxArea.setToolTipText((String) tabmodel.getValueAt(i,1));
        boxFuncao.setToolTipText((String) tabmodel.getValueAt(i,2));
        boxRegime.setToolTipText((String) tabmodel.getValueAt(i,3));
        boxEmpregador.setToolTipText((String) tabmodel.getValueAt(i,4));
        boxLimiteIdade.setToolTipText((String) tabmodel.getValueAt(i,5));
        boxNivelAcademico.setToolTipText((String) tabmodel.getValueAt(i,6));
    }//GEN-LAST:event_tabVagasMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        int retorno = JOptionPane.showConfirmDialog(rootPane,"Deseja realmente eliminar?");
        if (retorno ==JOptionPane.OK_OPTION){
            try {
                 DAO dao = new DAO(); 
                 VagasDao vagasDao = new VagasDao(); 
                 Vagas vaga = new Vagas();
                 vagasDao.eliminar(Vagas.class, Long.parseLong(jtfId.getText()));
                        JOptionPane.showConfirmDialog(null, "Apagado com sucesso","", JOptionPane.DEFAULT_OPTION, 1);   
                        preencherTabela(vagasDao.listar());
                        limpar(); 
                     } catch (Exception ex) {
                           ex.printStackTrace();
                     }
        } else {
            JOptionPane.showConfirmDialog(null, "Nenhum funcionario selecionado","", JOptionPane.DEFAULT_OPTION, 1);   
        } 
        btnRegistar.setEnabled(true);
        btnVoltar.setEnabled(true);
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnEncaminharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncaminharActionPerformed
        TelaEncaminhar encaminhar = new TelaEncaminhar();
        encaminhar.setVisible(true);
         encaminhar.recebeDados(boxArea.getSelectedItem().toString(), boxFuncao.getSelectedItem().toString(),boxRegime.getSelectedItem().toString(),
                boxEmpregador.getSelectedItem().toString(), boxLimiteIdade.getSelectedItem().toString(), boxNivelAcademico.getSelectedItem().toString());
    }//GEN-LAST:event_btnEncaminharActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
       dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreasActionPerformed
        new CadastroAreas().setVisible(true);
    }//GEN-LAST:event_btnAreasActionPerformed

    
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
            java.util.logging.Logger.getLogger(TelaVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVaga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVaga().setVisible(true);
            }
        });
    }
    
    private void preencherBoxArea(){
        AreaDao areaDao = new AreaDao();
        ArrayList<Area> lista = new ArrayList<Area>(); 
        lista = areaDao.listar();
    
        boxArea.removeAllItems();
        boxArea.addItem(null);
    
        for (Area area : lista){
            boxArea.addItem(area.toString());
        }
    }
    
    private void preencherBoxEmpregador(){
        EmpregadorDao empregadorDao = new EmpregadorDao();
        ArrayList<Empregador> lista = new ArrayList<>(); 
        lista = empregadorDao.listar();
    
        boxEmpregador.removeAllItems();
        boxEmpregador.addItem(null);
    
        for (Empregador empregador : lista){
            boxEmpregador.addItem(empregador.toString());
        }
    }
  
     private void preencherBoxFuncao(){
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        ArrayList<AreaFormacao> lista = new ArrayList<>(); 
        lista = areaFormacaoDao.listar();
    
        boxFuncao.removeAllItems();
        boxFuncao.addItem(null);
    
        for (AreaFormacao areaformacao: lista){
           
                boxFuncao.addItem(areaformacao.toString());
           
        } 
    }
     
      private void preencherTabela(ArrayList<Vagas> vagas){
         DefaultTableModel model = new DefaultTableModel();
         tabVagas.setModel(model);
         model.addColumn("ID");
         model.addColumn("Area");
         model.addColumn("Funcao");
         model.addColumn("Regime");
         model.addColumn("Empregagor");
         model.addColumn("Limite Idade");
         model.addColumn("Nivel Academico");
         tabVagas.getColumnModel().getColumn(0).setPreferredWidth(10);
         
         vagas.forEach((vaga) -> {
             model.addRow(new Object[]{  vaga.getId(),  vaga.getArea(),  vaga.getFuncao(), vaga.getRegime(),
                 vaga.getNomeEmpregador(), vaga.getLimiteIdade(), vaga.getNivelAcademico()});
        });
     }
  
     public void limpar(){
            boxArea.setSelectedItem(-1);
            boxEmpregador.setSelectedItem(-1);
            boxFuncao.setSelectedItem(-1);
            boxLimiteIdade.setSelectedItem(-1);
            boxNivelAcademico.setSelectedItem(-1);
            boxRegime.setSelectedItem(-1);
     }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxArea;
    private javax.swing.JComboBox<String> boxEmpregador;
    private javax.swing.JComboBox<String> boxFuncao;
    private javax.swing.JComboBox<String> boxLimiteIdade;
    private javax.swing.JComboBox<String> boxNivelAcademico;
    private javax.swing.JComboBox<String> boxRegime;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAreas;
    private javax.swing.JButton btnEncaminhar;
    private javax.swing.JButton btnRegistar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTable tabVagas;
    // End of variables declaration//GEN-END:variables
}