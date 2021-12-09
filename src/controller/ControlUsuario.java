package controller;

import java.util.ArrayList;
import model.Funcionario;
import model.FuncionarioDao;

/**
 *
 * @author Clayd Nandza
 */
public class ControlUsuario {
    
    /**
     * Este metodo retorna valores inteiros que auxiliam na verificacao de dados de acesso ao sistema.
     * Garante a seguranca do sistema.
     * @param usuario = O nome introduzido na tela de login
     * @param senha = A senha introduzid na tela de login
     * @return numero inteiro auxiliar
     */
    public int controlUsuario(String usuario, String senha) {
        Funcionario funcionario  = new Funcionario();
        FuncionarioDao funcionariodao  = new FuncionarioDao();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
       try{
              funcionarios = funcionariodao.listar(funcionario); 
       } catch (Exception ex ) {
           ex.printStackTrace();
       }
       
      
       if(!funcionarios.isEmpty()){
           for (int i = 0; i < funcionarios.size(); i++) {
               if (funcionarios.get(i).getNome().equalsIgnoreCase(usuario) && funcionarios.get(i).getSenha().equalsIgnoreCase(senha)) {
                   return 1;
               } else {
                   if (usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
                       return 2;
                   }
               }
           }
       } else {
           return -1;
       }
        return 0;
    }
}