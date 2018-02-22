package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PruebaStramConBuffer {

	public static void main(String[] args) {
		try (FileInputStream inFileInputStream =
				new FileInputStream("ficheros/numeros.txt");){
			long startTime = System.nanoTime();
			int byteLeido;
			while ((byteLeido = inFileInputStream.read()) != -1) {
				
			}
			long stopTime = System.nanoTime();
			System.out.println("Tiempo de lectura " + 
			(stopTime - startTime) / 1_000_000.0 + "ms");
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		} catch (IOException e1) {
			System.out.println("Error I/O");
		}
		
		System.out.println("Ponemos un buffer");
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
					new FileInputStream("ficheros/numeros.txt"));){
			long startTime = System.nanoTime();
			int byteLeido;
			while ((byteLeido = bufferedInputStream.read()) != -1) {
			
			}
			long stopTime = System.nanoTime();
			System.out.println("Tiempo de lectura " + 
			(stopTime - startTime) / 1_000_000.0 + "ms");
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		} catch (IOException e1) {
			System.out.println("Error I/O");
		}
	}

}
