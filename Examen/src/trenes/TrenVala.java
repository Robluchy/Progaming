package trenes;

public class TrenVala extends Tren {

	private int velocidadPromedio;
	



	/**
	 * 
	 */
	public TrenVala() {
		velocidadPromedio=0;
	}

	/**
	 * @param carga_vagon
	 * @param numeroVagones
	 */
	public TrenVala(double carga_vagon, int numeroVagones, int velocidadPromedio) {
		super(carga_vagon, numeroVagones);
		this.velocidadPromedio = velocidadPromedio;
	}

	/**
	 * @param copia
	 */
	public TrenVala(TrenVala copia) {
		super((Tren) copia);
		this.velocidadPromedio = copia.velocidadPromedio;
		
	}
	
	
	
	public void aumentarTemperatura(int aumentar) {
		System.out.print("temperatura aumentada a ");
		System.out.println(aumentar);
	}
	public void disminuirTemperatura(int disminuir) {
		System.out.print("temperatura disminuida a ");
		System.out.println(disminuir);
	}
	public void regularTemperatura(int regular) {
		System.out.print("temperatura regulada a ");
		System.out.println(regular);
	}
	
	
	public void elegirPelicula(String pelicula) {
		System.out.print("has elegido ");
		System.out.println(pelicula);
	}		
	public void reproducirPelicula(String pelicula) {
		System.out.print("estas viendo ");
		System.out.println(pelicula);
	}
	public void pausarPelicula() {
		System.out.println("pelicula pausada");
	}
	
	

	@Override
	public void cargarVagones() {

	}

	@Override
	public void ponerEnMarcha() {

	}

	@Override
	public String toString() {
		return "TrenVala [velocidadPromedio=" + velocidadPromedio + ", toString()=" + super.toString() + "]";
	}

	public int getVelocidadPromedio() {
		return velocidadPromedio;
	}

	public void setVelocidadPromedio(int velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	
	
}
