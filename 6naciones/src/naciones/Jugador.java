package naciones;

public class Jugador extends Persona{

    private ArrayList<Equipo> equipo;
    private Integer velocidad;
    private Integer fuerza;
    private Integer resistencia;
    
    public Jugador() {
        super();
        equipo = new ArrayList<>();
        velocidad = 0;
        fuerza = 0;
        resistencia = 0;
    }

    public Jugador(Jugador j) {
        super(j);
        equipo = new ArrayList<>();
        for (Equipo e : j.equipo) {
            equipo.add(e.clone());
        }
        velocidad = j.velocidad;
        fuerza = j.fuerza;
        resistencia = j.resistencia;
    }

    public Jugador(String nombre, String apellido, Integer edad, ArrayList<Equipo> equipo, Integer velocidad, Integer fuerza, Integer resistencia) {
        super(nombre, apellido, edad);
        this.equipo = new ArrayList<>();
        for (Equipo e : equipo) {
            this.equipo.add(e.clone());
        }
        this.velocidad = velocidad;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }


    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getResistencia() {
        return resistencia;
    }

    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }


    //METHODS
    public Jugador clone() {
        Jugador clonDeJugador = new Jugador(this);
        return clonDeJugador;
    }

    
    public String toString() {
        String cadena = "";
        cadena += "Nombre: " + this.getNombre() + "\n";
        cadena += "Apellido: " + this.getApellido() + "\n";
        cadena += "Edad: " + this.getEdad() + "\n";
        cadena += "Equipo: " + this.getEquipo() + "\n";
        cadena += "Velocidad: " + this.getVelocidad() + "\n";
        cadena += "Fuerza: " + this.getFuerza() + "\n";
        cadena += "Resistencia: " + this.getResistencia() + "\n";
        return cadena;
    }



 


}
