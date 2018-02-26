package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatosFormateados1 {

	public static void main(String[] args) {
		List<Long> listaNumeros = new ArrayList<>();
		String numeroLeido = "";


		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(
				new FileInputStream("ficheros/numeros2.txt"));){

			int byteLeido;
			while ((byteLeido = bufferedInputStream.read()) != -1) {
				if (Character.isDigit( (char) byteLeido)){
					numeroLeido += (char) byteLeido;
				}
				else {
					listaNumeros.add(Long.parseLong(numeroLeido));
					numeroLeido = "";
				}
			}

			System.out.println(listaNumeros.get(0) + "-" + 
					listaNumeros.get(listaNumeros.size() -1));
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no existe");
		} catch (IOException e1) {
			System.out.println("Error I/O");
		}

	}

}
