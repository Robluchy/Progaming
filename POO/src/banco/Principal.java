package banco;

public class Principal {

	public static void main(String[] args) {
		
		
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente("Javi", "12312343Y");
		
		CuentaCorriente cuentaCorriente2 = new CuentaCorriente("Pedro", "99999999Y");
		
		System.out.println(cuentaCorriente);

		CuentaCorriente.setNombreBanco("BBVA");
		
		
//		cuentaCorriente.setNombreBanco("BBVA");
		
		cuentaCorriente.ingresarDinero(100f);
		
//		cuentaCorriente.mostrarInformacion();
		System.out.println(cuentaCorriente);
		
		if(cuentaCorriente.sacarDinero(50) == false ) 
		{
			System.out.println("Operación no permitida, se supera el descubierto.");
		}
	
		System.out.println(cuentaCorriente);

		
		
	}

}
