package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class MediaEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Path;
    @ManyToOne
    @JsonIgnore
    private Evenement evenement;

<<<<<<< HEAD
    // Default constructor
    public MediaEvent() {
    }

    // All-args constructor
=======
    public MediaEvent() {
    }

>>>>>>> 1e2b1f2 (first commit)
    public MediaEvent(int id, String Path, Evenement evenement) {
        this.id = id;
        this.Path = Path;
        this.evenement = evenement;
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

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public Evenement getEvenement() {
        return evenement;
    }

    public void setEvenement(Evenement evenement) {
        this.evenement = evenement;
    }
}

