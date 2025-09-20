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
public class SousAtelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String Description ;
    private String image ;
    @ManyToOne
    private Atelier atelier;
    private Float prix ;
    private boolean active;
    @OneToMany(mappedBy = "sousAtelier", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MediaSousAtelier> media;
    

}
