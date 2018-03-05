package com.iesvirgendelcarmen.io.teoria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FicherosAccesoAleatorio {

	public static void main(String[] args) {
		try (RandomAccessFile inout = new RandomAccessFile
					("ficheros/binarios/inout.dat", "rw");)
		{
			//posicionamos a la posicion 0
			inout.setLength(0);
			//escribimos 200 nº de tipo double
			for (int i = 0; i < 200; i++) {
				inout.writeDouble(i);
			}
			System.out.printf("Tamaño del fichero %d%n", inout.length());
			//accedemos a la primera posición
			inout.seek(0);
			//leemos el valor de esa posición
			System.out.printf("Valor de posición %d: %.2f%n", 0, inout.readDouble());
			System.out.printf("Posición del puntero: %d%n", inout.getFilePointer());
			System.out.printf("Valor de posición %d: %.2f%n", 0, inout.readDouble());
			System.out.printf("Posición del puntero: %d%n", inout.getFilePointer());
			System.out.printf("Valor de posición %d: %d%n", 0, inout.readInt());
			System.out.printf("Posición del puntero: %d%n", inout.getFilePointer());
			inout.skipBytes(4);
			System.out.printf("Posición del puntero: %d%n", inout.getFilePointer());
			System.out.printf("Valor de posición %d: %.2f%n", 0, inout.readDouble());
			//nos vamos al final del fichero
			inout.seek(inout.length());
			inout.writeInt(1000);
			System.out.printf("Tamaño del fichero %d%n", inout.length());
			//posición para leer el nº entero
			inout.seek(inout.length() - 4);
			System.out.printf("Valor del entero: %d%n", inout.readInt());


		} catch (IOException e) {
			System.out.println("Error I/O");
		}

	}

}
