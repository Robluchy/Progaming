package veiculo;

 // TODO: Auto-generated Javadoc
/**
  * The Class Veiculo.
  */
 abstract class Veiculo {

	/** The combustible. */
	protected float combustible;
	
	/** The pasajeros. */
	protected int pasajeros;
	
	/** The ruedas. */
	protected int ruedas;
	
	/** The velocidad maxima. */
	protected float velocidadMaxima;
	
	/** The cantidad veiculos. */
	private static int cantidadVeiculos; 
	
	/**
	 * Instantiates a new veiculo.
	 */
	public Veiculo() {
	combustible=0;
	pasajeros=0;
	ruedas=0;
	velocidadMaxima=0;
	Veiculo.cantidadVeiculos++;
	}
	
	
	/**
	 * Instantiates a new veiculo.
	 *
	 * @param combustible the combustible
	 * @param pasajeros the pasajeros
	 * @param ruedas the ruedas
	 * @param velocidadMaxima the velocidad maxima
	 */
	public Veiculo (float combustible, int pasajeros, int ruedas, float velocidadMaxima){
		this.combustible = combustible;
		this.pasajeros = pasajeros;
		this.ruedas = ruedas;
		this.velocidadMaxima = velocidadMaxima;
		Veiculo.cantidadVeiculos++;
	}
	
	
	
	
	
	
	/**
	 * Repostar.
	 *
	 * @param cantidadCombustible the cantidad combustible
	 */
	public abstract void repostar (float cantidadCombustible);
	
	/**
	 * Arrancar motor.
	 */
	public abstract void arrancarMotor ();
	
	/**
	 * Aparcar vehiculo.
	 */
	public abstract void aparcarVehiculo () ;

	
	
	

	/**
	 * Gets the combustible.
	 *
	 * @param combustible the combustible
	 * @return the combustible
	 */
	public void getCombustible(float combustible) {
		this.combustible = combustible;
	}
	
	/**
	 * Sets the combustible.
	 *
	 * @param combustible the new combustible
	 */
	protected void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	/**
	 * Gets the pasajeros.
	 *
	 * @return the pasajeros
	 */
	public int getPasajeros() {
		return pasajeros;
	}

	/**
	 * Sets the pasajeros.
	 *
	 * @param pasajeros the new pasajeros
	 */
	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	/**
	 * Gets the ruedas.
	 *
	 * @param ruedas the ruedas
	 * @return the ruedas
	 */
	public int getRuedas(int ruedas) {
		return ruedas;
	}
	
	/**
	 * Sets the ruedas.
	 *
	 * @param ruedas the new ruedas
	 */
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	/**
	 * Sets the velocidad maxima.
	 *
	 * @param velocidadMaxima the new velocidad maxima
	 */
	protected void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	/**
	 * Gets the velocidad maxima.
	 *
	 * @return the velocidad maxima
	 */
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}


	@Override
	public String toString() {
		return "Veiculo [combustible=" + combustible + ", pasajeros=" + pasajeros + ", ruedas=" + ruedas
				+ ", velocidadMaxima=" + velocidadMaxima + "]";
	}


	






	
	
	
}

