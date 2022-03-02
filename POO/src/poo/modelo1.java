package poo;

public class modelo1 {
	 
		public static void main(String[] args) {
			//creo un nuevo objeto de tipo SmartPhone
			helicoptero helicoptero= new helicoptero();
			// le asigno la marca, modelo, matricula, helices, motor y tipofuselaje
			helicoptero.setDenominacion("Aidar");			
			helicoptero.setFabricacion("Eurocopter");			
			helicoptero.setTripulacion("2 Pilotos , 1 Tripulante , 2 Tiradores");			
			helicoptero.setUbicacion("Colmenar Viejo (Madrid)");
			helicoptero.setAutonomia("3 horas 30 minutos");
			helicoptero.sethelices(2);
			helicoptero.setmotor(2);
			helicoptero.settipofuselaje("Militar");
			
			
			//método sobrescrito
			helicoptero.informarCaracteristicas();		
		}

}
