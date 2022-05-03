public class jugadores {
    
    // Atributos de la clase jugadores 
    private String nombre;
    private String apellido;
    private int edad;
    private String posicion;
    private int numero;

    // Constructor de la clase jugadores
    public jugadores(String nombre, String apellido, int edad, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.posicion = posicion;
        this.numero = numero;
    }
    
    // Metodos get y set de la clase jugadores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Metodo toString de la clase jugadores
    @Override
    public String toString() {
        return "jugadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", posicion=" + posicion + ", numero=" + numero + '}';
    }

    
}
