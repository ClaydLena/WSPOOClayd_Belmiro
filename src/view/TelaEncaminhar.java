package view;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.table.DefaultTableModel;
import model.AreaFormacao;
import model.AreaFormacaoDao;
import model.Candidato;
import model.CandidatosDao;

/**
 *
 * @author Clayd Nandza
 */
public class TelaEncaminhar extends javax.swing.JFrame {
    CandidatosDao dao = new CandidatosDao();
    Candidato candidato = new Candidato();
    private static List<Candidato> lista = new ArrayList<>(); 
    private static final List<Candidato> selecionados = new ArrayList<>();
    private static List<AreaFormacao> listaB = new ArrayList<>(); 
    private static String area, funcao, regime, empregador, limite, nivelAcademico;
    private static int idadeMin = 0, idadeMax = 0;
    
    public TelaEncaminhar() {
        initComponents();
        preencherTabela();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(170, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Funcao", "Nivel Academico", "Empregador", "Regime de Trabalho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        jLabel1.setText("Selecao");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(548, 548, 548))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "A salvar", "Messagem", INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEncaminhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEncaminhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEncaminhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEncaminhar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEncaminhar().setVisible(true);
            }
        });
    }

    public void recebeDados(String area, String funcao, String regime, String empregador,
            String limite, String nivelAcademico){
            this.area = area;
            this.funcao = funcao;
            this.regime = regime;
            this.empregador = empregador;
            this.limite = limite;
            this.nivelAcademico = nivelAcademico;      
    }
    
   /*  public ArrayList Sel(){
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        CandidatosDao candidatoDao = new CandidatosDao();
        lista = candidatoDao.listar();
        listaB = areaFormacaoDao.listar();
        
       for (Candidato candidato: lista){
            if (candidato.getCurso().toString() == funcao){
                 if (candidato.getNivelAcademico().toString() == nivelAcademico){
                     if(limite.length()==5){
                         idadeMin = Integer.parseInt(limite.substring(0, 2));
                         idadeMax = Integer.parseInt(limite.substring(3));
                         if ((idadeMin <= candidato.getIdade()) & (candidato.getIdade()<= idadeMax)){
                             selecionados.add(candidato);
                         }
                     } else {
                         selecionados.add(candidato);
                     }
                 }
            }
       }
        return (ArrayList) selecionados;
    }
    
     public static Candidato seleciona(){
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        CandidatosDao candidatoDao = new CandidatosDao();
        lista = candidatoDao.listar();
        listaB = areaFormacaoDao.listar();
        
       for (Candidato candidato: lista){
            if (candidato.getCurso().toString() == funcao){
                 if (candidato.getNivelAcademico().toString() == nivelAcademico){
                     if(limite.length()==5){
                         idadeMin = Integer.parseInt(limite.substring(0, 2));
                         idadeMax = Integer.parseInt(limite.substring(3));
                         if ((idadeMin <= candidato.getIdade()) & (candidato.getIdade()<= idadeMax)){
                             selecionados.add(candidato);
                         }
                     } else {
                         selecionados.add(candidato);
                     }
                 }
            }
       }
        for(Candidato cand : selecionados ){
        selecionados.sort((Comparator<? super Candidato>) selecionados);
        System.out.println(cand.compareTo(cand));
        }
        
        for(Candidato cand : selecionados ){
          System.out.println(selecionados);
          selecionados.get(selecionados.size());
        }
       return selecionados.get(selecionados.size());
    }
     
    public static void comparaCandidatos(Comparable[] selecionados){   
        List<Candidato> selecionaos = new ArrayList<>();
        
        for (Candidato candidato : selecionaos){
             Comparable elemento = candidato.getPontos();
            
            int i = selecionaos.size();
            int j = i - 1;
            while(j >= 0 && selecionados[j].compareTo(elemento) > 0){
                selecionados[j + 1] = selecionados[j]; //deslocamento para direita
                j = j - 1;
            }
            selecionados[j + 1] = elemento;
            i--;
        }
        
        for(int i = 1; i < selecionados.length; i++){
           System.out.println(selecionados[i]);
        }
        
    }
    
   public static ArrayList<Candidato> ordena(ArrayList<Candidato> selecionados){
       ArrayList<Candidato> retornaSelecionados = new ArrayList<Candidato>();
       for(Candidato cand : selecionados ){
         selecionados.sort((Comparator<? super Candidato>) selecionados);
         System.out.println(cand.compareTo(cand));
       }
        return null;
   }
  
    private void preencherTabela(){
         DefaultTableModel model = new DefaultTableModel();
         jTable1.setModel(model);
         model.addColumn("Nome");
         model.addColumn("Idade");
         model.addColumn("Funcao");
         model.addColumn("Nivel Academico");
         model.addColumn("Empregador");
         model.addColumn("Regime de Trabalho");
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        
         /*if(selecionados.isEmpty())
             model.addRow(new String[]{"Nao ha candidatos qualificados"});
         else{ 
             for (int ctrl =0; ctrl <selecionados.size(); ctrl++) {
                 model.addRow(new Object[]{selecionados.iterator()});
             }
         //}       
     } */
    
    
    private void preencherTabela(){
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        CandidatosDao candidatoDao = new CandidatosDao();
        lista = candidatoDao.listar();
        listaB = areaFormacaoDao.listar();
        
        DefaultTableModel model = new DefaultTableModel();
         jTable1.setModel(model);
         model.addColumn("Nome");
         model.addColumn("Idade");
         model.addColumn("Funcao");
         model.addColumn("Nivel Academico");
         model.addColumn("Empregador");
         model.addColumn("Regime de Trabalho");
         jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        
       for (Candidato candidato: lista){
            if (candidato.getCurso().toString() == funcao){
                 if (candidato.getNivelAcademico().toString() == nivelAcademico){
                     if(limite.length()==5){
                         idadeMin = Integer.parseInt(limite.substring(0, 2));
                         idadeMax = Integer.parseInt(limite.substring(3));
                         if ((idadeMin <= candidato.getIdade()) & (candidato.getIdade()<= idadeMax)){
                              model.addRow(new Object[]{ candidato.getNome(),candidato.getIdade(),funcao,candidato.getNivelAcademico(),
                                  empregador,regime});
                         }
                         } else {
                          model.addRow(new Object[]{ candidato.getNome(),candidato.getIdade(),funcao, candidato.getNivelAcademico(), 
                              empregador,regime});
                     }
                 }
            }
       }
    }
         
         
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}