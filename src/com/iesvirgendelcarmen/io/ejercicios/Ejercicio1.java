package com.iesvirgendelcarmen.io.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		try (PrintWriter out = new PrintWriter(
				"ficheros/ejercicios/ejercicio1.txt");)
		{
			for (int i = 0; i < 100; i++) {
				int numeroAleatorio = (int) ( Math.random() * 100 ) ;
				out.print(numeroAleatorio);
				if (i != 99)
					out.print('-');
			}
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		}
		int suma = 0;
		try (Scanner in = new Scanner(new File(
					"ficheros/ejercicios/ejercicio1.txt"));)
		{
			in.useDelimiter("-");
			while (in.hasNextInt())
				suma += in.nextInt();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("La suma vale: " + suma);

	}

}
