package ejercicio4;

public class Disco extends Multimedia {
	enum Genero {
		pop, rock, jazz, reggeton, clasica, electronica
	}
	
	Genero genero;
	private int pistas;
	
	public Disco(Formato formato, String titulo, String autor, int duracion, Genero genero, int pistas) {
		super(formato, titulo, autor, duracion);
		setGenero(genero);
		setPistas(pistas);
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public int getPistas() {
		return pistas;
	}
	public void setPistas(int pistas) {
		this.pistas = pistas;
	}
	@Override
	public String toString() {
		return "Disco [genero=" + genero + ", pistas=" + pistas + "]";
	}
	
	
}
