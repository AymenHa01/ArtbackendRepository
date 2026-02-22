package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class adherent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JsonIgnore
    private Utilisateur utilisateur;
    private String type;
    private int idType;

<<<<<<< HEAD
    // Default constructor
    public adherent() {
    }

    // All-args constructor
=======
    public adherent() {
    }

>>>>>>> 1e2b1f2 (first commit)
    public adherent(int id, Utilisateur utilisateur, String type, int idType) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.type = type;
        this.idType = idType;
    }

<<<<<<< HEAD
    // Getters and Setters
=======
>>>>>>> 1e2b1f2 (first commit)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }
}

