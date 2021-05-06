package com.lquirin.applicationRencontre.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class StyleDeJeux {
    //Attributs StyleDeJeux
    private int id;
    private String nom;

    @ManyToOne
    @JoinColumn(name = "id_jeux")
    private Jeux jeux;


    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public Jeux getJeux() { return jeux; }
    public void setJeux(Jeux jeux) { this.jeux = jeux; }

}
