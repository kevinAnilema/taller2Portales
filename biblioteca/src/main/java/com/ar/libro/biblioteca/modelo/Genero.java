package com.ar.libro.biblioteca.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
public class Genero {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(length = 10)
	int codigo;
	@Column(length = 40)
	String nombre;
	@Column(length = 150)
	String descripcion;

}
