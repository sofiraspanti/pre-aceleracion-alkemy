package com.alkemy.disney.disney.entity;

import java.util.ArrayList;
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

    @ManyToMany(mappedBy = "personajesAsociados", cascade = CascadeType.ALL) //cuando creo una pelicula, puedo pasarle una lista de
    //personajes. Pero cuando creo un personaje no le puedo pasar una lista de peliculas para que los cree. Quien se hace 
    // cargo de la relacion es la peliula
    private List<PeliculaEntity> peliculaAsociadas = new ArrayList<>();

}
