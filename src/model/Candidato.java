package model;

import java.io.Serializable;
import java.util.Calendar;
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
@Table(name = "tabela_candidatos")
public class Candidato implements DAOInterface, Serializable, Comparable<Candidato> {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) 
    @Column(name = "ID")
    private Long Id; 
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Idade")
    private int idade;
    @Column(name = "Morada")
    private String morada;
    @Column(name = "Documento")
    private String nrDocumento;
    @Column(name = "Estado_Civil")
    private String estadoCivil; 
    @Column(name = "Nivel") 
    private String nivelAcademico; 
    @Column(name = "Curso") 
    private String curso;
    @Column(name = "Celular")
    private String nrCelular;
    @Column(name = "Email") 
    private String email;
    @Column(name = "Pontos") 
    private int pontos;

    public Candidato() {
    }

    public Candidato(String nome, int idade, String morada, String nrDocumento, String estadoCivil, String nivelAcademico, String curso, String nrCelular, String email, int pontos) {
        this.nome = nome;
        this.idade = idade;
        this.morada = morada;
        this.nrDocumento = nrDocumento;
        this.estadoCivil = estadoCivil;
        this.nivelAcademico = nivelAcademico;
        this.curso = curso;
        this.nrCelular = nrCelular;
        this.email = email;
        this.pontos = pontos;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getNrDocumento() {
        return nrDocumento;
    }

    public void setNrDocumento(String nrDocumento) {
        this.nrDocumento = nrDocumento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNrCelular() {
        return nrCelular;
    }

    public void setNrCelular(String nrCelular) {
        this.nrCelular = nrCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.Id);
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + this.idade;
        hash = 31 * hash + Objects.hashCode(this.morada);
        hash = 31 * hash + Objects.hashCode(this.nrDocumento);
        hash = 31 * hash + Objects.hashCode(this.estadoCivil);
        hash = 31 * hash + Objects.hashCode(this.nivelAcademico);
        hash = 31 * hash + Objects.hashCode(this.curso);
        hash = 31 * hash + Objects.hashCode(this.nrCelular);
        hash = 31 * hash + Objects.hashCode(this.email);
        hash = 31 * hash + this.pontos;
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
        final Candidato other = (Candidato) obj;
        if (this.idade != other.idade) {
            return false;
        }
        if (this.pontos != other.pontos) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.morada, other.morada)) {
            return false;
        }
        if (!Objects.equals(this.nrDocumento, other.nrDocumento)) {
            return false;
        }
        
        if (!Objects.equals(this.estadoCivil, other.estadoCivil)) {
            return false;
        }
        if (!Objects.equals(this.nivelAcademico, other.nivelAcademico)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        if (!Objects.equals(this.nrCelular, other.nrCelular)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Candidato{" + "Id=" + Id + ", nome=" + nome + ", idade=" + idade + ", morada=" + morada + ", nrDocumento=" + nrDocumento + ", estadoCivil=" + estadoCivil + ", nivelAcademico=" + nivelAcademico + ", curso=" + curso + ", nrCelular=" + nrCelular + ", email=" + email + ", pontos=" + pontos + '}';
    }
    
    
     public Integer calculaIdade(String data) {
        int idade;
        String anoStr = data.substring(6,10);
        int ano = Integer.parseInt(anoStr);
        int anoActual = Calendar.getInstance().get(Calendar.YEAR);
        
         idade = anoActual-ano;
         
         if (idade>=18){
            return idade;
         } else {
             return 0;
         }
    }

    @Override
    public int compareTo(Candidato pcand) {
        return (this.pontos-pcand.getPontos());  
    }
}