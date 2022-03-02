package juego;

// TODO: Auto-generated Javadoc
/**
 * The Class Avanzado.
 */
public class Avanzado extends Jugadores{

	/** coche. */
	private Vehiculo coche;
	        
	/**
	 * constructor por defecto.
	 */
	public Avanzado() {
	
	}

	/**
	 * Constructor de copia
	 *
	 * @param copia the copia
	 */
	public Avanzado(Avanzado copia) {
		super((Jugadores)copia);

	}

	/**
	 * Constructor parametrizado
	 *
	 * @param nombre the nombre
	 * @param numero_vidas the numero vidas
	 */
	public Avanzado(String nombre, int numero_vidas) {
		super(nombre, numero_vidas);

	}

	/**
	 * Desplazar.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	@Override
	public boolean andar(int x, int y) {
		boolean andar=false;
		System.out.println("Soy un jugador avanzado y me desplazo hasta las coordenadas "+x+ " e "+y);
		
		andar=true;
		return andar;
	}

	/**
	 * Conducir.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	@Override
	public boolean conducir(int x, int y) {
		boolean conduzco=false;
		System.out.println("Soy un jugador avanzado y me desplazo con mi coche hasta las coordenadas "+x+ " e "+y);
		
		conduzco=true;
		return conduzco;
	}

	/**
	 * ver coche.
	 *
	 * @return the coche
	 */
	public Vehiculo getCoche() {
		return coche;
	}

	/**
	 * añadir coche.
	 *
	 * @param coche the new coche
	 */
	public void setCoche(Vehiculo coche) {
		this.coche = coche;
	}

}
