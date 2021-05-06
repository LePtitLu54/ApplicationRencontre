package com.lquirin.applicationRencontre.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Role {

    //attributs role

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String denomination;

    @ManyToMany
    @JoinTable( name = "T_Utilisateurs_Roles_Associations",
            joinColumns = @JoinColumn( name = "idRole" ),
            inverseJoinColumns = @JoinColumn( name = "idUtilisateur" ) )
    private List<Utilisateur> utlisateurs = new ArrayList<>();

    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDenomination() { return denomination; }
    public void setDenomination(String denomination) { this.denomination = denomination; }

    public List<Utilisateur> getUtlisateurs() { return utlisateurs; }
    public void setUtlisateurs(List<Utilisateur> utlisateurs) { this.utlisateurs = utlisateurs; }

}
