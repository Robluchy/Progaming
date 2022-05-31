package naciones;

public class Arbrito extends Persona{

    private int presicion;

    public Arbrito() {
        super();
        presicion = 0;
    }

    public Arbrito(Arbrito a) {
        super(a);
        presicion = a.presicion;
    }

    public Arbrito(String nombre, String apellido, int edad, int presicion) {
        super(nombre, apellido, edad);
        this.presicion = presicion;
    }

    public int getPresicion() {
        return presicion;
    }

    public void setPresicion(int presicion) {
        this.presicion = presicion;
    }

    @Override
    public String toString() {
        return "Arbrito{" + "presicion=" + presicion + '}';
    }
    
}
