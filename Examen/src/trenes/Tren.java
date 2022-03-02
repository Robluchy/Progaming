package trenes;

public abstract class Tren {

	private double carga_vagon;
	private int numeroVagones;
	private static int Contadortrenes;
	
	
	/**
	 * Constructor por defecto
	 * @param carga_vagon
	 * @param numeroVagones
	 */
	public Tren() {
	
		carga_vagon = 0;
		numeroVagones = 0;
		Tren.Contadortrenes++;
	}


	/**
	 * Constructor parametrizado
	 * @param carga_vagon
	 * @param numeroVagones
	 */
	public Tren(double carga_vagon, int numeroVagones) {
		super();
		this.carga_vagon = carga_vagon;
		this.numeroVagones = numeroVagones;
		Tren.Contadortrenes++;
	}


	/**
	 * constructor copia
	 * @param carga_vagon
	 * @param numeroVagones
	 */
	public Tren(Tren copia) {
		this.carga_vagon = copia.carga_vagon;
		this.numeroVagones = copia.numeroVagones;
		Tren.Contadortrenes++;
	}

	
	public abstract void cargarVagones ();
		
	public abstract void ponerEnMarcha ();
	
	

	@Override
	public String toString() {
		return "tren [carga del vagon=" + carga_vagon + ", numero de Vagones=" + numeroVagones + "]";
	}


	public double getCarga_vagon() {
		return carga_vagon;
	}


	public void setCarga_vagon(double carga_vagon) {
		this.carga_vagon = carga_vagon;
	}


	public int getNumeroVagones() {
		return numeroVagones;
	}


	public void setNumeroVagones(int numeroVagones) {
		this.numeroVagones = numeroVagones;
	}
	
	
}
