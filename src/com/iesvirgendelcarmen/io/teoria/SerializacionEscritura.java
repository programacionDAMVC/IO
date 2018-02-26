package com.iesvirgendelcarmen.io.teoria;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacionEscritura {

	public static void main(String[] args) {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream("ficheros/binarios/object.dat")));){
			objectOutputStream.writeInt(12);
			objectOutputStream.writeObject("hola");
			objectOutputStream.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
