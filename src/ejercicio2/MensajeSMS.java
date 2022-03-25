package ejercicio2;

public class MensajeSMS extends MensajeCorto {

	public MensajeSMS(String mensaje, String telefono, String correo) {
		super(mensaje, telefono, correo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double facturar() {
		// TODO desarrollar metodo
		return 0.0;
	}
	
	@Override
	public String enviarMensaje() {
		// TODO desarrollar metodo
		return null;
	}
}
