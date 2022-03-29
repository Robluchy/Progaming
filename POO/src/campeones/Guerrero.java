package campeones;

public class Guerrero extends Campeon{

	private int rage;
	
	public Guerrero() {
		
		rage=100;
		
	}


	
	
	@Override
	public String toString() {
		return "Guerrero [rage=" + rage + "]";
	}




	public Guerrero(Campeon campeon) {
		super(campeon);
		
	}

	
	public Guerrero(String nombre, int daño, int vida, int armadura, int velocidad, String raza, float velAtac, int rage) {
		super(nombre, daño, vida, armadura, velocidad, raza, velAtac);
		this.rage=rage;
	}

	
	@Override
	public void rangoAtaque(float rango) {
		
		
	}

	
	@Override
	public void ResistenciMagica(float cantidadResistencia) {
		
		
	}

	public int getRage() {
		return rage;
	}

	
	public void setRage(int rage) {
		this.rage = rage;
	}

	
}
