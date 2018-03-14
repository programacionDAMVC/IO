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
			int contadorLineas = 0;
			while (in.hasNextLine()) {
				System.out.println(in.nextLine().
						replaceAll("[,;\\.\\-—:!¿¡?…»\\d]", ""));
				//in.nextLine();
				contadorLineas++;
			}
			System.out.println(contadorLineas);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
