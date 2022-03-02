package juego;

public class Principal {

	public static void main(String[] args) {
		
		Principiante garen = new Principiante("garen", 10);
		System.out.println(garen);
		garen.andar(1, 20);
		
		
		Avanzado djamel = new Avanzado("javi", 110);	
		System.out.println(djamel);
		djamel.conducir(23, 10);
	
	}

}
