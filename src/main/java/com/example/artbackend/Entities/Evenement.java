package com.example.artbackend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String Description ;
    private Date dateDebut;
    private  Date dateFin;
    private Float prix ;
    private  String image ;
    @Column(nullable = true)
    private boolean isActive ;
    @OneToMany(mappedBy = "evenement" , cascade = CascadeType.ALL ,orphanRemoval = true )
    private  List<MediaEvent> media;

    public Evenement(int id ){
        this.id = id;
    }  
     public Evenement(int id, String name, String description, Date dateDebut, Date dateFin, Float prix, String image  , boolean isActive) {
        this.id = id;
        this.name = name;
        this.Description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
        this.image = image;
        this.isActive = isActive;
    }
    public Evenement(){}





}
