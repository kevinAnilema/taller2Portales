package com.ar.libro.biblioteca.modelo;

import javax.persistence.*;

import org.hibernate.validator.constraints.*;
import org.openxava.annotations.*;

import lombok.*;
@Entity @Getter @Setter
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Hidden
	@Column(length = 10)
	int id;
	
	@Column(length = 15)
	@UniqueElements
	String cedula;
	
	@Column(length = 60)
	String nombre;
	@Column(length = 60)
	String apellido;
	@Column(length = 60)
	String direccion;
	@Column(length = 15)
	String telefono;
	@Column(length = 150)
	String correo;
	

}
