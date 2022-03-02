package poo;

	public class avion {
        //atributos de la clase
	private String Denominacion;
	private String Fabricacion;
	private String Tripulacion;
	private String Ubicacion;
	private String Autonomia;

	
	
	// constructor con parámetros
	public avion(String Denominacion, String Fabricacion, String Tripulacion, String Ubicacion, String Autonomia) {
		this.Denominacion = Denominacion;
		this.Fabricacion = Fabricacion;
		this.Tripulacion = Tripulacion;
		this.Ubicacion = Ubicacion;
		this.Autonomia = Autonomia;
	}
	
	//constructor vacio
	public avion(){
		
	}
	
	
	//método para informar de la caracteristicas del avion
	public void informarCaracteristicas(){
		System.out.println(String.format("Denominación: %s", Denominacion));
		System.out.println(String.format("Fabricación: %s", Fabricacion));
		System.out.println(String.format("Tripulación: %s", Tripulacion));	
		System.out.println(String.format("Ubicación: %s", Ubicacion));	
		System.out.println(String.format("Autónomia: %s", Autonomia));	
	}
	
	//getters y Setters
	public String getDenominacion() {
		return Denominacion;
	}
	public void setDenominacion(String Denominacion) {
		this.Denominacion = Denominacion;
	}
	
	public String getFabricacion() {
		return Fabricacion;
	}
	public void setFabricacion(String Fabricacion) {
		this.Fabricacion = Fabricacion;
	}
	
	public String getTripulacion() {
		return Tripulacion;
	}
	public void setTripulacion(String Tripulacion) {
		this.Tripulacion = Tripulacion;
	}
	
	public String getUbicacion() {
		return Ubicacion;
	}
	public void setUbicacion(String Ubicacion) {
		this.Ubicacion = Ubicacion;
	}
	
	public String getAutonomia() {
		return Autonomia;
	}
	public void setAutonomia(String Autonomia) {
		this.Autonomia = Autonomia;
	}
	
	
}
	
	
