package navesita;

import java.util.ArrayList;

public class Hangar {
	
	private String nombre;
	private ArrayList<Nave> naves;
	
	Hangar(){
		nombre = "";
		naves = new ArrayList<>();
	}
	
	Hangar(String nombre, ArrayList<Nave> navesParam){
		this.nombre = nombre;
		this.naves = new ArrayList<>();
		
		for (Nave nave : navesParam) {
			this.naves.add(nave.clone());
		}
	}
	
	Hangar(Hangar hangar){
		this.nombre = hangar.nombre;
		this.naves = new ArrayList<>();
		
		for (int i = 0; i < hangar.naves.size(); i++) {			
			this.naves.add(hangar.naves.get(i).clone());
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Nave> getNaves() {
		ArrayList<Nave> copiaNaves = new ArrayList<>(); 
		
		for (int i = 0; i < naves.size(); i++) {
			copiaNaves.add(naves.get(i).clone());
		}
		
		return copiaNaves;
	}

	public void setNaves(ArrayList<Nave> navesParam) {
		this.naves.clear();
		
		for (Nave nave : navesParam) {
			this.naves.add(nave.clone());
		}
	}
	
	public void addNave(Nave naveParam) {
		naves.add(naveParam.clone());
	}
	
	public void addNaves(ArrayList<Nave> navesParam) {
		
		for (Nave nave : navesParam) {
			this.naves.add(nave.clone());
		}
	}
	
	public void editNave(int index, String nombre, int potencia) {
		if(index >= naves.size()) {
			System.out.println("No existe la nave");
		} else {
			naves.get(index).setNombre(nombre);
			naves.get(index).setPotencia(potencia);
		}
	}
}
