package biblioteca;

import java.util.ArrayList;
import java.util.Date;
import java.util.Date;
import java.util.Date;

public class Lector {

	private Integer libros_prestamo;
	private Date multa;
	private ArrayList<Copia> copias;
	
	
	public Lector() {
		libros_prestamo=0;
		multa= new Date();
		copias = new ArrayList<>();
	}
	
	public Lector clone() {

		Lector clonDeLector = new Lector(this.libros_prestamo, this.multa, this.copias);
		
		return clonDeLector;
	}

	public Lector(Integer libros_prestamo, Date multa, ArrayList<Copia> copias) {
		super();
		this.libros_prestamo = libros_prestamo;
		this.multa = multa;
		this.copias = new ArrayList<>();
		
		for (Copia copia : copias) {
			this.copias.add(copia.clone());
		}
		
	}
	
	public Lector(Lector copiaLector) {
		super();
		this.libros_prestamo = copiaLector.libros_prestamo;
		this.multa = copiaLector.multa;
		this.copias = new ArrayList<>();
		
		for (int i = 0; i < copiaLector.copias.size(); i++) {			
			this.copias.add(copiaLector.copias.get(i).clone());
		}
	}
	
	
	public Integer getLibros_prestamo() {
		return libros_prestamo;
	}
	public void setLibros_prestamo(Integer libros_prestamo) {
		this.libros_prestamo = libros_prestamo;
	}
	public Date getMulta() {
		return multa;
	}
	public void setMulta(Date multa) {
		this.multa = multa;
	}
	public ArrayList<Copia> getCopias() {
		return copias;
	}
	public void setCopias(ArrayList<Copia> copias) {
		this.copias = copias;
	}

	
}
