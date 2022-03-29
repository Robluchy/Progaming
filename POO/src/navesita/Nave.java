package navesita;

public class Nave {

	private int potencia;
	private String nombre;
	
	public Nave(int potencia, String nombre) {
		super();
		this.potencia = potencia;
		this.nombre = nombre;
	}

	public Nave() {
		potencia=0;
		nombre="";
	}

	public Nave(Nave nave) {
		this.nombre=nave.nombre;
		this.potencia=nave.potencia;
	}
	
	public Nave clone() {
	//	return new Nave(this);
		
		Nave n = new Nave(this.potencia, this.nombre);
		
		return n;
	}

	public int getPotencia() {
		return potencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nave [potencia=" + potencia + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
