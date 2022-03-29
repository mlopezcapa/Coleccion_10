package ejercicio6;

import java.util.Comparator;

public class OrdenacionEdad implements Comparator<Futbolista> {

	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		int resultado;
		if (o1.getEdad() < o2.getEdad()) {
			resultado = -1;
		} else if (o1.getEdad() > o2.getEdad()) {
			resultado = 1;
		} else {
			resultado = 0;
		}
		return resultado;
	}

}
