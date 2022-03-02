package poo;
public class aeropuerto {
	public static void main(String[] args) {
		
		//creo un nuevo objeto de tipo avion, con el constructor vacío
		
		avion avion1 = new avion();
		
		// le asigno la marca, modelo, y matricula
		
		avion1.setDenominacion("Superpuma");
		
		avion1.setFabricacion("Eurocopter");
		
		avion1.setTripulacion("2 Pilotos , 1 Tripulante , 2 Tiradores");
		
		avion1.setUbicacion("Colmenar Viejo (Madrid)");
		
		avion1.setAutonomia("3 horas 30 minutos");
		
		
		//utilizo lo métodos, llamar, cortarLlamada e informar características
		
		System.out.println();
		
		avion1.informarCaracteristicas();
	}
}
