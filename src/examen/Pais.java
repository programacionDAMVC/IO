package examen;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	private String nombrePais;
	private List<Ciudad> listaCiudades = new ArrayList<>();
	
	public Pais(String nombrePais) {
		this.nombrePais = nombrePais;
	} 
	
	public void annadirCiudad (Ciudad ciudad) {
		listaCiudades.add(ciudad);
	}
	
	public Ciudad obtenerCiudadConMasHabitantes() {
		int numeroHabitantes = 0;
		Ciudad ciudaMasHabitada = null;
		for (Ciudad ciudad : listaCiudades) {
			if (ciudad.getNumeroHabitantes() > numeroHabitantes) {
				ciudaMasHabitada = ciudad;
				numeroHabitantes = ciudad.getNumeroHabitantes();
			}
		}
		
		return null;
	}
	
	public boolean existeCiudad (String nombreCiudad) {
		for (Ciudad ciudad : listaCiudades) {
			if (ciudad.getNombreCiudad().equalsIgnoreCase(nombreCiudad))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Pais " + nombrePais + "\n" + listaCiudades;
	}
	
	
}
