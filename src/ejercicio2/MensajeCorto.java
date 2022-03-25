package ejercicio2;

public abstract class MensajeCorto implements Facturable {

	// Propiedades
	private String mensaje;
	private String telefono;
	private String correo;

	// Constructor
	public MensajeCorto(String mensaje, String telefono, String correo) {
		super();
		this.mensaje = mensaje;
		this.telefono = telefono;
		this.correo = correo;
	}

	// Getters y setters
	String getMensaje() {
		return mensaje;
	}

	void setMensaje(String mensaje) {
		// TODO validacion
		this.mensaje = mensaje;
	}

	String getTelefono() {
		return telefono;
	}

	void setTelefono(String telefono) {
		// TODO validacion
		this.telefono = telefono;
	}

	String getCorreo() {
		return correo;
	}

	void setCorreo(String correo) {
		// TODO validacion
		this.correo = correo;
	}

	public String enviarMensaje() {
		// TODO desarrollar método
		return null;
	}

}
