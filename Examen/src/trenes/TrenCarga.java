package trenes;

// TODO: Auto-generated Javadoc
/**
 * The Class TrenCarga.
 */
public class TrenCarga extends Tren implements ReproductorPelicula, Termostato {

	/** The metodo carga. */
	private String metodoCarga ;
	
	/**
	 * Instacia el trenCarga. con el constructor por defecto
	 */
	public TrenCarga() {
		metodoCarga= "";
	}

	/**
	 * Instantiates a new tren carga. con el constructor parametrizado
	 *
	 * @param carga_vagon the carga vagon
	 * @param numeroVagones the numero vagones
	 * @param metodoCarga the metodo carga
	 */
	public TrenCarga(double carga_vagon, int numeroVagones, String metodoCarga) {
		super(carga_vagon, numeroVagones);
		this.metodoCarga = metodoCarga;
	}

	/**
	 * Instantiates a new tren carga. con el constructor de copia
	 *
	 * @param copia the copia
	 */
	public TrenCarga(TrenCarga copia) {
		super((Tren) copia);
		this.metodoCarga = copia.metodoCarga;

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
		System.out.println(disminuir);
	}
	

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "TrenCarga [metodoCarga=" + metodoCarga + ", toString()=" + super.toString() + "]";
	}

	/**
	 * Gets the metodo carga.
	 *
	 * @return the metodo carga
	 */
	public String getMetodoCarga() {
		return metodoCarga;
	}

	/**
	 * Sets the metodo carga.
	 *
	 * @param metodoCarga the new metodo carga
	 */
	public void setMetodoCarga(String metodoCarga) {
		this.metodoCarga = metodoCarga;
	}

	@Override
	public int aumentarTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int regularTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void elegirPelicula(String pelicula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reproducirPelicula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pausarPelicula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int disminuirTemperatura() {
		// TODO Auto-generated method stub
		return 0;
	}




}
