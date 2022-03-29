package biblioteca;

import java.util.ArrayList;

public class Biblioteca{

	private ArrayList<Lector> lectores;
	private ArrayList<Copia> copias;
	
	
	
	Biblioteca() {
		copias = new ArrayList<>();
		lectores = new ArrayList<>();
	}


	Biblioteca(ArrayList<Lector> lectores, ArrayList<Copia> copias) {
		super();
		this.lectores = new ArrayList<>();
		this.copias = new ArrayList<>();
		
		for (Copia copia : copias) {
			this.copias.add(copia.clone());
		}
		
		for (Lector lector : lectores) {
			this.lectores.add(lector.clone());
		}
		
	}

	Biblioteca(Biblioteca copiaBiblioteca) {
		this.lectores = copiaBiblioteca.lectores;
		this.copias = copiaBiblioteca.copias;
		
		for (int i = 0; i < copiaBiblioteca.copias.size(); i++) {			
			this.copias.add(copiaBiblioteca.copias.get(i).clone());
		}
		for (int i = 0; i < copiaBiblioteca.lectores.size(); i++) {			
			this.lectores.add(copiaBiblioteca.lectores.get(i).clone());
		}
	}
	

	public void prestarLibro() {
	}

	public void recogerLibro() {
	}
	
	public void altaLector() {
	}
	
	public void multado () {
	}


	public ArrayList<Lector> getLectores() {
		return lectores;
	}


	public void setLectores(ArrayList<Lector> lectores) {
		this.lectores = lectores;
	}


	public ArrayList<Copia> getCopias() {
		return copias;
	}


	public void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}
		
}
