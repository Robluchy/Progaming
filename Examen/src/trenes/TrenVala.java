package trenes;

// TODO: Auto-generated Javadoc
/**
 * The Class TrenVala.
 */
public class TrenVala extends Tren implements ReproductorPelicula, Termostato {

	/** The velocidad promedio. */
	private int velocidadPromedio;
	private double tamaño;
	



	/**
	 * Instantiates a new tren vala.
	 */
	public TrenVala() {
		velocidadPromedio=0;
		tamaño=0;
	}

	/**
	 * Instantiates a new tren vala.
	 *
	 * @param carga_vagon the carga vagon
	 * @param numeroVagones the numero vagones
	 * @param velocidadPromedio the velocidad promedio
	 */
	public TrenVala(double carga_vagon, int numeroVagones, int velocidadPromedio, int tamaño) {
		super(carga_vagon, numeroVagones);
		this.velocidadPromedio = velocidadPromedio;
		this.tamaño = tamaño;
	}

	/**
	 * Instantiates a new tren vala.
	 *
	 * @param copia the copia
	 */
	public TrenVala(TrenVala copia) {
		super((Tren) copia);
		this.velocidadPromedio = copia.velocidadPromedio;
		this.tamaño= copia.tamaño;
		
	}
	
	
	
	/**
	 * Aumentar temperatura.
	 *
	 * @param aumentar the aumentar
	 */
	public void aumentarTemperatura(int aumentar) {
		System.out.print("temperatura aumentada a ");
		System.out.println(aumentar);
	}
	
	/**
	 * Disminuir temperatura.
	 *
	 * @param disminuir the disminuir
	 */
	public void disminuirTemperatura(int disminuir) {
		System.out.print("temperatura disminuida a ");
		System.out.println(disminuir);
	}
	
	/**
	 * Regular temperatura.
	 *
	 * @param regular the regular
	 */
	public void regularTemperatura(int regular) {
		System.out.print("temperatura regulada a ");
		System.out.println(regular);
	}
	
	
	/**
	 * Elegir pelicula.
	 *
	 * @param pelicula the pelicula
	 */
	public void elegirPelicula(String pelicula) {
		System.out.print("has elegido ");
		System.out.println(pelicula);
	}		
	
	/**
	 * Reproducir pelicula.
	 *
	 * @param pelicula the pelicula
	 */
	public void reproducirPelicula(String pelicula) {
		System.out.print("estas viendo ");
		System.out.println(pelicula);
	}
	
	/**
	 * Pausar pelicula.
	 */
	public void pausarPelicula() {
		System.out.println("pelicula pausada");
	}
	
	

	/**
	 * Cargar vagones.
	 */
	@Override
	public void cargarVagones() {

	}

	/**
	 * Poner en marcha.
	 */
	@Override
	public void ponerEnMarcha() {

	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "TrenVala [velocidadPromedio=" + velocidadPromedio + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Gets the velocidad promedio.
	 *
	 * @return the velocidad promedio
	 */
	public int getVelocidadPromedio() {
		return velocidadPromedio;
	}

	/**
	 * Sets the velocidad promedio.
	 *
	 * @param velocidadPromedio the new velocidad promedio
	 */
	public void setVelocidadPromedio(int velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	public int aumentarTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int disminuirTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int regularTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void reproducirPelicula() {
		// TODO Auto-generated method stub
		
	}

	
	
}
