package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class MediaFormation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Path;

    @ManyToOne
    @JsonIgnore
    private Formation formation;

<<<<<<< HEAD
    // Default constructor
    public MediaFormation() {
    }

    // All-args constructor
=======
    public MediaFormation() {
    }

>>>>>>> 1e2b1f2 (first commit)
    public MediaFormation(int id, String Path, Formation formation) {
        this.id = id;
        this.Path = Path;
        this.formation = formation;
    }

<<<<<<< HEAD
    // Getters and Setters
=======
    public MediaFormation(String Path, Formation formation) {
        this.Path = Path;
        this.formation = formation;
    }

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

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }
}
