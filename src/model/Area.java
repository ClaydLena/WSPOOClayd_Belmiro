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
@Table(name = "tabela_Areas")
public class Area implements DAOInterface, Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)  
    @Column(name = "ID")
    private Long Id;     
    @Column(name = "Areas")
    private String area;
    
    public Area() {
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

  
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.Id);
        hash = 59 * hash + Objects.hashCode(this.area);
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
        final Area other = (Area) obj;
        if (!Objects.equals(this.area, other.area)) {
            return false;
        }
        return Objects.equals(this.Id, other.Id);
    }
    
    @Override
    public String toString() {
        return this.getArea();
    } 
}