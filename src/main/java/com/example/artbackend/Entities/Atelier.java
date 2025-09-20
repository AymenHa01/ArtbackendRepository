package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List; 

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Atelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String Description ;
    @Column(name = "active", nullable = true)
    private boolean active ;
    @OneToMany(mappedBy = "atelier" ,
            cascade = CascadeType.ALL
            , orphanRemoval = true

    )
    @JsonIgnore
    List<SousAtelier> sousateliers;
    private String image;
}
