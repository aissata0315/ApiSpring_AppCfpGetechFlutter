package sn.aissata.demo.entities;

import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomdep;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idResponsable", referencedColumnName = "id")
    private Responsable responsabledep;
   /* @OneToMany
    private List<Formation> formations;*/

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomdep() {
        return nomdep;
    }

    public void setNomdep(String nomdep) {
        this.nomdep = nomdep;
    }

    public Responsable getResponsabledep() {
        return responsabledep;
    }

    public void setResponsabledep(Responsable responsabledep) {
        this.responsabledep = responsabledep;
    }

   /* public List<Formation> getFormations() {
        return formations;
    }

    public void setFormations(List<Formation> formations) {
        this.formations = formations;
    }*/
}
