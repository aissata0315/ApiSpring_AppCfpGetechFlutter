package sn.aissata.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Candidature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne()
    @JoinColumn(name = "idFormation", referencedColumnName = "id")
    private Formation formation;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
  /*  @ManyToOne
    //@JoinColumn(name = "idProfil")
    private Profil profilcandidat;*/

    public Candidature() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Formation getFormationid() {
        return formation;
    }

    public void setFormationid(Formation formationid) {
        this.formation = formationid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  /*  public Profil getProfilcandidat() {
        return profilcandidat;
    }

    public void setProfilcandidat(Profil profilcandidat) {
        this.profilcandidat = profilcandidat;
    }*/
}
