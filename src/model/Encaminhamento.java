/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author chaguala
 */
@Entity
@Table(name = "tabela_Encaminhamentos")
public class Encaminhamento implements DAOInterface, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id; 
    @Column(name = "Nome de Candidato") 
    private String nomeCandidato;
    @Column(name = "Nome de Empreegador")
    private String nomeEmpregador;    
    @Column(name = "Funcao")   
    private String funcao;
    @Column(name = "Regime de Trabalho")
    private String tipoTrabalho; 

    public Encaminhamento() {
    }

    public Encaminhamento(String nomeCandidato, String nomeEmpregador, String funcao, String tipoTrabalho) {
        this.nomeCandidato = nomeCandidato;
        this.nomeEmpregador = nomeEmpregador;
        this.funcao = funcao;
        this.tipoTrabalho = tipoTrabalho;
    }

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNomeCandidato() {
        return nomeCandidato;
    }

    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public void setNomeEmpregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.Id);
        hash = 97 * hash + Objects.hashCode(this.nomeCandidato);
        hash = 97 * hash + Objects.hashCode(this.nomeEmpregador);
        hash = 97 * hash + Objects.hashCode(this.funcao);
        hash = 97 * hash + Objects.hashCode(this.tipoTrabalho);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Encaminhamento other = (Encaminhamento) obj;
        if (!Objects.equals(this.nomeCandidato, other.nomeCandidato)) {
            return false;
        }
        if (!Objects.equals(this.nomeEmpregador, other.nomeEmpregador)) {
            return false;
        }
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        if (!Objects.equals(this.tipoTrabalho, other.tipoTrabalho)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
    
    
   
}