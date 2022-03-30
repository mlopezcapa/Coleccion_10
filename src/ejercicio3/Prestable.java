package ejercicio3;

import java.time.LocalDate;

public interface Prestable {

	LocalDate prestar();

	LocalDate prestado();

	void devolver();
}
