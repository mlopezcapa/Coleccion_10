package ejercicio7;

enum Zonas {

	NORTE(0.15), SUR(0.25), ESTE(0.35), OESTE(0.45), CENTRO(0.15);

	private double coste;

	Zonas(double coste) {
		this.coste = coste;
	}

	public double getCoste() {
		return coste;
	}

}
