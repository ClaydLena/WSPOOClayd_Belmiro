package model;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "tabela_funcionarios")
public class Funcionario implements DAOInterface, Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id; 
    @Column(name = "Nome")
    private String nome; 
    @Column(name = "Senha")
    private String senha;
    
    public Funcionario() {
    }

    public Funcionario(String Nome, String Senha) {
        this.nome = Nome;
        this.senha = Senha;
    }

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String Senha) {
        this.senha = Senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.Id);
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.senha);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

   
    @Override
    public String toString() {
        return "Funcionario{" + "Nome=" + nome + ", Senha=" + senha + "}";
    }     
}