package biblioteca;

import java.util.Date;

public class Autor {

	private String nombre;
	private String nacionalidad;
	private Date fecha_nacimiento;
	
	

	
	
	public Autor() {
		nombre ="";
		nacionalidad="";
		fecha_nacimiento = new Date();
	}
	
	public Autor(String nombre, String nacionalidad, Date fecha_nacimiento) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fecha_nacimiento = fecha_nacimiento;
	}
		
	public Autor(Autor copiaAutor) {
		super();
		this.nombre = copiaAutor.nombre;
		this.nacionalidad = copiaAutor.nacionalidad;
		this.fecha_nacimiento = copiaAutor.fecha_nacimiento;
	}


	public Autor clone() {

		Autor clonDeAutor = new Autor(this.nombre, this.nacionalidad, this.fecha_nacimiento);
		
		return clonDeAutor;
	}
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
}
