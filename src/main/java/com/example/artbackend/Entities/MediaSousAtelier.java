package com.example.artbackend.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MediaSousAtelier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Path;

    @ManyToOne
    @JsonIgnore
    private SousAtelier sousAtelier;

    public MediaSousAtelier(String Path , SousAtelier sousAtelier){
        this.Path = Path;
        this.sousAtelier = sousAtelier;
    }


    
}
