package ejercicio4;

enum Formato {
	wav, mp3, wma, avi, mov, mp4, wmv, swf
}

public class Multimedia {

	Formato formato;
	private String titulo;
	private String autor;
	private int duracion;

	public Multimedia(Formato formato, String titulo, String autor, int duracion) {
		super();
		setformato(formato);
		setTitulo(titulo);
		setAutor(autor);
		setDuracion(duracion);
	}

	public Formato getformato() {
		return formato;
	}

	public void setformato(Formato formato) {
		this.formato = formato;
	}

//	public void setformato(String formato) {
//		this.formato = Formatos.valueOf(formato);
//	} 
//	Esto nos permite pasar los valores de un enum en forma de cadena, 
//	pero tendriamos que cambiar el tipo de dato tambien del constructor. 

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Multimedia [formato=" + formato + ", titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion
				+ "]";
	}

	public boolean equals(Multimedia obj2) {
		boolean sonIguales = false;
		if (obj2 instanceof Multimedia) { // comprobamos que el objeto pertenece a la clase
			Multimedia obj1 = (Multimedia) obj2; // instanciamos un nuevo objeto
			if (getAutor().equalsIgnoreCase(obj1.getAutor())) { // comprobamos que tienen el mismo autor
				if (getTitulo().equalsIgnoreCase(obj1.getTitulo())) { // comprobamos que tienen el mismo titulo
					sonIguales = true;
				}
			}
		}
		return sonIguales;
	}

}
