package trenes;


/**
 * The Class Tren.
 */
public abstract class Tren {

	/** The del carga vagon. */
	private double carga_vagon;
	
	/** The numero vagones. */
	private int numeroVagones;
	
	/** The Contadortrenes. */
	private static int Contadortrenes;
	
	
	/**
	 * Constructor por defecto.
	 */
	public Tren() {
	
		carga_vagon = 0;
		numeroVagones = 0;
		Tren.Contadortrenes++;
	}


	/**
	 * Constructor parametrizado.
	 *
	 * @param carga_vagon the carga vagon
	 * @param numeroVagones the numero vagones
	 */
	public Tren(double carga_vagon, int numeroVagones) {
		super();
		this.carga_vagon = carga_vagon;
		this.numeroVagones = numeroVagones;
		Tren.Contadortrenes++;
	}


	/**
	 * constructor copia.
	 *
	 * @param copia the copia
	 */
	public Tren(Tren copia) {
		this.carga_vagon = copia.carga_vagon;
		this.numeroVagones = copia.numeroVagones;
		Tren.Contadortrenes++;
	}

	
	/**
	 * Cargar vagones.
	 */
	public abstract void cargarVagones ();
		
	/**
	 * Poner en marcha.
	 */
	public abstract void ponerEnMarcha ();
	
	

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "tren [carga del vagon=" + carga_vagon + ", numero de Vagones=" + numeroVagones + "]";
	}


	/**
	 * recoge la carga vagon.
	 *
	 * @return the carga vagon
	 */
	public double getCarga_vagon() {
		return carga_vagon;
	}


	/**
	 * Añade el carga vagon.
	 *
	 * @param carga_vagon the new carga vagon
	 */
	public void setCarga_vagon(double carga_vagon) {
		this.carga_vagon = carga_vagon;
	}


	/**
	 * recoge el numero vagones.
	 *
	 * @return the numero vagones
	 */
	public int getNumeroVagones() {
		return numeroVagones;
	}


	/**
	 * Añade el numero de vagones.
	 *
	 * @param numeroVagones the new numero vagones
	 */
	public void setNumeroVagones(int numeroVagones) {
		this.numeroVagones = numeroVagones;
	}
	
	
}
