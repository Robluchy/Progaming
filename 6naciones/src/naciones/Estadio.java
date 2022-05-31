package naciones;

public class Estadio extends Partido{

    private ArrayList<Partido> partidos;
    private int capacidad;
    private String nombre;

    public Estadio() {
        super();
        partidos = new ArrayList<>();
        capacidad = 0;
        nombre = "";
    }

    public Estadio(Estadio estadio) {
        super(e);
        partidos = new ArrayList<>();
        for (Partido partido : estadio.partidos) {
            partidos.add(partido.clone());
        }
        capacidad = estadio.capacidad;
        nombre = estadio.nombre;
    }

    public Estadio(String nombre, int capacidad, ArrayList<Partido> partidos) {
        super();
        this.partidos = new ArrayList<>();
        for (Partido partido : partidos) {
            this.partidos.add(partido.clone());
        }
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estadio clone() {
        return new Estadio(this);
    }

    @Override
    public String toString() {
        return "Estadio{" + "partidos=" + partidos + ", capacidad=" + capacidad + ", nombre=" + nombre + '}';
    }
    


}
