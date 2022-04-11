package com.alkemy.disney.disney.entity;


import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GeneroEntity {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    //@Column(name = "pelicula_asociada")
    //private List<PeliculaEntity> peliculasAsociadas;

}
