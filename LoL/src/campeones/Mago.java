package campeones;

public class Mago extends Campeon {

	private String hechizo;
	private int mana;
	
	public Mago() {
		hechizo="";
		mana=490;
		
	}

	

	@Override
	public String toString() {
		return "Mago [hechizo=" + hechizo + ", mana=" + mana + "]";
	}



	/**
	 * @param campeon
	 */
	public Mago(Campeon campeon) {
		super(campeon);
		
	}



	/**
	 * @param nombre
	 * @param daño
	 * @param vida
	 * @param armadura
	 * @param velocidad
	 * @param raza
	 * @param velAtac
	 */
	public Mago(String nombre, int daño, int vida, int armadura, int velocidad, String raza, float velAtac, String hechizo, int mana) {
		super(nombre, daño, vida, armadura, velocidad, raza, velAtac);
		this.hechizo = hechizo;
		this.mana = mana;
	}

	

	@Override
	public void rangoAtaque(float rango) {
		
		
	}

	@Override
	public void ResistenciMagica(float cantidadResistencia) {
		
		
	}



	public String getHechizo() {
		return hechizo;
	}



	public void setHechizo(String hechizo) {
		this.hechizo = hechizo;
	}



	public int getMana() {
		return mana;
	}



	public void setMana(int mana) {
		this.mana = mana;
	}

	
}
