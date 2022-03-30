package ejercicio2;

public class MensajeEmail extends MensajeCorto {

	public MensajeEmail(String mensaje, String telefono, String correo) {
		super(mensaje, telefono, correo);
	}

	@Override
	public double facturar() {
		return .0;
	}

	@Override
	public String enviarMensaje() {
		String mensajeSalida;
		if (getMensaje().length() < 1) {
			mensajeSalida = "El texto del mensaje está vacío";
		} else {
			mensajeSalida = String.format("Mensaje enviado a la direccion electrinica %s", getCorreo());
		}
		return mensajeSalida;
	}
}
