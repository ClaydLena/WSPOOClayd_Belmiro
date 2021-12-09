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
@Table(name = "tabela_empregadores")
public class Empregador implements DAOInterface, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id;
    @Column(name = "Nome")
    private String nomeEmpregador;
    
    public Empregador() {
    }

    public Empregador(String nomeEmpregador) {
        this.nomeEmpregador = nomeEmpregador;
    }

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(Long idEmpregador) {
        this.Id = idEmpregador;
    }

    public String getNomeEmpregador() {
        return nomeEmpregador;
    }

    public void setNomeEmpregador(String NomeEmpregador) {
        this.nomeEmpregador = NomeEmpregador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Id);
        hash = 41 * hash + Objects.hashCode(this.nomeEmpregador);
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
        final Empregador other = (Empregador) obj;
        if (!Objects.equals(this.nomeEmpregador, other.nomeEmpregador)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return this.getNomeEmpregador();
    }
}