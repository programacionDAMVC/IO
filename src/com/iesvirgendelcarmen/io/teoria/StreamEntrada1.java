package com.iesvirgendelcarmen.io.teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StreamEntrada1 {

	public static void main(String[] args) {
		
		File inFile = new File("ficheros/fichero.txt");
		if ( !inFile.exists() || inFile.length() == 0) {
			System.out.println("Fichero no existe o tiene tamaño 0 bytes");
			return;
		}
		System.out.println("Fichero existe con tamaño " 
				+ inFile.length() + " bytes");
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(inFile);
		/*	int byteLeido = fileInputStream.read();
			System.out.println(byteLeido);
			byteLeido = fileInputStream.read();
			System.out.println(byteLeido);
			byteLeido = fileInputStream.read();
			System.out.println(byteLeido);
			byteLeido = fileInputStream.read();
			System.out.println(byteLeido);
			byteLeido = fileInputStream.read();
			System.out.println(byteLeido);*/
			
			int byteLeido;
			while (( byteLeido = fileInputStream.read() ) != -1) {
				System.out.println(byteLeido);
				System.out.println( (char) byteLeido );
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Error I/O");
		} finally {
			try {
				fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
