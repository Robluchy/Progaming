package veiculo;

// TODO: Auto-generated Javadoc
/**
 * The Class Motocicleta.
 */
public class Motocicleta extends Veiculo {
	
	/** The escapes. */
	private int escapes;
	
	/**
	 * Instantiates a new motocicleta.
	 */
	public Motocicleta() {
		escapes=0;
	}

	/**
	 * Instantiates a new motocicleta.
	 *
	 * @param combustible the combustible
	 * @param pasajeros the pasajeros
	 * @param ruedas the ruedas
	 * @param velocidadMaxima the velocidad maxima
	 * @param escapes the escapes
	 */
	public Motocicleta(float combustible, int pasajeros, int ruedas, float velocidadMaxima, int escapes) {
		super(combustible, pasajeros, ruedas, velocidadMaxima);
		this.escapes= escapes;
	}
	
	 
	
	

	@Override
	public String toString() {
		return "Motocicleta [escapes=" + escapes + " " + super.toString() + "]";
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
	 * Gets the escapes.
	 *
	 * @return the escapes
	 */
	public int getEscapes() {
		return escapes;
	}

	/**
	 * Sets the escapes.
	 *
	 * @param escapes the new escapes
	 */
	public void setEscapes(int escapes) {
		this.escapes = escapes;
	}


}
