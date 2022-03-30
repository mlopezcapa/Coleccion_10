package ejercicio2;

public class MensajeSMS extends MensajeCorto {

	public MensajeSMS(String mensaje, String telefono, String correo) {
		super(mensaje, telefono, correo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double facturar() {
		// TODO desarrollar metodo
		double coste;
		if (getTelefono().charAt(0) == 0) {
			coste = 0.45;
		} else {
			coste = 0.15;
		}
		return coste;
	}

	@Override
	public String enviarMensaje() {
		// TODO desarrollar metodo
		String mensajeSalida;
		if (getMensaje().length() < 1) {
			mensajeSalida = "El texto del mensaje está vacío";
		} else {
			mensajeSalida = String.format("Mensaje enviado al numero %s con un coste de %2f euros", getTelefono(),
					facturar());
		}
		return mensajeSalida;
	}
}
