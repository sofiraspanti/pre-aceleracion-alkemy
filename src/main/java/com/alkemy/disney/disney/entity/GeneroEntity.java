package com.alkemy.disney.disney.entity;

import javax.persistence.*;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "genero")
@Getter
@Setter
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    //@Column(name = "pelicula_asociada")
    //private List<PeliculaEntity> peliculasAsociadas;

}
