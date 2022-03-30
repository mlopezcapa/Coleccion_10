package ejercicio2;

public class MensajeEmail extends MensajeCorto {

	// Constructor
	public MensajeEmail(String mensaje, String telefono, String correo) {
		super(mensaje, telefono, correo);
	}

	@Override
	public String enviarMensaje() {
		String mensajeSalida;
		if (getMensaje().isEmpty()) {
			mensajeSalida = "El texto del mensaje está vacío";
		} else {
			mensajeSalida = String.format("Mensaje enviado a la direccion electrinica %s", getCorreo());
		}
		return mensajeSalida;
	}
}
