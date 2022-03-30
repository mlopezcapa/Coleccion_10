package ejercicio6;

import java.util.Comparator;

public class OrdenacionNombre implements Comparator<Futbolista> {

	// Utilizamos el metodo para comparar cadenas ya definido, tambien podemos
	// hacerlo con date, localDate etc.
	//Si quiero ordenarlo de la Z a la A tenemos que multiplicar por -1
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
