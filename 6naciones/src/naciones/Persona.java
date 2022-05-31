package naciones;

abstract class Persona {

    private date fechaNacimiento;
    private double peso;
    private String nombreCompleto;
    
    // CONSTRUCTOR PARAMETRIZADO
    public Persona(date fechaNacimiento, double peso, String nombreCompleto) {
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.nombreCompleto = nombreCompleto;
    }

    // CONSTRUCTOR POR DEFECTO
    public Persona() {

        peso=0;
        nombreCompleto="";
        fechaNacimiento=new date();

    }

    // CONSTRUCTOR DE COPIA
    public Persona(Persona p) {
        this.fechaNacimiento = p.fechaNacimiento;
        this.peso = p.peso;
        this.nombreCompleto = p.nombreCompleto;
    }


    //GETTERS AND SETTERS

    public date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }



    public String toString() {
        return "Persona{" + "fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", nombreCompleto=" + nombreCompleto + '}';
    }



}
