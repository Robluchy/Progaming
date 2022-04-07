package celeste;

public class Asteroide extends ObjetoCeleste implements Movimiento{

	boolean peligro;
	
	Asteroide() {
		super();
		this.peligro = false;
	}

	@Override
	float densidad() {
		System.out.println("mi densidad es ");
		return 0;
	}
	
	void calcularTrayectoria() {
		System.out.println("calculando la trayectoria");
	};

	/**
	 * @param radio
	 * @param masa
	 * @param materia
	 * @param peligro 
	 */
	Asteroide(int radio, float masa, String materia, boolean peligro) {
		super(radio, masa, materia);
		this.peligro = peligro;
	}

	@Override
	public void calcularVol() {
		System.out.println("calculando el volumen");
		
	}

	@Override
	public String toString() {
		return "Asteroide tiene peligro =" + peligro +  " " + super.toString();
	}

	@Override
	public void rotar() {
		System.out.println("soy un asteroide que rota");
		
	}

	@Override
	public void trasladar() {
		System.out.println("soy un asteroide que se traslada");
		
	}

}
