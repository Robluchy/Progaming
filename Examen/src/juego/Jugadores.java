package juego;

public abstract class Jugadores {

	private String nombre;
	private int numero_vidas;
	private final int velocidadMaxima;
	 
	
	
	/**
	 * 
	 */
	public Jugadores() {
		nombre="";
		numero_vidas=0;
		velocidadMaxima=40;
	}

 
	/**
	 * @param nombre
	 * @param numero_vidas
	 * @param velocidadMaxima
	 */
	public Jugadores(String nombre, int numero_vidas, int velocidadMaxima) {
		super();
		this.nombre = nombre;
		this.numero_vidas = numero_vidas;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	

	/**
	 * @param nombre
	 * @param numero_vidas
	 * @param velocidadMaxima
	 */
	public Jugadores(Jugadores copia) {
		
		this.nombre = copia.nombre;
		this.numero_vidas = copia.numero_vidas;
		this.velocidadMaxima = copia.velocidadMaxima;
	}


	@Override
	public String toString() {
		return "Jugadores [nombre del jugador" + nombre + ", numero de vidas " + numero_vidas + ", velocidad Maxima " + velocidadMaxima + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumero_vidas() {
		return numero_vidas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	
}
