package ejercicio2;

public abstract class MensajeCorto implements Facturable {

	private static final String EXP_REG_TELEFONO = "^\\d{9,}$";

	private static final String EXP_REG_CORREO = "^.{1,30}\\@.{1,20}\\.[a-z]{3}$";

	private static final String EXP_REG_MENSAJE = "^.[^\\n]{160}$";

	// Propiedades
	private String mensaje;
	private String telefono;
	private String correo;

	// Constructor
	public MensajeCorto(String mensaje, String telefono, String correo) {
		try {
			setMensaje(mensaje);
			setTelefono(telefono);
			setCorreo(correo);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	// Getters y setters
	String getMensaje() {
		return mensaje;
	}

	void setMensaje(String mensaje) {
		if (!mensaje.matches(EXP_REG_MENSAJE)) {
			throw new IllegalArgumentException("El mensaje excede de los 160 caracteres");
		}
		this.mensaje = mensaje;
	}

	String getTelefono() {
		return telefono;
	}

	void setTelefono(String telefono) {
		if (!telefono.matches(EXP_REG_TELEFONO)) {
			throw new IllegalArgumentException("El telefono debe tener al menos 9 dígitos");
		}
		this.telefono = telefono;
	}

	String getCorreo() {
		return correo;
	}

	void setCorreo(String correo) {
		if (!correo.matches(EXP_REG_CORREO)) {
			throw new IllegalArgumentException("El correo no cumple con el formato nombre@subdominio.dominio");
		}
		this.correo = correo;
	}

	public String enviarMensaje() {
		return null;
	}

}
