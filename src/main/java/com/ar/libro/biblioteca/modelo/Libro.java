package com.ar.libro.biblioteca.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	@Column(length = 10)
	int id;
	@Column(length = 60)
	String nombre;
	@Column
	int paginas;
	@Column
	int ejemplares;
	@Column(length = 60)
	String ubicacion;
	

	@ElementCollection
	@ListProperties("nombre, descripcion")
	Collection<Genero> genero;
	
	@ElementCollection
	@ListProperties("id, nombre")
	Collection<Autor> autor;
	
	

	
}
