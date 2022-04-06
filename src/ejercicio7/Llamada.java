package ejercicio7;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Llamada implements Comparable<Llamada> {
	// Hay que usar duration() y LocalDateTime()
	static final String VALIDAR_TELEFONO = "(^0\\d{6,15}$)|(^[679]\\d{8}$)";

	// PROPIEDADES
	private int origen;
	private int destino;
	private boolean esSaliente;
	private LocalDateTime inicioLlamada;
	private LocalDateTime finLlamada;
	private Zonas zona;

	// Getters
	public int getOrigen() {
		return origen;
	}

	public int getDestino() {
		return destino;
	}

	public boolean isEsSaliente() {
		return esSaliente;
	}

	public LocalDateTime getInicioLlamada() {
		return inicioLlamada;
	}

	public LocalDateTime getFinLlamada() {
		return finLlamada;
	}

	public Zonas getZona() {
		return zona;
	}

	// Setters
	private void setOrigen(int origen) {
		if (Integer.toString(origen).matches(VALIDAR_TELEFONO)) {
			this.origen = origen;
		} else {
			throw new IllegalArgumentException("Telefono de origen no válido");
		}

	}

	private void setDestino(int destino) {
		if (Integer.toString(origen).matches(VALIDAR_TELEFONO)) {
			this.destino = destino;
		} else {
			throw new IllegalArgumentException("Telefono de destino no válido");
		}

	}

	private void setHoras(LocalDateTime inicioLlamada, LocalDateTime finLlamada) {
		if (finLlamada.isBefore(inicioLlamada)) {
			throw new IllegalArgumentException("La hora de fin no puede ser anterior a la hora de inicio");
		} else {
			this.inicioLlamada = inicioLlamada;
			this.finLlamada = finLlamada;
		}
	}

	// Constructores
	public Llamada(int origen, int destino, LocalDateTime inicioLlamada, LocalDateTime finLlamada) {
		// TODO Auto-generated constructor stub
		setOrigen(origen);
		setDestino(destino);
		setHoras(inicioLlamada, finLlamada);
		this.esSaliente = false;
	}

	public Llamada(int origen, int destino, LocalDateTime inicioLlamada, LocalDateTime finLlamada, Zonas zona) {
		// TODO Auto-generated constructor stub
		setOrigen(origen);
		setDestino(destino);
		setHoras(inicioLlamada, finLlamada);
		this.zona = zona;
		this.esSaliente = true;
	}

	// Métodos
	public double calcularCoste() {
		double coste;
		if (!isEsSaliente()) {
			coste = 0;
		} else {
			Duration duracion = Duration.between(getInicioLlamada(), getFinLlamada());
			double costePorMinuto = getZona().getCoste();
			long minutos = (duracion.toSeconds() / 60) + (duracion.toSeconds() % 60 == 0 ? 0 : 1);
			coste = costePorMinuto * minutos;
		}
		return coste;
	}

	// Ordenacion natural implementando la interfaz Comparable<> que es lo
	// ordenacion por defecto que nosotros desarrollemos dentro del metodo.
	@Override
	public int compareTo(Llamada o) {
		int resultado;
		Integer numero1 = Integer.valueOf(this.getOrigen());
		Integer numero2 = Integer.valueOf(o.getOrigen());
		resultado = numero1.compareTo(numero2);
		if (resultado == 0) {
			resultado = this.getInicioLlamada().compareTo(getFinLlamada());
		}
		return resultado;
	}

	public static void main(String[] args) {
		Llamada llamadaLocal = new Llamada(666777888, 914445556, LocalDateTime.of(2022, 4, 4, 12, 0),
				LocalDateTime.of(2022, 4, 4, 12, 30));
		Llamada llamadaRemota = new Llamada(666777888, 914445556, LocalDateTime.of(2022, 4, 4, 11, 0),
				LocalDateTime.of(2022, 4, 4, 12, 30, 1), Zonas.SUR);
		System.out.println("El coste de la primera llamada es: " + llamadaLocal.calcularCoste());
		System.out.println("El coste de la segunda llamada es: " + llamadaRemota.calcularCoste());

		System.out.println(llamadaLocal.compareTo(llamadaRemota) < 0 ? "La primera llamada es menor"
				: "La primera llamada es mayor");
	}
}
