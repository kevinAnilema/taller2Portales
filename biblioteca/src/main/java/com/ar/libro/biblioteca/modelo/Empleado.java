package com.ar.libro.biblioteca.modelo;

import java.util.*;

import javax.persistence.*;

public class Empleado  extends Persona {
	
	@Column
	Date FechaIngreso;
	
	@Column
	double sueldo;
	

}
