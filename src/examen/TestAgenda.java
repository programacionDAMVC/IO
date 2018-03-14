package examen;

import java.util.Scanner;

public class TestAgenda {

	public static void main(String[] args) {
		final int TAMANNO = 2;
		Agenda agendaTrabajo = new Agenda("TRABAJO");
		Scanner sc = new Scanner(System.in);
		
		//for (int i = 0; i < TAMANNO; i++) {
		while (true) {
			System.out.println("Introduce el nombre de contacto");
			String nombreContacto =  sc.nextLine();
			if (nombreContacto.toLowerCase().equals("fin"))
				break;
			if ( !(nombreContacto.toLowerCase().matches("[a-záéíóúüñ]+"))) {
				System.out.println("Nombre no válido");
				continue;
			}
			System.out.println("Introduce el teléfono fijo");
			
			String telefonoFijo = sc.nextLine();
			if ( !(telefonoFijo.matches("[0-9]{9}") )){
				System.out.println("Teléfono no válido");
				continue;
			}
			System.out.println("Introduce el teléfono móvil");
			String telefonoMovil = sc.nextLine();
			if ( !(telefonoMovil.matches("[0-9]{9}") )){
				System.out.println("Teléfono no válido");
				continue;
			}
			System.out.println("Introduce ciudad de residencia");
			String ciudadResidencia = sc.nextLine();
			if ( !(ciudadResidencia.toLowerCase().matches("[a-záéíóúüñ]+"))) {
				System.out.println("Nombre no válido");
				continue;
			}
			try {
				agendaTrabajo.annadirContacto(
						new Contacto(nombreContacto, telefonoFijo, telefonoMovil, ciudadResidencia));
			} catch (FijoExcepcion | MovilExcepcion e) {
				System.out.println("Telefono/s no válido/s");
			}
		}
		System.out.println(agendaTrabajo);

	}

}
