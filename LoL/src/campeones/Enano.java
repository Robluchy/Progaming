package campeones;

public class Enano extends Campeon {

	private int tamaño;
	
	
	public Enano() {
		
		tamaño= 50;
		
	}


	public Enano(Campeon campeon) {
		super(campeon);
	
	}


	@Override
	public String toString() {
		return "Enano [tamaño=" + tamaño + ", toString()=" + super.toString() + "]";
	}


	public Enano(String nombre, int daño, int vida, int armadura, int velocidad, String raza, float velAtac, int tamaño) {
		super(nombre, daño, vida, armadura, velocidad, raza, velAtac);
		this.tamaño = tamaño;
	}




	@Override
	public void rangoAtaque(float rango) {
		
		
	}

	@Override
	public void ResistenciMagica(float cantidadResistencia) {
		
		
	}



}
