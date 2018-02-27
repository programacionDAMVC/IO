package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//leer con scanner 5 valores float
//los vamos a escribir a un fichero 
//pero escribimos de 4 bytes en 4 bytes
//porque los float necesitan 4 bytes para su representación
public class DatosFormateados3 {

	public static void main(String[] args) {
		final int TAMANNO = 5; 
		System.out.println("Escribe cinco float");


		try (DataOutputStream out = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(
								"ficheros/binarios/float.dat")));
				Scanner sc = new Scanner(System.in);)
		{
			//float[] numeros = new float[TAMANNO];
			for (int i = 0; i < TAMANNO; i++) {
				out.writeFloat(sc.nextFloat());
			}
			out.flush();

		} catch (IOException e1) {
			System.out.println("Error I/O");
		}

		try (BufferedInputStream in1 = new BufferedInputStream(
				new FileInputStream(
						"ficheros/binarios/float.dat"));)
		{
			int byteLeido;
			int contador = 0;
			while ((byteLeido = in1.read()) != -1) {
				if (contador % 4 == 0) {
					System.out.println();
				}
				System.out.print (byteLeido);
				contador++;
			}
			System.out.println();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try (DataInputStream in2 = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(
								"ficheros/binarios/float.dat")));)
		{
			while (in2.available() != 0)
				System.out.println(in2.readFloat());



		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 				
		System.out.println("Terminado programa");

	}

}
