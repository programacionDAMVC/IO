package examen;

public class Ciudad {

	private String nombreCiudad;
	private float latitud;
	private float longitud;
	private int numeroHabitantes;

	public Ciudad(String nombreCiudad, float latitud, float longitud, int numeroHabitantes) 
			throws LatitudException, LongitudException {
		if ( !(latitud >= -90 && latitud <= 90) )
			throw new LatitudException("latitud no válida");
		if ( !(longitud >=0 && longitud < 360) )
			throw new LongitudException();
		this.nombreCiudad = nombreCiudad;
		this.latitud = latitud;
		this.longitud = longitud;
		this.numeroHabitantes = numeroHabitantes;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public float getLatitud() {
		return latitud;
	}

	public float getLongitud() {
		return longitud;
	}

	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}

	@Override
	public String toString() {
		return "Ciudad: " + nombreCiudad +
				"- NumeroHabitantes: " + numeroHabitantes;
	}



}
