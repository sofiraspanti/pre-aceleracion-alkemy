package com.alkemy.disney.disney.entity;

import java.time.LocalDate;
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
    @ManyToOne
    private GeneroEntity genero;
    //@Column(name = "personajes_asociados")
    //private List<PersonajeEntity> personajesAsociados

}
