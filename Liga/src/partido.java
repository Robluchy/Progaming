public class partido {
    
    // Atributos de la clase partido
    private equipoLocal Equipo;
    private equipoVisitante Equipo;
    private estadio Estadio;
    private arbitro Arbitro;
    private date Fecha;
    private int golesLocal;
    private int golesVisitante;

    // Constructor de la clase partido vacio
    public partido() {
        equipoLocal = null;
        equipoVisitante = null;
        estadio = null;
        arbitro = null;
        fecha = null;
        golesLocal = 0;
        golesVisitante = 0;
        
    }

    // Constructor de la clase partido

    public partido(equipoLocal Equipo, equipoVisitante Equipo, estadio Estadio, arbitro Arbitro, date Fecha, int golesLocal, int golesVisitante) {
        this.Equipo = Equipo;
        this.Equipo = Equipo;
        this.Estadio = Estadio;
        this.Arbitro = Arbitro;
        this.Fecha = Fecha;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    // Metodos get y set de la clase partido

    public equipoLocal getEquipo() {
        return Equipo;
    }

    public void setEquipo(equipoLocal Equipo) {
        this.Equipo = Equipo;
    }

    public equipoVisitante getEquipo() {
        return Equipo;
    }

    public void setEquipo(equipoVisitante Equipo) {
        this.Equipo = Equipo;
    }

    public estadio getEstadio() {
        return Estadio;
    }

    public void setEstadio(estadio Estadio) {
        this.Estadio = Estadio;
    }

    public arbitro getArbitro() {
        return Arbitro;
    }

    public void setArbitro(arbitro Arbitro) {
        this.Arbitro = Arbitro;
    }

    public date getFecha() {
        return Fecha;
    }

    public void setFecha(date Fecha) {
        this.Fecha = Fecha;
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

    // Metodo toString de la clase partido

    @Override
    public String toString() {
        return "partido{" + "Equipo=" + Equipo + ", Equipo=" + Equipo + ", Estadio=" + Estadio + ", Arbitro=" + Arbitro + ", Fecha=" + Fecha + ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + '}';
    }



}
