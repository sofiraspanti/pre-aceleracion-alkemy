package com.alkemy.disney.disney.entity;

import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String nombre;
    private Long edad;
    private Double peso;
    private String historia;
    @OneToMany
    @Column(name = "peli_asociada") //en la bdd las palabras se separan con _
    private List<PeliculaEntity> peliculaAsociada;

}
