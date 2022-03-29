package banco;

public class CuentaCorriente {

	private float saldo;
	private float limiteDescubierto;
	public String nombre;
	String dni;
	private static String nombreBanco;
	private static int contadorCuentas;
	
	static {
		nombreBanco = "La Caixa";
		contadorCuentas=0;
	}
	
	
	public static void setNombreBanco(String nombre) {
		CuentaCorriente.nombreBanco=nombre;
	}
	
	
	
	/**
	 * Crear la cuenta, método constructor.
	 * @param nombre Nombre de la persona propietaria
	 * @param dni DNI de la persona propietaria de esta cuenta
	 */
	public CuentaCorriente(String nombre, String dni) {
		super();
		this.saldo = 0;
		this.limiteDescubierto = 50;
		this.nombre = nombre;
		this.dni = dni;
		
		CuentaCorriente.contadorCuentas++;
	}
	
	public boolean sacarDinero(float cantidad) {
		boolean operacionRealizada=false; 
		
		if(cantidad <= saldo + limiteDescubierto ) {
			operacionRealizada=true;
			saldo -= cantidad;
		}
		
		return operacionRealizada; 		
	}
	
	public void ingresarDinero(float cantidad) {
		
		saldo += cantidad;
		
	}
	
	
	public void mostrarInformacion() {
		
//		System.out.println("CuentaCorriente [saldo=" + saldo + ", limiteDescubierto=" + limiteDescubierto + ", nombre=" + nombre + ", dni="
//				+ dni + "]");
		
		System.out.println( this.toString() );
		
	}
	
	public CuentaCorriente(float saldo, float descubierto, String nombre, String dni) {
		super();
		this.saldo = saldo;
		this.limiteDescubierto = descubierto;
		this.nombre = nombre;
		this.dni = dni;
		
		CuentaCorriente.contadorCuentas++;
	}
	
	

	public CuentaCorriente() {
		super();
		saldo=0;
		limiteDescubierto=-50;
		nombre="";
		dni="";
		
		CuentaCorriente.contadorCuentas++;
	}
	
	public CuentaCorriente(CuentaCorriente cc ) {
		this.dni=cc.dni;
		this.limiteDescubierto=cc.limiteDescubierto;
		this.nombre=cc.nombre;
		this.saldo=cc.saldo;
		
		CuentaCorriente.contadorCuentas++;
	}



	public float getSaldo() {
		return saldo;
	}

	public float getDescubierto() {
		return limiteDescubierto;
	}

	public String getNombre() {
		return nombre;
	}


	public String getDni() {
		return dni;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setDescubierto(float descubierto) {
		this.limiteDescubierto = descubierto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", limiteDescubierto=" + limiteDescubierto + ", nombre=" + nombre + ", dni="
				+ dni + " , nombre del banco: "+ CuentaCorriente.nombreBanco + "número de cuentas: "+ CuentaCorriente.contadorCuentas +"]";
	}
	
	
	
}
