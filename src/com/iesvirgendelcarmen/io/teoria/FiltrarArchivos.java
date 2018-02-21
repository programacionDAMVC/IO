package com.iesvirgendelcarmen.io.teoria;

import java.io.File;
import java.io.FilenameFilter;

public class FiltrarArchivos {

	public static void main(String[] args) {
		File directorioRaiz = new File("ficheros/carpeta");
		String[] nombreFicherosTXT = null;
		if (directorioRaiz.exists()) {
			nombreFicherosTXT = directorioRaiz.list(
					new FilenameFilter() {

						@Override
						public boolean accept(File dir, String name) {
							// TODO Auto-generated method stub
						
							return name.endsWith(".txt");
						}
					});
			
			
		}
		for (String ficheroTXT : nombreFicherosTXT) {
			System.out.println(ficheroTXT + " " + ficheroTXT.length());
		}
	}

}
