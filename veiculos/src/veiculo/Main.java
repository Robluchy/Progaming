package veiculo;

public class Main {

	public static void main(String[] args) {

		Coche coche = new Coche(50, 4, 4, 999, 999);
		System.out.println(coche);
		coche.arrancarMotor();
		coche.reproducirCacion("mi carro me lo robaron..");
	

		
		Motocicleta moto = new Motocicleta(20, 2, 2, 999, 900);
		System.out.println(moto);
		moto.arrancarMotor();
	
		
		Avion helicopter = new Avion(600.00f, 125, 3, 250.000f, 500);
		System.out.println(helicopter);
		helicopter.aterrizar();
	}

}
