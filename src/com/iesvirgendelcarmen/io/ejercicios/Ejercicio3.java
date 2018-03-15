package com.iesvirgendelcarmen.io.ejercicios;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*Scanner in = new Scanner(
		new File("ficheros/ejercicios/libro.txt"));*/
		Path source = Paths.get("ficheros/ejercicios/libro.txt");
		try (Scanner in = new Scanner(source);) 
		{
			Scanner scLineas = null;
			int contadorLineas = 0;
			int contadorPalabras = 0;
			while (in.hasNextLine()) {
				String linea = in.nextLine().
						replaceAll("[\\(\\),;\\.\\-—–:!¿¡?…»\\d]", "");
				 scLineas = new Scanner(linea);
				 while (scLineas.hasNext()) {
					 System.out.println(scLineas.next());
					 contadorPalabras++;
				 }
				 scLineas.close();
				//in.nextLine();
				contadorLineas++;
			}
			System.out.println("Líneas: " + contadorLineas);			
			System.out.println("Palabras: " + contadorPalabras);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
