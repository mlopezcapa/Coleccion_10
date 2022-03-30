package ejercicio3;

import java.time.LocalDate;

public abstract class Publicacion {

	private String codigo;
	private String titulo;
	private int anio;

	public Publicacion() {
		// TODO Auto-generated constructor stub
	}

	public Publicacion(String codigo, String titulo, int anio) {
		setCodigo(codigo);
		setTitulo(titulo);
		setAnio(anio);
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAnio(int anio) {
		LocalDate hoy = LocalDate.now();
		if (anio < 1500 || anio > hoy.getYear()) {
			throw new IllegalArgumentException("El año debe estar entre 1500 y el año actual");
		}
		this.anio = anio;
	}

	@Override
	public String toString() {
		return String.format("[Código: %s -- Título: %s --- Año: %d]\n", getCodigo(), getTitulo(), getAnio());
	}

}
