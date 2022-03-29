package navesita;

import java.util.ArrayList;

public class ArrayListNave {

	public static void main(String[] args) {

		Nave nave1 = new Nave(100, "Cosmos");
		Nave nave2 = new Nave(200, "SpaceX");
		
		ArrayList<Nave> naves = new ArrayList<>();
		
		naves.add(nave1);
		naves.add(nave2);
		
		System.out.println(naves);
		
		nave1.setNombre("Aidar");

		System.out.println(naves);
		
		
	}

}
