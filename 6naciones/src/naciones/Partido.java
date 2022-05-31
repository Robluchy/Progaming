package naciones;

public class Partido extends Equipo {

    private ArrayList<Equipo> equipoLocal;
    private ArrayList<Equipo> equipoVisitante;
    private date fecha;
    private int golesLocal;
    private int golesVisitante;
    private ArrayList<Arbrito> arbitros;

    public Partido() {
        super();
        equipoLocal = new ArrayList<>();
        equipoVisitante = new ArrayList<>();
        fecha = null;
        golesLocal = 0;
        golesVisitante = 0;
        arbitros = new ArrayList<>();
    }

    public Partido(Partido p) {
        super(p);
        equipoLocal = new ArrayList<>();
        for (Equipo equipo : p.equipoLocal) {
            equipoLocal.add(equipo.clone());
        }
        equipoVisitante = new ArrayList<>();
        for (Equipo equipo : p.equipoVisitante) {
            equipoVisitante.add(equipo.clone());
        }
        fecha = p.fecha;
        golesLocal = p.golesLocal;
        golesVisitante = p.golesVisitante;
        arbitros = new ArrayList<>();
        for (Arbrito arbrito : p.arbitros) {
            arbitros.add(arbrito.clone());
        }

    }

    public Partido(String nombre, String apellido, Integer edad, ArrayList<Equipo> equipoLocal, ArrayList<Equipo> equipoVisitante, date fecha, int golesLocal, int golesVisitante, ArrayList<Arbrito> arbitros) {
        super(nombre, apellido, edad);
        this.equipoLocal = new ArrayList<>();
        for (Equipo equipo : equipoLocal) {
            this.equipoLocal.add(equipo.clone());
        }
        this.equipoVisitante = new ArrayList<>();
        for (Equipo equipo : equipoVisitante) {
            this.equipoVisitante.add(equipo.clone());
        }
        this.fecha = fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.arbitros = new ArrayList<>();
        for (Arbrito arbrito : arbitros) {
            this.arbitros.add(arbrito.clone());
        }
    }

    public ArrayList<Equipo> getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(ArrayList<Equipo> equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public ArrayList<Equipo> getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(ArrayList<Equipo> equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public date getFecha() {
        return fecha;
    }

    public void setFecha(date fecha) {
        this.fecha = fecha;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public ArrayList<Arbrito> getArbitros() {
        return arbitros;
    }

    public void setArbitros(ArrayList<Arbrito> arbitros) {
        this.arbitros = arbitros;
    }

    @Override
    public String toString() {
        return "Partido{" + "equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", fecha=" + fecha + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + ", arbitros=" + arbitros + '}';
    }







}
