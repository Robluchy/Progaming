package celeste;

public abstract class Esfera {

	int radio;
	
	abstract void calcularVol();

	
	Esfera() {
		super();
		this.radio = 0;
	}
	
	/**
	 * @param radio
	 */
	Esfera(int radio) {
		super();
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Esfera tiene radio = " + radio;
	}
	
	
}
