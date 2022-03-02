package banco;

public class CuentaCorriente {

	private float saldo;
	private float descubierto;
	private String nombre;
	private String dni;
	
	
	


	/**
	 * 
	 */
	public CuentaCorriente() {
		super();
		saldo=0;
		descubierto=-50;
		nombre="";
		dni="";
	}


	/**
	 * contructor por defecto
	 * @param saldo
	 * @param descubierto
	 * @param nombre
	 * @param dni
	 */
	public CuentaCorriente(String nombre, String dni) {
		super();
		this.saldo = 0;
		this.descubierto = -50;
		this.nombre = nombre;
		this.dni = dni;
	}

	
	
	/**
	 * @param saldo
	 * @param descubierto
	 * @param nombre
	 * @param dni
	 */
	public CuentaCorriente(float saldo, float descubierto, String nombre, String dni) {
		super();
		this.saldo = saldo;
		this.descubierto = descubierto;
		this.nombre = nombre;
		this.dni = dni;
	}

	
	

	/**
	 * 
	 */
	public CuentaCorriente(CuentaCorriente cc) {
		super();
		this.saldo = cc.saldo;
		this.descubierto = cc.descubierto;
		this.nombre = cc.nombre;
		this.dni = cc.dni;
	}


	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getDescubierto() {
		return descubierto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	

	
	

}
