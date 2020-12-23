package sn.aissata.demo.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomProfil;
    @OneToMany(mappedBy = "profil")
    private List<Candidature> candidatures;
    public Profil() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProfil() {
        return nomProfil;
    }

    public void setNomProfil(String nomProfil) {
        this.nomProfil = nomProfil;
    }


}
