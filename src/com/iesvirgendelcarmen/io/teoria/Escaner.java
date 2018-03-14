package com.iesvirgendelcarmen.io.teoria;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Escaner {

	public static void main(String[] args) {
		int numeroLineas   = 0;
		int numeroPalabras = 0;
		try (Scanner in = new Scanner(
				new File("ficheros/fichero2.txt"));)
		{
			while (in.hasNextLine()) {
				String linea = in.nextLine();
			//	System.out.println(linea);
				String[] palabras = linea.replaceAll("[,.;]","").split("\\s+");
			//	System.out.println(Arrays.toString(palabras));
				numeroLineas++;
				numeroPalabras += palabras.length;
			}
			//System.out.println("última línea: " + in.nextLine());
			/*in.reset();
			while (in.hasNext()) {
				in.next();
				numeroPalabras++;
			}*/
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}
		System.out.printf("Nº de líneas del fichero %d%n", numeroLineas);
		System.out.printf("Nº de palabras del fichero %d%n", numeroPalabras);
		
		
		try (Scanner in = new Scanner(
				new File("ficheros/fichero2.txt"));)
		{
			in.useDelimiter("[\\s+\n]");
			int contador = 0;
			while (in.hasNext()) {
				System.out.println(in.next().replaceAll("[,.;]",""));
				contador++;
			}
			System.out.println("Nº palabras: " + contador);
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}
	}

}
