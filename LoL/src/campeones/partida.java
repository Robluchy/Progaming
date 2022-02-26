package campeones;

public class partida {

	public static void main(String[] args) {
		Enano yorldel = new Enano("gnar", 300, 5000, 2000, 1000, "yorldel", 4.5f, 14);
		System.out.println(yorldel);

		Guerrero garen = new Guerrero("Garen", 1000, 600, 400, 300, "humano", 4.7f, 99);
		System.out.println(garen);
		
		Mago ahry = new Mago("ahru", 1000, 600, 400, 300, "humano", 4.7f, "enamorar", 99);
		System.out.println(ahry);
	}

}
