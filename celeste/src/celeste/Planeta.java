package celeste;

	public class Planeta extends ObjetoCeleste implements MovPlanetario  {

		boolean habitable;
		
		void colonizar(){
			System.out.println("este planeta es colonizable");
		}
	
		public Planeta(boolean habitable) {
			super();
			this.habitable = habitable;
		}

		public Planeta() {
			super();
			this.habitable = false;
		}

		/**
		 * @param masa
		 * @param materia
		 * @param habitable 
		 */
		Planeta(int radio, float masa, String materia, boolean habitable) {
			super(radio, masa, materia);
			this.habitable = habitable;
		}

		@Override
		public float densidad() {
			System.out.println("calculo la densidad del objeto celeste");
			return 4.0f;

		}

		

		@Override
		public void nutar() {
			System.out.println("este planeta se va a nutar a ");
			
		}

		@Override
		public void rotar() {
			System.out.println("este planeta se va a rotar a ");
			
		}

		@Override
		public void trasladar() {
			System.out.println("este planeta se va a trasladar a ");

			
		}

		@Override
		public String toString() {
			return "Planeta es habitable= " + habitable + " " +super.toString();
		}


}
