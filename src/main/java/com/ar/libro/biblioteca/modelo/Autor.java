package com.ar.libro.biblioteca.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity 
@Getter 
@Setter
public class Autor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	@Column(length = 10)
	int id;
	
	@Column(length = 60)
	String nombre;
	@Column
	String pais;
	@Column
	Date fechaNacimiento;
}
