package navesita;

import java.util.ArrayList;

public class MainHangar {

	public static void main(String[] args) {
		ArrayList<Nave> naves1 = new ArrayList<>();
		Nave nave1 = new Nave(100, "Falcon");
		Nave nave2 = new Nave(300, "Enterprise");
		
		naves1.add(nave1);
		naves1.add(nave2);
		
		Hangar hangar = new Hangar("Base", naves1);
		
		nave1.setNombre("Discovery");
		hangar.editNave(1 , "Atlantis", 600);
		
		System.out.println("ArrayList : " + naves1);
		System.out.println("Hangar (cloned) : "+ hangar.getNaves());
	}

}
