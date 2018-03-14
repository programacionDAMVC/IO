package examen;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nombreAgenda;
	private List<Contacto> listaContactos = new ArrayList<>();

	public Agenda(String nombreAgenda) {
		this.nombreAgenda = nombreAgenda;
	}

	public void annadirContacto(Contacto contacto) {
		listaContactos.add(contacto);
	}

	public List<Contacto> obtenerCiudadesDeLaMismaResidencia
	(String nombreResidencia){
		List<Contacto> listaCiudadesMismaResidencia =
				new ArrayList<>();
		for (Contacto contacto : listaContactos) {
			if (contacto.getCiudadDeResidencia().
					equalsIgnoreCase(nombreResidencia))
				listaCiudadesMismaResidencia.add(contacto);
		}
		return listaCiudadesMismaResidencia;
	}

	public int obtenerContactoMismaCiudad(String nombreResidencia) {
		return obtenerCiudadesDeLaMismaResidencia(nombreResidencia)
				.size();
	}

	public Contacto obtenerContactoPorTelefono(String telefono) {
		
		for (Contacto contacto : listaContactos) {
			if (contacto.getTelefonoFijo().equals(telefono) ||
					contacto.getTelefonoMovil().equals(telefono))
				return contacto;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Agenda " + nombreAgenda + "\n" + listaContactos;
	}
	
	
}
