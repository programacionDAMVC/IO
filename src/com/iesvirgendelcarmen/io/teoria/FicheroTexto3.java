package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

//programa que escribe texto formateado
//en fichero de texto usando printstream
//o printwriter
public class FicheroTexto3 {
	
	public static void main(String[] args) {
		
		List<Float> listaFloats = new ArrayList<>();
		//System.out.println(generarFloat(1_000));
		for (int i = 0; i < 50; i++) {
			listaFloats.add(generarFloat(1_000));
		}
	//	System.out.println(listaFloats);
		imprimirDatos(listaFloats);
	}
	
	public static float generarFloat(int multiplicador) {
		
		return (float) (Math.random() * multiplicador);
		
	}
	
	public static void imprimirDatos(List<Float> lista) {
		try (//PrintStream out = new PrintStream("ficheros/carpeta/salida.txt");
			PrintStream out = new PrintStream(
					new BufferedOutputStream(
							new FileOutputStream(
									"ficheros/carpeta/salida.txt")),true))
		{
			for (int i = 0; i < lista.size(); i++) {
				if ( i % 5 == 0 && i != 0 ) {
					System.out.println();
					out.println();
				}
				System.out.printf("%10.2f", lista.get(i));
				out.printf("%10.2f", lista.get(i));
			}
			//out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
