package ejercicio2;

public class MensajeSMS extends MensajeCorto {

	// Constantes
	private static final double TARIFA_NACIONAL = 0.15;
	private static final double TARIFA_INTERNACIONAL = 0.45;

	// Constructor
	public MensajeSMS(String mensaje, String telefono, String correo) {
		super(mensaje, telefono, correo);
	}

	@Override
	public double facturar() {
		double coste;
		if (getTelefono().trim().charAt(0) == '0') {
			coste = TARIFA_INTERNACIONAL;
		} else {
			coste = TARIFA_NACIONAL;
		}
		return coste;
	}

	@Override
	public String enviarMensaje() {
		String mensajeSalida;
		if (getMensaje().length() < 1) {
			mensajeSalida = "El texto del mensaje está vacío";
		} else {
			mensajeSalida = String.format("Mensaje enviado al numero %s con un coste de %.2f euros", getTelefono(),
					facturar());
		}
		return mensajeSalida;
	}
}
