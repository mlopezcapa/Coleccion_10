package ejercicio6;

public class Futbolista implements Comparable<Futbolista> {

	// Propiedades
	private String dni, nombre;
	private int edad, goles;

	// Constructor
	public Futbolista(String dni, String nombre, int edad, int goles) {
		try {
			setDni(dni);
			setNombre(nombre);
			setEdad(edad);
			setGoles(goles);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}

	// Getters y Setters
	String getDni() {
		return dni;
	}

	void setDni(String dni) {
		String expRegDni = "^\\d{8}[A-Z]$";
		if (!dni.matches(expRegDni)) {
			throw new IllegalArgumentException("El dni debe contener 8 numeros y una letra");
		}
		this.dni = dni;
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		if (nombre.length() < 5 || nombre.length() > 100) {
			throw new IllegalArgumentException("El nombre debe tener entre 5 y 100 caracteres");
		}
		this.nombre = nombre;
	}

	int getEdad() {
		return edad;
	}

	void setEdad(int edad) {
		if (edad < 16 || edad > 99) {
			throw new IllegalArgumentException("La edad debe estar comprendida entre los 16 y los 99 años");
		}
		this.edad = edad;
	}

	int getGoles() {
		return goles;
	}

	void setGoles(int goles) {
		if (goles < 0) {
			throw new IllegalArgumentException("El numero de goles debe ser un numero entero positivo");
		}
		this.goles = goles;
	}

	@Override
	public String toString() {
		return String.format("[Dni = %s --- Nombre = %s --- Edad = %d --- Goles = %d]", getDni(), getNombre(),
				getEdad(), getGoles());
	}

	@Override
	public boolean equals(Object o) {
		boolean sonIguales = false;

		if (o instanceof Futbolista) {
			Futbolista otroF = (Futbolista) o;
			if (this.getDni() == otroF.getDni()) {
				sonIguales = true;
			}
		}

		return sonIguales;

	}

	// Utilizamos el metodo para comparar cadenas.
	@Override
	public int compareTo(Futbolista o) {
		return this.getDni().compareTo(o.getDni());
	}

}
