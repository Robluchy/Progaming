package veiculo;

// TODO: Auto-generated Javadoc
/**
 * The Class Avion.
 */
public class Avion extends Veiculo implements ReproductorMusica, PuedeVolar{

	/** The tam alas. */
	private int tamAlas;
	
	/**
	 * Instantiates a new avion.
	 */
	public Avion() {
		tamAlas=0;
	}

	/**
	 * Instantiates a new avion.
	 *
	 * @param combustible the combustible
	 * @param pasajeros the pasajeros
	 * @param ruedas the ruedas
	 * @param velocidadMaxima the velocidad maxima
	 * @param tamAlas the tam alas
	 */
	public Avion(float combustible, int pasajeros, int ruedas, float velocidadMaxima, int tamAlas) {
		super(combustible, pasajeros, ruedas, velocidadMaxima);
		this.tamAlas= tamAlas;

	}


	
	
	/**
	 * Reproducir cacion.
	 *
	 * @param cancion the cancion
	 */
	// Poner musica al avion
	public void reproducirCacion(String cancion) {
		System.out.println("Mandalor");
	}
	


	
	
	



	@Override
	public String toString() {
		return "Avion [tamAlas=" + tamAlas + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Cancion actual.
	 *
	 * @return the string
	 */
	public String cancionActual() {
		return "cancion2";
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
	 * Gets the tamaño de alas.
	 *
	 * @return the tam alas
	 */
	public int getTamAlas() {
		return tamAlas;
	}

	/**
	 * Sets the tam alas.
	 *
	 * @param tamAlas the new tam alas
	 */
	public void setTamAlas(int tamAlas) {
		this.tamAlas = tamAlas;
	}

	@Override
	public void reproducirCacion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		
	}

}
