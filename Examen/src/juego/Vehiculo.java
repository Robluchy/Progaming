package juego;

// TODO: Auto-generated Javadoc
/**
 * The Class Vehiculo.
 */
public class Vehiculo {

	/** The velocidad maxima. */
	private final int velocidadMaxima;
	
	/** The velocidad. */
	private int velocidad;
	
	
	/**
	 * Instantiates a new vehiculo.
	 */
	public Vehiculo() {
		velocidadMaxima=90;
		velocidad=0;
	}


	/**
	 * Instantiates a new vehiculo.
	 *
	 * @param velocidadMaxima the velocidad maxima
	 * @param velocidad the velocidad
	 */
	public Vehiculo(int velocidadMaxima, int velocidad) {
		super();
		this.velocidadMaxima = velocidadMaxima;
		this.velocidad = velocidad;
	}


	/**
	 * Instantiates a new vehiculo.
	 *
	 * @param copia the copia
	 */
	public Vehiculo(Vehiculo copia) {

		this.velocidadMaxima = copia.velocidadMaxima;
		this.velocidad = copia.velocidad;
	}


	/**
	 * Gets the velocidad.
	 *
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}


	/**
	 * Gets the velocidad maxima.
	 *
	 * @return the velocidad maxima
	 */
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Vehiculo [velocidad Maxima =" + velocidadMaxima + ", velocidad = " + velocidad + "]";
	}
	
	
	
	 
	
}
