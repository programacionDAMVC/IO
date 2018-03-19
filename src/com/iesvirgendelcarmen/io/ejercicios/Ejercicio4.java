package com.iesvirgendelcarmen.io.ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		List<Persona> listaPersonas = new ArrayList<>();
		Persona persona1 = new Persona("juanito", "garcía garcía",
				15, "calle nueva");
		Persona persona2 = new Persona("perdrito", "muñoz garcía",
				25, "calle vieja");
		Persona persona3 = new Persona("manolita", "garcía muñoz",
				23, "calle andalucía");
		Persona persona4 = new Persona("isabelita", "muñoz garcía",
				25, "calle nova");
		Persona persona5 = new Persona("felipe", "muñoz garcía",
				25, "calle madrid");
		listaPersonas.add(persona1);
		listaPersonas.add(persona2);
		listaPersonas.add(persona3);
		listaPersonas.add(persona4);
		listaPersonas.add(persona5);
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(
								"ficheros/ejercicios/ejercicio4.dat")));) 
		{
			/*out.writeObject(persona1);
			out.writeObject(persona2);
			out.writeObject(persona3);
			out.writeObject(persona4);
			out.writeObject(persona5);*/
			out.writeObject(listaPersonas);
			out.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File outFile = new File ("ficheros/ejercicios/ejercicio4.dat");
		if (outFile.exists()) {
			System.out.printf("Creado fichero %s%n de tamaño %d bytes%n",
					outFile, outFile.length());
		} else {
			System.out.println("No se ha podido crear el fichero");
		}

		//leemos esos datos desde el fichero:
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(
						outFile)));)
		{
			/*Object persona1Leida = in.readObject();
			System.out.println(persona1Leida);
			Object persona2Leida = in.readObject();
			System.out.println(persona2Leida);
			Persona persona3Leida = (Persona) in.readObject();
			System.out.println(persona3Leida);
			Persona persona4Leida = (Persona) in.readObject();
			System.out.println(persona4Leida);
			Persona persona5Leida = (Persona) in.readObject();
			System.out.println(persona5Leida);*/
			List<Persona> listaPersonasLeidas = 
					(List<Persona>) in.readObject();
			//System.out.println(listaPersonasLeidas);
			for (Persona persona : listaPersonasLeidas) {
				System.out.println(persona.getNombre());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
