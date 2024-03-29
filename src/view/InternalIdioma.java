package view;

import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Clayd Nandza
 */
public class InternalIdioma extends javax.swing.JInternalFrame {

    /**
     * Creates new form Idioma
     */
    public InternalIdioma() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI basicInternalFrameUi =(BasicInternalFrameUI)this.getUI();
        basicInternalFrameUi.setNorthPane(null);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkPortugues = new javax.swing.JCheckBox();
        checkChangana = new javax.swing.JCheckBox();
        checkIngles = new javax.swing.JCheckBox();
        checkOutros = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setPreferredSize(new java.awt.Dimension(940, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 30)); // NOI18N
        jLabel1.setText("  Idiomas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(435, 435, 435))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/idioms.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 25)); // NOI18N
        jLabel3.setText("Idioma  ");

        checkPortugues.setBackground(new java.awt.Color(255, 255, 255));
        checkPortugues.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkPortugues.setText("Portugues");
        checkPortugues.setPreferredSize(new java.awt.Dimension(115, 40));
        checkPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPortuguesActionPerformed(evt);
            }
        });

        checkChangana.setBackground(new java.awt.Color(255, 255, 255));
        checkChangana.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkChangana.setText("Changana");
        checkChangana.setPreferredSize(new java.awt.Dimension(115, 40));
        checkChangana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChanganaActionPerformed(evt);
            }
        });

        checkIngles.setBackground(new java.awt.Color(255, 255, 255));
        checkIngles.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkIngles.setText("Ingles");
        checkIngles.setPreferredSize(new java.awt.Dimension(115, 40));
        checkIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInglesActionPerformed(evt);
            }
        });

        checkOutros.setBackground(new java.awt.Color(255, 255, 255));
        checkOutros.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkOutros.setText("Outros");
        checkOutros.setPreferredSize(new java.awt.Dimension(115, 40));
        checkOutros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkPortugues, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkIngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkChangana, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkChangana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(checkIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(checkOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
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

    private void checkPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPortuguesActionPerformed
        if (checkPortugues.isSelected()){
            pontos ++;
        }
    }//GEN-LAST:event_checkPortuguesActionPerformed

    private void checkInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInglesActionPerformed
        if (checkIngles.isSelected()){
            pontos ++;
        }
    }//GEN-LAST:event_checkInglesActionPerformed

    private void checkChanganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkChanganaActionPerformed
        if (checkChangana.isSelected()){
            pontos ++;
        }
    }//GEN-LAST:event_checkChanganaActionPerformed

    private void checkOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutrosActionPerformed
        if (checkOutros.isSelected()){
            pontos ++;
        }
    }//GEN-LAST:event_checkOutrosActionPerformed


    
   private String nomeAux, estadoCivilAux, nacionalidadeAux, nrDocumentoAux, moradaAux,  emailAux, 
           contactoAux, nivelAcademicoAux,  cursoAux;
   private int idadeAux;
   
   public void recebe (String nome, int idade, String estadoCivil, String nacionalidade, String nrDocumento, String morada,
            String email, String contacto, String nivelAcademico, String curso){
       nomeAux = nome;
       idadeAux = idade;
       estadoCivilAux = estadoCivil;
       nacionalidadeAux = nacionalidade;
       nrDocumentoAux = nrDocumento;
       moradaAux = morada;
       emailAux  =  email;
       contactoAux = contacto;
       nivelAcademicoAux =  nivelAcademico;
       cursoAux = curso;
    }

   private int pontos = 0;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkChangana;
    private javax.swing.JCheckBox checkIngles;
    private javax.swing.JCheckBox checkOutros;
    private javax.swing.JCheckBox checkPortugues;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
