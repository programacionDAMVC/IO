package com.iesvirgendelcarmen.io.teoria;

import java.io.File;

public class RecorreDirectorio {

	public static void main(String[] args) {
		File directorioPadre = new File ("ficheros");
		if (directorioPadre.exists())
			listarDirectorio(directorioPadre);
		else
			System.out.println("No existe el directorio");

	}

	private static void listarDirectorio(File directorioPadre) {
		//obtenemos el contenido del directorio
		File[] ficheros = directorioPadre.listFiles();
		for (File file : ficheros) {
			System.out.println("Fichero: " + file.getPath() 
			+ " " + file.length()+ " bytes");
			if (file.isDirectory())
				listarDirectorio(file);
			
		}
	}

}
