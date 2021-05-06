package com.lquirin.applicationRencontre.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class TitreJeux {

    //attributs TitreJeux
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToMany
    @JoinTable( name = "T_Utilisateurs_TitresJeux_Associations",
            joinColumns = @JoinColumn( name = "idTitreJeux" ),
            inverseJoinColumns = @JoinColumn( name = "idUtilisateur" ) )
    private List<Utilisateur> utilisateurs = new ArrayList<>();

    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public List<Utilisateur> getUtilisateurs() { return utilisateurs; }
    public void setUtilisateurs(List<Utilisateur> utilisateurs) { this.utilisateurs = utilisateurs; }

}
