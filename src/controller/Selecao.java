package controller;

import java.util.ArrayList;
import java.util.List;
import model.AreaFormacao;
import model.AreaFormacaoDao;
import model.Candidato;
import model.CandidatosDao;

/**
 *
 * @author Clayd Nandza
 */
public class Selecao {
    private List<Candidato> lista = new ArrayList<>(); 
    private List<Candidato> listaA = new ArrayList<>();
    private static List<Candidato> selecionados = new ArrayList<>();
    private List<AreaFormacao> listaB = new ArrayList<>(); 
    private static String area, funcao, regime, empregador, limite, nivelAcademico;
    private static int idadeMin = 0, idadeMax = 0;
    
    
    public Selecao() {
    }
    
    public Selecao(String area, String funcao, String regime, String empregador, String limite, String nivelAcademico) {
        this.area = area;
        this.funcao = funcao;
        this.regime = regime;
        this.empregador = empregador;
        this.limite = limite;
        this.nivelAcademico = nivelAcademico;
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

   
    public ArrayList Sel(){
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        CandidatosDao candidatoDao = new CandidatosDao();
        lista = candidatoDao.listar();
        listaA = candidatoDao.listar();
        listaB = areaFormacaoDao.listar();
        
       for (Candidato candidato: listaA){
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
    }
     public static void main(String[] args){
        System.out.println(area);  
        System.out.println(funcao);  
        System.out.println(regime);  
        System.out.println(empregador);  
        System.out.println(limite);  
        System.out.println(nivelAcademico);  
        
        for (Candidato candidato : selecionados){
             System.out.println(candidato.getNome());  
        }
     }
    
}