/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
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
@Table(name = "tabela_Area_Formacao")

public class AreaFormacao implements DAOInterface, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id; 
    @Column(name = "Area")
    private String  area;
    @Column(name = "Especialidade")
    private String especilidade;

    public AreaFormacao() {
    }

    public AreaFormacao(String area, String especilidade) {
        this.area = area;
        this.especilidade = especilidade;
    }

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.Id);
        hash = 97 * hash + Objects.hashCode(this.area);
        hash = 97 * hash + Objects.hashCode(this.especilidade);
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
        final AreaFormacao other = (AreaFormacao) obj;
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        if (!Objects.equals(this.especilidade, other.especilidade)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return this.getEspecilidade();
    }
    
    public String retornaArea(String areaFormacao){
        String area = null;  
        AreaFormacaoDao areaFormacaoDao = new AreaFormacaoDao();
        ArrayList<AreaFormacao> lista = new ArrayList<>(); 
        lista = areaFormacaoDao.listar();
    
        for (AreaFormacao areaformacao: lista){
            if (areaformacao.getEspecilidade().equals(areaFormacao)){
                area = areaformacao.getArea();
                return areaformacao.getArea();
                
            }
        } 
        return area;
    }
}