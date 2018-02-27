package com.iesvirgendelcarmen.io.teoria;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persona implements Serializable {
	private String nombre;
	private String apellidos;
	private transient  int edad;
	public static int numeroPersona = 0;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		numeroPersona++;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
}
