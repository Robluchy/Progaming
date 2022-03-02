package juego;

// TODO: Auto-generated Javadoc
/**
 * The Class Jugadores.
 */
public abstract class Jugadores {

	/**  nombre. */
	private String nombre;
	
	/**  numero vidas. */ 	
	private int numero_vidas;
	
	/**
	 * constructor por defecto
	 */
	public Jugadores() {
		nombre="";
		numero_vidas=0;
	}
 
	/**
	 *Constructor parametrizado
	 *
	 * @param nombre the nombre
	 * @param numero_vidas the numero vidas
	 */
	public Jugadores(String nombre, int numero_vidas) {
		super();
		this.nombre = nombre;
		this.numero_vidas = numero_vidas;
		
	}
	
	/**
	 * constructor copia
	 *
	 * @param copia the copia
	 */
	public Jugadores(Jugadores copia) {
		
		this.nombre = copia.nombre;
		this.numero_vidas = copia.numero_vidas;
		
	}

	/**
	 * Desplazar.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	public abstract boolean andar(int x, int y);
	
	/**
	 * Conducir.
	 *
	 * @param x the x
	 * @param y the y
	 * @return true, if successful
	 */
	public abstract boolean conducir(int x, int y);
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Jugadores [nombre del jugador " + nombre + ", numero de vidas " + numero_vidas + "]";
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the numero vidas.
	 *
	 * @return the numero vidas
	 */
	public int getNumero_vidas() {
		return numero_vidas;
	}

	
}
