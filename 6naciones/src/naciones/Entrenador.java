package naciones;

public class Entrenador extends Persona {

    private int experiencia;
    private ArrayList<Equipo> equipo;

    public Entrenador() {
        super();
        experiencia = 0;
        equipo = new ArrayList<>();
    }

    public Entrenador(Entrenador e) {
        super(e);
        experiencia = e.experiencia;
        equipo = new ArrayList<>();
        for (Equipo e1 : e.equipo) {
            equipo.add(e1.clone());
        }
    }

    public Entrenador(String nombre, String apellido, int edad, int experiencia, ArrayList<Equipo> equipo) {
        super(nombre, apellido, edad);
        this.experiencia = experiencia;
        this.equipo = new ArrayList<>();
        for (Equipo e : equipo) {
            this.equipo.add(e.clone());
        }
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "experiencia=" + experiencia + ", equipo=" + equipo + '}';
    }


    public Entrenador clone() {
        return new Entrenador(this);
    }




}
