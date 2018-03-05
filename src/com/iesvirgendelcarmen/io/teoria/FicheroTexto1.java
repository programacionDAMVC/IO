package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FicheroTexto1 {

	public static void main(String[] args) {
		File inFile = new File("ficheros/fichero.txt");
		if ( !inFile.exists() || inFile.length() == 0) {
			System.out.println("Fichero no existe o tiene tamaño 0 bytes");
			return;
		}
		System.out.println("Fichero existe con tamaño " 
				+ inFile.length() + " bytes");
		
		//definimos el reader
		try (BufferedReader bReader = new BufferedReader(
					new FileReader(inFile));)
		{
			//leemos caracter a caracter
			/*int charLeido;
			while ((charLeido =  bReader.read()) != -1)
				System.out.println((char) charLeido);*/
			//leemos línea a línea (nuestro fichero tiene dos líneas)
			String linea;
			while ((linea = bReader.readLine()) != null)
				System.out.println(linea); 
				
		} catch (IOException e) {
			System.out.println("Error I/O");
		}

	}

}
