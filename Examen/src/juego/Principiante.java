package juego;


// TODO: Auto-generated Javadoc
/**
 * The Class Principiante.
 */
public class Principiante extends Jugadores {
	

	/**
	 * Instantiates a new principiante.
	 */
	public Principiante() {
		
	}

	/**
	 * Instantiates a new principiante.
	 *
	 * @param copia the copia
	 */
	public Principiante(Principiante copia) {
		super((Jugadores)copia);
	
	}

	/**
	 * Instantiates a new principiante.
	 *
	 * @param nombre the nombre
	 * @param numero_vidas the numero vidas
	 */
	public Principiante(String nombre, int numero_vidas) {
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
		System.out.println("Soy un jugador principiante y me desplazo hasta las coordenadas "+x+ " e "+y);
		
		andar=true;
		return andar;
	}



	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Principiante [toString()=" + super.toString() + "]";
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
		
		return false;
	}

}
