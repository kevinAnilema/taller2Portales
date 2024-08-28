package com.ar.libro.biblioteca.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Prestamo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	@Column(length = 10)
	int id;
	
	@Column
	Date FechaSalida;
	
	@Column
	Date FechaRegreso;
	
	@Column
	boolean devuelto;
	
	@ManyToOne
	Usuario usuario;
	
	@ManyToOne
	Libro libro;
	

}
