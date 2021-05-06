package com.lquirin.applicationRencontre.model;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class Statut {

    //attributs Statut

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String denomination;

    @OneToMany(mappedBy = "statut")
    private List<Utilisateur> listeUtilisateur;



    //Getters and Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDenomination() {
        return denomination;
    }
    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public List<Utilisateur> getListeUtilisateur() {
        return listeUtilisateur;
    }
    public void setListeUtilisateur(List<Utilisateur> listeUtilisateur) {
        this.listeUtilisateur = listeUtilisateur;
    }


}



