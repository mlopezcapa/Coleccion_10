package ejercicio4;

import java.time.LocalDate;

import ejercicio3.Prestable;

public class DiscoPrestable extends Multimedia implements Prestable {

	private static final int TIEMPO_PRESTAMO = 1;
	// Propiedades
	private boolean prestado;
	private LocalDate fechaDevolucion;

	public DiscoPrestable(Formato formato, String titulo, String autor, int duracion) {
		super(formato, titulo, autor, duracion);
		setPrestado(false);
		setFechaDevolucion(null);
	}

	// Getters & Setters
	public boolean isPrestado() {
		return prestado;
	}

	void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	
	
	
	@Override
	public String toString() {
		String devolver = (isPrestado()) ? "DiscoPrestable [prestado= " + isPrestado() + ", fechaDevolucion=" + getFechaDevolucion() + "]":"No esta prestado.";
		return super.toString() + devolver;
	}

	// Tiempo de prestamo es de una semana
	@Override
	public LocalDate prestar() {
		if (!isPrestado()) {
			setPrestado(true);
			setFechaDevolucion(LocalDate.now().plusWeeks(TIEMPO_PRESTAMO));
		}
		return getFechaDevolucion();
	}

	@Override
	public LocalDate prestado() {
		return getFechaDevolucion();
	}

	@Override
	public void devolver() {
		setPrestado(false);
		setFechaDevolucion(null);
	}

}
