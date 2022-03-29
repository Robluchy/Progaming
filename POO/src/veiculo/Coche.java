package veiculo;

// TODO: Auto-generated Javadoc
/**
 * The Class Coche.
 */
public class Coche extends Veiculo implements ReproductorMusica {

	/** The cilindrada. */
	private int cilindrada;
	
	/**
	 * Instantiates a new coche.
	 */
	public Coche() {
		cilindrada=0;
	}

	
	/**
	 * Instantiates a new coche.
	 *
	 * @param combustible the combustible
	 * @param pasajeros the pasajeros
	 * @param ruedas the ruedas
	 * @param velocidadMaxima the velocidad maxima
	 * @param cilindrada the cilindrada
	 */
	public Coche(float combustible, int pasajeros, int ruedas, float velocidadMaxima, int cilindrada) {
		super(combustible, pasajeros, ruedas, velocidadMaxima);
		this.cilindrada = cilindrada;
	}
	
	
	
	
	
	


	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada  + super.toString() + "]";
	}


	/**
	 * Reproducir cacion.
	 *
	 * @param cancion the cancion
	 */
	public void reproducirCacion(String cancion) {
		System.out.println(cancion);
	}
	
	/**
	 * Cancion actual.
	 *
	 * @return the string
	 */
	public String cancionActual() {
		return "cancion";
	}

	/**
	 * Repostar.
	 *
	 * @param cantidadCombustible the cantidad combustible
	 */
	public void repostar (float cantidadCombustible) {
		combustible = cantidadCombustible + combustible;
	}
	
	/**
	 * Aparcar vehiculo.
	 */
	public void aparcarVehiculo () {
		System.out.println("aparcando veiculo");
	}
	
	/**
	 * Arrancar motor.
	 */
	public void arrancarMotor () {
		System.out.println("Calentando motores");
	}
	
	/**
	 * Gets the cilindrada.
	 *
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}

	/**
	 * Sets the cilindrada.
	 *
	 * @param cilindrada the new cilindrada
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	

}
