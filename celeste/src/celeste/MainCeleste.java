package celeste;

import java.util.ArrayList;

public class MainCeleste {

	public static void main(String[] args) {
		
		ArrayList<Planeta> planetas = new ArrayList<>();
		ArrayList<Asteroide> asteroides = new ArrayList<>();
		ArrayList<Estrella> estrellas= new ArrayList<>();
		
	
		Planeta p1 = new Planeta(1000, 12, "rocoso", false);
		Planeta p2 = new Planeta(1000, 0, "agua", true);
		Planeta p3 = new Planeta(1000, 3, "gaseoso", true);
		
		planetas.add(p1);
		planetas.add(p2);
		planetas.add(p3);

		for (Planeta p : planetas) {
			
			System.out.println("\n" + planetas);
			p.rotar();
			p.nutar();
			p.trasladar();
			
		}
		
		Asteroide a1 = new Asteroide(50, 450, "ligero", false);
		Asteroide a2 = new Asteroide(20, 3210, "acuoso", true);
		Asteroide a3 = new Asteroide(12, 20, "rocoso", false);
		
		asteroides.add(a1);
		asteroides.add(a2);
		asteroides.add(a3);
		
		
		for (Asteroide a : asteroides) {
			
			System.out.println("\n" + asteroides);
			a.rotar();
			a.trasladar();
			
		}
		
		
		Estrella e1 = new Estrella(12, 20, "tierra", 120);
		Estrella e2 = new Estrella(122, 320, "", 420);
		Estrella e3 = new Estrella(44, 120, "", 220);
	
		estrellas.add(e1);
		estrellas.add(e2);
		estrellas.add(e3);
		
		for (Estrella e : estrellas) {
			
			System.out.println("\n" + estrellas );
			e.rotar();
			e.trasladar();
			
		}

		ArrayList<ObjetoCeleste> celestes= new ArrayList<>();

		celestes.add(p1);
		celestes.add(p2);
		celestes.add(p3);
		celestes.add(a1);
		celestes.add(a2);
		celestes.add(a3);
		celestes.add(e1);
		celestes.add(e2);
		celestes.add(e3);

		System.out.println("\n");
		for (ObjetoCeleste objeto : celestes) {
			if (objeto instanceof Planeta) {
				((Planeta) objeto).colonizar();
			
			} else if (objeto instanceof Asteroide) {
				((Asteroide) objeto).calcularTrayectoria();
			
			} else if (objeto instanceof Estrella) {
				((Estrella) objeto).brillar();
				
			}
			objeto.calcularVol();
			System.out.println("\n");
		}
	}
}

			


