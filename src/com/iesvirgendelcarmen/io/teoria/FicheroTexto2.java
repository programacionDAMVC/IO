package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//escribiendo usando writer
public class FicheroTexto2 {

	public static void main(String[] args) {
		
		File outFile = new File("ficheros/carpeta/out.txt");
		try (BufferedWriter outWriter = new BufferedWriter(
					new FileWriter(outFile,true));)
		{
			String mensaje = "Escribiendo en el fichero de texto";
			outWriter.write(mensaje);
			outWriter.newLine();
			outWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin de programa");

	}

}
