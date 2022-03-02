package trenes;

public class TrenCarga extends Tren{

	private String metodoCarga ;
	
	/**
	 * 
	 */
	public TrenCarga() {
		metodoCarga= "";
	}

	/**
	 * @param carga_vagon
	 * @param numeroVagones
	 */
	public TrenCarga(double carga_vagon, int numeroVagones, String metodoCarga) {
		super(carga_vagon, numeroVagones);
		this.metodoCarga = metodoCarga;
	}

	/**
	 * @param copia
	 */
	public TrenCarga(TrenCarga copia) {
		super((Tren) copia);
		this.metodoCarga = copia.metodoCarga;

	}

	
	@Override
	public void cargarVagones() {
		
		
	}

	@Override
	public void ponerEnMarcha() {
		
		
	}
	
	
	
	public void aumentarTemperatura(int aumentar) {
		System.out.print("temperatura aumentada a ");
		System.out.println(aumentar);
	}
	public void disminuirTemperatura(int disminuir) {
		System.out.println(disminuir);
	}
	

	@Override
	public String toString() {
		return "TrenCarga [metodoCarga=" + metodoCarga + ", toString()=" + super.toString() + "]";
	}

	public String getMetodoCarga() {
		return metodoCarga;
	}

	public void setMetodoCarga(String metodoCarga) {
		this.metodoCarga = metodoCarga;
	}
	
	

}
