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
@Table(name = "tabela_vagas")
public class Vagas implements DAOInterface, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id; 
    @Column(name = "Area")
    private String area; 
    @Column(name = "Funcao")
    private String funcao;
    @Column(name = "Regime_trablaho")
    private String regime;
    @Column(name = "Empregador")
    private String nomeEmpregador;
    @Column(name = "Limite_idade")
    private String limiteIdade;
    @Column(name = "Nivel_academico_minimo")
    private String nivelAcademico;
    
    public Vagas() {
    }

    public Vagas(String area, String funcao, String regime, String nomeEmpregador, String limiteIdade, String nivelAcademico) {
        this.area = area;
        this.funcao = funcao;
        this.regime = regime;
        this.nomeEmpregador = nomeEmpregador;
        this.limiteIdade = limiteIdade;
        this.nivelAcademico = nivelAcademico;
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

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public void setNomeEmpregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    public String getLimiteIdade() {
        return limiteIdade;
    }

    public void setLimiteIdade(String limiteIdade) {
        this.limiteIdade = limiteIdade;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Id);
        hash = 29 * hash + Objects.hashCode(this.area);
        hash = 29 * hash + Objects.hashCode(this.funcao);
        hash = 29 * hash + Objects.hashCode(this.regime);
        hash = 29 * hash + Objects.hashCode(this.nomeEmpregador);
        hash = 29 * hash + Objects.hashCode(this.limiteIdade);
        hash = 29 * hash + Objects.hashCode(this.nivelAcademico);
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
        final Vagas other = (Vagas) obj;
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        if (!Objects.equals(this.regime, other.regime)) {
            return false;
        }
        if (!Objects.equals(this.nomeEmpregador, other.nomeEmpregador)) {
            return false;
        }
        if (!Objects.equals(this.limiteIdade, other.limiteIdade)) {
            return false;
        }
        if (!Objects.equals(this.nivelAcademico, other.nivelAcademico)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }   
}