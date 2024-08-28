package com.ar.libro.biblioteca.modelo;

import java.util.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Usuario extends Persona {
	
	@Column
	Date FechaAlta;
	
	@Column
	Date FechaBaja;

}
