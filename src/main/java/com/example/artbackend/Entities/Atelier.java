package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Atelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String Description;
    @Column(name = "active", nullable = true)
    private boolean active;
<<<<<<< HEAD
    @OneToMany(mappedBy = "atelier", cascade = CascadeType.ALL, orphanRemoval = true
=======
    @OneToMany(mappedBy = "atelier",
            cascade = CascadeType.ALL
            , orphanRemoval = true
>>>>>>> 1e2b1f2 (first commit)

    )
    @JsonIgnore
    List<SousAtelier> sousateliers;
    private String image;

<<<<<<< HEAD
    // Default constructor
    public Atelier() {
    }

    // All-args constructor
    public Atelier(int id, String name, String Description, boolean active, List<SousAtelier> sousateliers,
            String image) {
=======
    public Atelier() {
    }

    public Atelier(int id, String name, String Description, boolean active, List<SousAtelier> sousateliers, String image) {
>>>>>>> 1e2b1f2 (first commit)
        this.id = id;
        this.name = name;
        this.Description = Description;
        this.active = active;
        this.sousateliers = sousateliers;
        this.image = image;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<SousAtelier> getSousateliers() {
        return sousateliers;
    }

    public void setSousateliers(List<SousAtelier> sousateliers) {
        this.sousateliers = sousateliers;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

