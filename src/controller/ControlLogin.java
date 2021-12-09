/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import view.TelaFuncionarios;
import view.TelaLoading;
import view.TelaLogin;
import view.TelaMenu;

/**
 *
 * @author Clayd Nandza
 */
public class ControlLogin {
    private TelaLogin telalogin;
    
    public void entrar(String usuario,String senha){
        if ((senha.equals("")) && (usuario.equals(""))) {
            JOptionPane.showMessageDialog(null, "Escreva o nome e a senha", "Atenção", INFORMATION_MESSAGE);
       } else 
           if((senha.equals("")) && (!(usuario.equals("")))){
               JOptionPane.showMessageDialog(null, "Escreva a senha", "Atenção", INFORMATION_MESSAGE);
           } else 
                if (usuario.equals("") && (!(senha.equals("")))) {
                JOptionPane.showMessageDialog(null, "Escreva o nome de usuario", "Atenção", INFORMATION_MESSAGE);
                } else { 
                    int auxControlo = new ControlUsuario().controlUsuario (usuario, senha);
                    switch (auxControlo) {
                    case 1: 
                      //  dispose();
                        TelaLoading telaloading = new TelaLoading();
                        telaloading.setVisible(true);
                        try {
                            for (int i = 0; i <= 100; i++) {
                                Thread.sleep(10);
                                TelaLoading.contagem.setText(Integer.toString(i) + "%");
                            }
                            new TelaMenu().setVisible(true);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }                        
                        break;
                        
                    case 2: 
                       // dispose();
                        new TelaFuncionarios().setVisible(true);
                        break;
                     
                    default:
                        JOptionPane.showMessageDialog(null, "Nome do Usuario ou Senha invalido(a)!", "Atenção", WARNING_MESSAGE);
                        break;       
                    }
                }
    }
}
