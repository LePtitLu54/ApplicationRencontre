package com.lquirin.applicationRencontre.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Utilisateur {

    //Attributs utilisateur
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 50)
    private String pseudo;

    private String password;

    @ManyToOne
    @JoinColumn( name = "id_statut")
    private Statut statut;

    private int age;
    private String typeConsole;
    private String lang;

    @ManyToMany
    @JoinTable( name = "T_Utilisateurs_TitresJeux_Associations",
            joinColumns = @JoinColumn( name = "idUtilisateur" ),
            inverseJoinColumns = @JoinColumn( name = "idTitreJeux" ) )
    private List<TitreJeux> titresJeux = new ArrayList<>();

    @ManyToMany
    @JoinTable( name = "T_Utilisateurs_Roles_Associations",
            joinColumns = @JoinColumn( name = "idUtilisateur" ),
            inverseJoinColumns = @JoinColumn( name = "idRole" ) )
    private List<Role> roles = new ArrayList<>();

    //Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPseudo() { return pseudo; }
    public void setPseudo(String pseudo) { this.pseudo = pseudo; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPays() { return pays; }
    public void setPays(String pays) { this.pays = pays; }

    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }

    public Statut getStatut() { return statut; }
    public void setStatut(Statut statut) { this.statut = statut; }

    public String getTypeConsole() { return typeConsole; }
    public void setTypeConsole(String typeConsole) { this.typeConsole = typeConsole; }

    public List<TitreJeux> getTitresJeux() { return titresJeux; }
    public void setTitresJeux(List<TitreJeux> titresJeux) { this.titresJeux = titresJeux; }

    public List<Role> getRoles() { return roles; }
    public void setRoles(List<Role> roles) { this.roles = roles; }

}


