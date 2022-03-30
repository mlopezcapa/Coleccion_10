package ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class Prueba {

	static ArrayList<Futbolista> listaFutbolistas = new ArrayList<>();

	static void rellenarLista() {
		listaFutbolistas.add(new Futbolista("33333333L", "Alexia", 24, 16));
		listaFutbolistas.add(new Futbolista("10101010J", "Jesus", 20, 4));
		listaFutbolistas.add(new Futbolista("11111111E", "Carla", 19, 8));
		listaFutbolistas.add(new Futbolista("22222222L", "Mario", 23, 5));
		listaFutbolistas.add(new Futbolista("01010101L", "Alexia", 17, 3));
	}

	static void mostrarLista() {
		for (Futbolista futbolista : listaFutbolistas) {
			System.out.println(futbolista.toString());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rellenarLista();

		Collections.sort(listaFutbolistas, new OrdenacionNombre());
		System.out.println("Por nombre");
		mostrarLista();
		System.out.println("--------------------------------------------------------------------");
		Collections.sort(listaFutbolistas, new OrdenacionEdad());
		System.out.println("Por edad");
		mostrarLista();
		System.out.println("--------------------------------------------------------------------");
		Collections.sort(listaFutbolistas);
		System.out.println("Por DNI");
		mostrarLista();

		Futbolista f1 = new Futbolista("33333333L", "Alexia", 24, 16);
		Futbolista f2 = new Futbolista("03030303L", "Alexia", 24, 16);
		Futbolista f3 = new Futbolista("33333333L", "Alexia", 24, 16);

	}

}
