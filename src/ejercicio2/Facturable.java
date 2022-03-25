package ejercicio2;

public interface Facturable {
	
	default double facturar() {
		return 0.0;
	}

}
