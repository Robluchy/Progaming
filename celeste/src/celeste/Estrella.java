package celeste;

public class Estrella extends ObjetoCeleste implements Movimiento  {

	float luminosidad;

	Estrella() {
		super();
		luminosidad=0;
	}

	public void trasladar() {
		System.out.println("soy una estrella y me traslado");
		
	}
	
	@Override
	public void rotar() {
		System.out.println("soy una estrella y roto");
		
	}
	

	
	void brillar() {
		System.out.println("estoy brillando");
	};

	/**
	 * @param radio
	 * @param masa
	 * @param materia
	 * @param luminosidad 
	 */
	Estrella(int radio, float masa, String materia, float luminosidad) {
		super(radio, masa, materia);
		this.luminosidad = luminosidad;	}

	
	@Override
	public String toString() {
		return "Estrella tiene luminosidad=" + luminosidad +  " " +super.toString() ;
	}


	
}