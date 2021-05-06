package com.lquirin.applicationRencontre.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@EntityListeners(AuditingEntityListener.class)
@IdClass(Amitie.AmitieKey.class)
public class Amitie {

    @Id
    private int utilisateur1Id;
    @Id
    private int utilisateur2Id;

    @ManyToOne
    @MapsId("utilisateur_1_id")
    @JoinColumn(name = "utilisateur_1_id")
    private Utilisateur utilisateur1;

    @ManyToOne
    @MapsId("utilisateur_2_id")
    @JoinColumn(name = "utilisateur_2_id")
    private Utilisateur utilisateur2;

    private boolean accepte;

    @Embeddable
    class AmitieKey implements Serializable{

        @Column[name = "utilisateur_1_id"]
        Integer utilisateur1Id;

        @Column[name = "utilisateur_2_id"]
        Integer utilisateur2Id;


        //Getters and Settters
        
        public Integer getUtilisateur1Id() { return utilisateur1Id; }
        public void setUtilisateur1Id(Integer utilisateur1Id) { this.utilisateur1Id = utilisateur1Id; }

        public Integer getUtilisateur2Id() { return utilisateur2Id; }
        public void setUtilisateur2Id(Integer utilisateur2Id) { this.utilisateur2Id = utilisateur2Id;}
    }


    //Getters and Setters
    public int getUtilisateur1Id() { return utilisateur1Id; }
    public void setUtilisateur1Id(int utilisateur1Id) { this.utilisateur1Id = utilisateur1Id; }

    public int getUtilisateur2Id() { return utilisateur2Id; }
    public void setUtilisateur2Id(int utilisateur2Id) { this.utilisateur2Id = utilisateur2Id; }

    public Utilisateur getUtilisateur1() { return utilisateur1; }
    public void setUtilisateur1(Utilisateur utilisateur1) { this.utilisateur1 = utilisateur1; }

    public Utilisateur getUtilisateur2() { return utilisateur2; }
    public void setUtilisateur2(Utilisateur utilisateur2) { this.utilisateur2 = utilisateur2; }

    public boolean isAccepte() { return accepte; }
    public void setAccepte(boolean accepte) { this.accepte = accepte; }
}
