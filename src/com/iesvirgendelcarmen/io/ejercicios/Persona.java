package com.iesvirgendelcarmen.io.ejercicios;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Persona implements Serializable{
	//Atributos: nombre, apellidos, edad y dirección.
	private String nombre;
	private String apellidos;
	private transient int edad;
	private String direccion;
	//Constructor que inicialice dichos atributos
	public Persona(String nombre, String apellidos, int edad, String direccion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.direccion = direccion;
	}
	//Los correspondientes getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", direccion=" + direccion
				+ "]";
	}

}
