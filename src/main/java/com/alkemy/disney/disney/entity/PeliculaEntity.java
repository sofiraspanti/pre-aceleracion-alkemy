package com.alkemy.disney.disney.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name = "pelicula")
@Getter
@Setter
public class PeliculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;

    private String titulo;

    @Column(name = "fecha_creacion")
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate fechaCreacion; //VER

    private Long calificacion; //del 1 al 5

    //buscar informacion 
    // joineo la tabla genero. 
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)  //eager: inicializacion temprana (cuando pida un dato tipo pelicula,
    //si o si viene con el genero. cascade all: las acciones son consecuentes. 
    @JoinColumn(name = "genero_id", insertable = false, updatable = false) // se usa unicamente para obtener informacion
    private GeneroEntity genero;

    // guardar y actualizar
    //defino la columna en la bdd 
    @Column(name = "genero_id", nullable = false)
    private Long generoId;

    @ManyToMany(
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(
            name = "personajes_asociados",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id"))
    private List<PersonajeEntity> personajesAsociados = new ArrayList();
}
