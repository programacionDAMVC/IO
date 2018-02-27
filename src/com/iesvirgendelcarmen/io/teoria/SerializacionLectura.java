package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.LocalDate;

//leer el contenido de ficheros/binarios/object.dat
//tiene escrito un entero con writeInt
//tiene escrito un String con writeObject
public class SerializacionLectura {

	public static void main(String[] args) {
		try (ObjectInputStream in = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									"ficheros/binarios/object.dat")));)
		{
			int numero = in.readInt();
			System.out.println("Número recuperado: " + numero);
			String cadena = (String) in.readObject();
			System.out.println("Cadena recuperada: " + cadena);
			LocalDate fecha = (LocalDate) in.readObject();
			System.out.println("Fecha recuperada: " + fecha);
			Persona persona = (Persona) in.readObject();
			System.out.println(persona);
			System.out.println(Persona.numeroPersona);
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Erro I/O");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
