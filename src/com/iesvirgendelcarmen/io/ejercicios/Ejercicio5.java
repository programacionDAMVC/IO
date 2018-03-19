package com.iesvirgendelcarmen.io.ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) { 
		//comprobación de los datos de entrada
		if ( args.length < 2) {
			System.out.println("Faltan argumentos");
			System.exit(1);
		}

		File inFile = new File(args[0]);
		if ( !inFile.exists()) {
			System.out.println("No existe el fichero: " + inFile);
			System.exit(2);
		}
		if ( !args[1].matches("\\d+") ) {
			System.out.println("Debes introducir un número");
			System.exit(3);
		}
		int numeroTrozos = Integer.parseInt(args[1]);
		int tamannoTrozo = (int) (inFile.length() / numeroTrozos);
		System.out.println("Nº de trozos: " + numeroTrozos);
		System.out.println("Tamaño de trozos: " + tamannoTrozo);

		//leemos el nombre de los ficheros de los trozos
		Scanner sc = new Scanner(System.in);
		File[] ficherosSalida = new File[numeroTrozos];
		System.out.println("Introduce el nombre de los ficheros");
		for (int i = 0; i < numeroTrozos; i++)
			ficherosSalida[i] = new File(sc.next());
		sc.close();
	//	System.out.println(Arrays.toString(ficherosSalida));


		BufferedOutputStream out = null;
		//leer fichero de entrada
		try (BufferedInputStream in  = new BufferedInputStream(
				new FileInputStream(inFile));
				)
		{
			
			for (int i = 0; i < numeroTrozos; i++) {
				 out = new BufferedOutputStream(
						new FileOutputStream(ficherosSalida[i]));
				int byteLeido;
				int contador = 0;
				while ((byteLeido = in.read()) != -1) {
					out.write(byteLeido);
					out.flush();
					contador++;
					//System.out.println(contador);
					if (contador % tamannoTrozo == 0
							&& i != numeroTrozos -1)
						break;
				}
			}

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
