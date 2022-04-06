package ejercicio3;

import java.time.LocalDate;

public class Libro extends Publicacion implements Prestable {

	private static final int TIEMPO_PRESTAMO = 1;
	private boolean prestado;
	private LocalDate fechaDevolucion;

	public Libro(String codigo, String titulo, int anio) {
		super(codigo, titulo, anio);
		setPrestado(false);
		setFechaDevolucion(null);
	}

	// Getters
	public boolean isPrestado() {
		return prestado;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	// Setters
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	@Override
	public LocalDate prestar() {
		if (!isPrestado()) {
			setPrestado(true);
			setFechaDevolucion(LocalDate.now().plusMonths(TIEMPO_PRESTAMO));
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

	@Override
	public String toString() {
		return super.toString() + (isPrestado() ? "Libro[Fecha de devolucion: ]" : "No prestado");
	}

}
