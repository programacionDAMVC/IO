package examen;

public class Contacto {
	
	private String nombreContacto;
	private String telefonoFijo;
	private String telefonoMovil;
	private String ciudadDeResidencia;
	
	public Contacto(String nombreContacto, String telefonoFijo, String telefonoMovil, String ciudadDeResidencia)
			throws FijoExcepcion, MovilExcepcion {
		if ( !(telefonoFijo.startsWith("9")))
			throw new FijoExcepcion();
		if ( !(telefonoMovil.matches("^[67].*")))
			 throw new MovilExcepcion("Teléfono móvil no válido");
		this.nombreContacto = nombreContacto;
		this.telefonoFijo = telefonoFijo;
		this.telefonoMovil = telefonoMovil;
		this.ciudadDeResidencia = ciudadDeResidencia;
	}

	public String getNombreContacto() {
		return nombreContacto;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public String getCiudadDeResidencia() {
		return ciudadDeResidencia;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombreContacto + "- Telefono Fijo: " 
	+ telefonoFijo + "- Telefono Móvil: " + telefonoMovil;
	}
	
	

}
