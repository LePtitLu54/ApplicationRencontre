package com.lquirin.applicationRencontre.model;

import javax.persistence.OneToMany;
import java.util.List;

public class Jeux {

    //attribut Jeux
    private int niveau;

    @OneToMany(mappedBy = "jeux")
    private List<StyleDeJeux> listeStyleDeJeux;


    //Getters and Setters
    public int getNiveau() { return niveau; }
    public void setNiveau(int niveau) { this.niveau = niveau; }

    public List<StyleDeJeux> getListeStyleDeJeux() { return listeStyleDeJeux; }
    public void setListeStyleDeJeux(List<StyleDeJeux> listeStyleDeJeux) { this.listeStyleDeJeux = listeStyleDeJeux; }

}
