package celeste;

public class ObjetoCeleste extends Esfera {


	float masa;
	String materia;
	

	ObjetoCeleste() {
		masa=0;
		materia="";
	}

	ObjetoCeleste(int radio, float masa, String materia) {
		super(radio);
		this.masa = masa;
		this.materia = materia;
	}

	float densidad(){
		System.out.println("calculo la densidad del objeto celeste");
		return 4.0f;
	}

	@Override
	public void calcularVol() {
		System.out.println("y calculo el volumen");
		
	}

	@Override
	public String toString() {
		return "El ObjetoCeleste tiene masa = " + masa + ", materia = " + materia +  " " +super.toString();
	}
	
}
