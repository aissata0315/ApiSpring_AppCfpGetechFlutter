/*package sn.aissata.demo.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Candidature implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @ManyToOne
    private Formation formationid;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    @ManyToOne
    //@JoinColumn(name = "idProfil")
    private Profil profilcandidat;

    public Candidature() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Formation getFormationid() {
        return formationid;
    }

    public void setFormationid(Formation formationid) {
        this.formationid = formationid;
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

    public Profil getProfilcandidat() {
        return profilcandidat;
    }

    public void setProfilcandidat(Profil profilcandidat) {
        this.profilcandidat = profilcandidat;
    }
}
*/