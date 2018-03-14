package com.iesvirgendelcarmen.io.ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) {
		final int TAMANNO = 100;
		try (DataOutputStream out = new DataOutputStream( 
				new BufferedOutputStream(
					new FileOutputStream("ficheros/ejercicios/ejercicio1.dat")));)
		{
			for (int i = 0; i < TAMANNO; i++) {
				float numero = (float) (Math.random() * 100);
				//System.out.println(numero);
				out.writeFloat(numero);
			}
			out.flush();
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} catch (IOException e1) {
			System.out.println("Problem I/O");
		}
		
		System.out.println("Fin de programa");
		//leer ese fichero binario
		File inFile = new File("ficheros/ejercicios/ejercicio1.dat");
		float suma =  0.0f;
		try (DataInputStream in = new DataInputStream( 
					new BufferedInputStream(
						new FileInputStream(inFile)));)
		{
			int tamanno = (int) inFile.length();
			for (int i = 0; i < tamanno/4; i++) {
				float numero = in.readFloat();
				System.out.println(numero);
				suma += numero;
			}
		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} catch (IOException e1) {
			System.out.println("Problem I/O");
		}
		System.out.printf("Valor de la suma %.3f%n", suma);
	}

}
