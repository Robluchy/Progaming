package biblioteca;

import java.util.ArrayList;
import java.util.Date;


public class Copia {

	private Integer identificador;
	private Integer estado;
	private Date fecha_prestamo;
	private ArrayList<Libro> libro;
	
	public Copia() {
		identificador=0;
		estado=0;
		fecha_prestamo= new Date();
		libro = new ArrayList<>();
	}

	public Copia(Integer identificador, Integer estado, Date fecha_prestamo, ArrayList<Libro> libro) {
		super();
		this.identificador = identificador;
		this.estado = estado;
		this.fecha_prestamo = fecha_prestamo;
		this.libro = new ArrayList<>();
		
		for (Libro Libro : libro) {
			this.libro.add(Libro.clone());
		}
	}

	public Copia(Copia copiaDeLaCopia) {
		this.identificador = copiaDeLaCopia.identificador;
		this.estado = copiaDeLaCopia.estado;
		this.fecha_prestamo = copiaDeLaCopia.fecha_prestamo;
		this.libro = new ArrayList<>();


		for (int i = 0; i < copiaDeLaCopia.libro.size(); i++) {			
			this.libro.add(copiaDeLaCopia.libro.get(i).clone());
		}
		
	}
	
	public Copia clone() {

		Copia clonDeCopia = new Copia(this.identificador, this.estado, this.fecha_prestamo, this.libro);
		
		return clonDeCopia;
		
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}
	public Integer getEstado() {
		return estado;
	}
	public Integer getEstado(Integer identificador) {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	public Date getFecha_prestamo() {
		return fecha_prestamo;
	}
	public void setFecha_prestamo(Date fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}
	public ArrayList<Libro> getLibro() {
		return libro;
	}
	public void setLibro(ArrayList<Libro> libro) {
		this.libro = libro;
	}
	
	
	
}
