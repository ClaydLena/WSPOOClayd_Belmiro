/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import model.Candidato;
import model.CandidatosDao;

/**
 *
 * @author Clayd Nandza
 */
public class Dados extends javax.swing.JFrame {

     private int pontos = 0;
    /**
     * Creates new form Dados
     */
    public Dados() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfEmail = new javax.swing.JTextField();
        jtfCelular = new javax.swing.JTextField();
        jtfNrDocumento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfMorada = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        dataNascimento = new com.toedter.calendar.JDateChooser();
        btnContinuar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        boxNivel = new javax.swing.JComboBox<>();
        boxCurso = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        checkPortugues = new javax.swing.JCheckBox();
        checkIngles = new javax.swing.JCheckBox();
        checkChangana = new javax.swing.JCheckBox();
        checkOutros = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(170, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/person_24px.png"))); // NOI18N
        jLabel1.setText("  Dados Bibliograficos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel3.setText("NOME COMPLETO");

        jtfNome.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jtfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNomeKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel7.setText("DATA DE NASCIMENTO");

        jLabel8.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel8.setText("ESTADO CIVIL");

        boxEstadoCivil.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        boxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viuvo" }));
        boxEstadoCivil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                boxEstadoCivilKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel5.setText("DOCUMENTO Nº");

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("CONTACTOS"));

        jLabel9.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel9.setText("E-MAIL");

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel11.setText("CELULAR");

        jtfEmail.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jtfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEmailKeyTyped(evt);
            }
        });

        jtfCelular.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jtfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfCelularKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCelular))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtfCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtfNrDocumento.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jtfNrDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNrDocumentoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel10.setText("MORADA");

        jtfMorada.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jtfMorada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMoradaKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 204));
        jLabel12.setText("Clica na area de Certificacoes se tiver completado o registo dos dados bibliograficos");

        dataNascimento.setDateFormatString("dd-MM-yyyy");
        dataNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dataNascimentoKeyTyped(evt);
            }
        });

        btnContinuar.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnContinuar.setText("Continuar");

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));

        jLabel2.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 30)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/graduation_cap_24px.png"))); // NOI18N
        jLabel2.setText("   Certificacoes e Qualificaoes");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        boxNivel.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        boxNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico", "Medio", "Tecnico Profissional", "Licenciado", "Mestrado" }));

        boxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel5.setBackground(new java.awt.Color(0, 153, 255));

        jLabel4.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 30)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/language_24px.png"))); // NOI18N
        jLabel4.setText("  Idiomas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        checkPortugues.setBackground(new java.awt.Color(255, 255, 255));
        checkPortugues.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkPortugues.setText("Portugues");
        checkPortugues.setPreferredSize(new java.awt.Dimension(115, 40));
        checkPortugues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPortuguesActionPerformed(evt);
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

        checkChangana.setBackground(new java.awt.Color(255, 255, 255));
        checkChangana.setFont(new java.awt.Font("Bodoni MT", 0, 20)); // NOI18N
        checkChangana.setText("Changana");
        checkChangana.setPreferredSize(new java.awt.Dimension(115, 40));
        checkChangana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChanganaActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel6.setText("NIVEL ACADEMICO");

        jLabel13.setFont(new java.awt.Font("Bodoni MT", 0, 15)); // NOI18N
        jLabel13.setText("CURSO");

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Sylfaen", 0, 15)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icones/add_user_group_woman_man_80px.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnContinuar)
                .addGap(62, 62, 62))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNrDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(boxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(checkPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(checkIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(checkChangana, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(checkOutros, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(289, 289, 289))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfMorada, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(boxEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jtfNrDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(boxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(boxNivel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPortugues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkChangana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkOutros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar)))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
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

    private void jtfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNomeKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            dataNascimento.requestFocus();
        }
    }//GEN-LAST:event_jtfNomeKeyTyped

    private void boxEstadoCivilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_boxEstadoCivilKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jtfNrDocumento.requestFocus();
        }
    }//GEN-LAST:event_boxEstadoCivilKeyTyped

    private void jtfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEmailKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jtfCelular.requestFocus();
        }
    }//GEN-LAST:event_jtfEmailKeyTyped

    private void jtfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCelularKeyTyped
        char c = evt.getKeyChar();
        if ((!(Character.isDigit(c))) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jtfCelularKeyTyped

    private void jtfNrDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNrDocumentoKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jtfMorada.requestFocus();
        }
    }//GEN-LAST:event_jtfNrDocumentoKeyTyped

    private void jtfMoradaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMoradaKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            jtfEmail.requestFocus();
        }
    }//GEN-LAST:event_jtfMoradaKeyTyped

    private void dataNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataNascimentoKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {

            boxEstadoCivil.requestFocus();
        }
    }//GEN-LAST:event_dataNascimentoKeyTyped

    private void checkPortuguesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPortuguesActionPerformed
        if(checkPortugues.isSelected()){
            pontos ++;
            checkPortugues.setEnabled(false);
        }
        System.out.println(pontos);
    }//GEN-LAST:event_checkPortuguesActionPerformed

    private void checkInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInglesActionPerformed
        if(checkIngles.isSelected()){
            pontos ++;
            checkIngles.setEnabled(false);
        }
        System.out.println(pontos);
    }//GEN-LAST:event_checkInglesActionPerformed

    private void checkChanganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkChanganaActionPerformed
        if(checkChangana.isSelected()){
            pontos ++;
            checkChangana.setEnabled(false);
        }
        System.out.println(pontos);
    }//GEN-LAST:event_checkChanganaActionPerformed

    private void checkOutrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutrosActionPerformed
        if(checkOutros.isSelected()){
            pontos ++;

            checkOutros.setEnabled(false);
        }
        System.out.println(pontos);
    }//GEN-LAST:event_checkOutrosActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String data = sdf.format(dataNascimento.getDate());

        try {
            if((jtfNome.getText().isEmpty()) || (jtfMorada.getText().isEmpty()) || (jtfCelular.getText().isEmpty()) ||
                (jtfEmail.getText().isEmpty()) || (jtfNrDocumento.getText().isEmpty()) ||
                (data.isEmpty())){
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", INFORMATION_MESSAGE);
            } else {
                Candidato candidato = new Candidato();
                CandidatosDao candidatoDao = new CandidatosDao();

                candidato.setNome(jtfNome.getText());
                candidato.setIdade(candidato.calculaIdade(data));
                candidato.setMorada(jtfMorada.getText());
                candidato.setNrDocumento(jtfNrDocumento.getText());
                candidato.setEstadoCivil(boxEstadoCivil.getSelectedItem().toString());
                candidato.setNivelAcademico(boxNivel.getSelectedItem().toString());
                candidato.setCurso(boxCurso.getSelectedItem().toString());
                candidato.setNrCelular(jtfCelular.getText());
                candidato.setEmail(jtfEmail.getText());
                candidato.setPontos(pontos);

                candidatoDao.salvar(candidato);
                // preencherTabela(dao.listar(candidato));
                limpar();
            }
        } catch (Exception ex) {
            Logger.getLogger(InternalVirtude.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                String data = sdf.format(dataNascimento.getDate());

                Candidato candidato = new Candidato();
                CandidatosDao candidatoDao = new CandidatosDao();

                candidato.setNome(jtfNome.getText());
                candidato.setIdade(candidato.calculaIdade(data));
                candidato.setMorada(jtfMorada.getText());
                candidato.setNrDocumento(jtfNrDocumento.getText());
                candidato.setEstadoCivil(boxEstadoCivil.getSelectedItem().toString());
                candidato.setNivelAcademico(boxNivel.getSelectedItem().toString());
                candidato.setCurso(boxCurso.getSelectedItem().toString());
                candidato.setNrCelular(jtfCelular.getText());
                candidato.setEmail(jtfEmail.getText());
                candidato.setPontos(pontos);

         try {
             candidatoDao.salvar(candidato);
             limpar();
         } catch (Exception ex) {
             Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
         }
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
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dados().setVisible(true);
            }
        });
    }
    
    public void limpar(){
        jtfNome.setText(" ");
        jtfMorada.setText(" ");
        dataNascimento.setToolTipText(" ");
        jtfNrDocumento.setText("");
        boxEstadoCivil.setSelectedItem(" ");
        boxNivel.setSelectedItem(" ");
        boxCurso.setSelectedItem(" ");
        jtfCelular.setText("");
        jtfEmail.setText(" ");
        checkPortugues.setEnabled(true);
        checkIngles.setEnabled(true);
        checkOutros.setEnabled(true);
        checkChangana.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCurso;
    private javax.swing.JComboBox<String> boxEstadoCivil;
    private javax.swing.JComboBox<String> boxNivel;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox checkChangana;
    private javax.swing.JCheckBox checkIngles;
    private javax.swing.JCheckBox checkOutros;
    private javax.swing.JCheckBox checkPortugues;
    private com.toedter.calendar.JDateChooser dataNascimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jtfCelular;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfMorada;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNrDocumento;
    // End of variables declaration//GEN-END:variables
}
