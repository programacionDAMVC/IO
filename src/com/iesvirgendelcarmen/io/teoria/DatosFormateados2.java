package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DatosFormateados2 {

	public static void main(String[] args) {
		List<String> listaNumeros = new ArrayList<>();
		

		try (DataInputStream dataInputStream = new DataInputStream (
				new BufferedInputStream(
						new FileInputStream("ficheros/numeros2.txt")));
			 DataOutputStream dataOutputStream =  new DataOutputStream(
					 new BufferedOutputStream(
							 new FileOutputStream("ficheros/numeros1.txt")));)
				{
			
			String numeroLeido ;
			while ((numeroLeido = dataInputStream.readLine()) != null) {
				listaNumeros.add(numeroLeido);
				dataOutputStream.writeChars(numeroLeido+"\n");
				dataOutputStream.flush();
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
