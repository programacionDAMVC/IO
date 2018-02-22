package com.iesvirgendelcarmen.io.teoria;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheros {

	public static void main(String[] args) {
		//String carpeta = "ficheros/carpeta";
		//comprobar que hemos pasados dos argumentos
		if (args.length < 2) {
			System.out.println("Falta nombre de algún fichero");
			System.exit(1);
		}
		if (args[0].equals(args[1])) {
			System.out.println("No pueden ser igual fichero");
			System.exit(1);
		}
		File inFile = new File(args[0]);
		if ( !inFile.exists() || inFile.length() == 0 ) {
			System.out.println("No existe el fichero a copiar o "
					+ "está vacío" + inFile);
			System.exit(1);

		}
		try (FileInputStream inStream = new FileInputStream(inFile);
			 FileOutputStream outStream = new FileOutputStream(
					 args[1] )){
			int byteLeido;
			while ((byteLeido = inStream.read()) != -1) {
				//System.out.print((char) byteLeido);
				outStream.write(byteLeido);
				
			}
			outStream.flush();
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
