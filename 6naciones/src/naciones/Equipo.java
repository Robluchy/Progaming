package naciones;

import java.lang.reflect.Array;

public class Equipo extends Jugador {

    private Enum nombreNacion;
    private Integer partidosJugados;
    private Integer partidosGanados;
    private Integer partidosPerdidos;
    private Integer partidosEmpatados;
    private ArrayList<Jugador> jugadores;
    private ArrayList<Entrenador> entrenadores;


    public Equipo() {
        super();
        nombreNacion = null;
        partidosJugados = 0;
        partidosGanados = 0;
        partidosPerdidos = 0;
        partidosEmpatados = 0;
        jugadores = new ArrayList<>();
        entrenadores = new ArrayList<>();
    }


    public Equipo(Equipo equipo) {
        super(e);
        nombreNacion = equipo.nombreNacion;
        partidosJugados = equipo.partidosJugados;
        partidosGanados = equipo.partidosGanados;
        partidosPerdidos = equipo.partidosPerdidos;
        partidosEmpatados = equipo.partidosEmpatados;
        jugadores = new ArrayList<>();
        for (Jugador jugador : equipo.jugadores) {
            jugadores.add(jugador.clone());
        }
        entrenadores = new ArrayList<>();
        for (Entrenador entrenador : entrenador.entrenadores) {
            entrenadores.add(entrenador.clone());
        }
    }


    public Equipo(String nombre, String apellido, Integer edad, Enum nombreNacion, Integer partidosJugados, Integer partidosGanados, Integer partidosPerdidos, Integer partidosEmpatados, ArrayList<Jugador> jugadores, ArrayList<Entrenador> entrenadores) {
        super(nombre, apellido, edad);
        this.nombreNacion = nombreNacion;
        this.partidosJugados = partidosJugados;
        this.partidosGanados = partidosGanados;
        this.partidosPerdidos = partidosPerdidos;
        this.partidosEmpatados = partidosEmpatados;
        this.jugadores = new ArrayList<>();
        for (Jugador jugador : jugadores) {
            this.jugadores.add(jugador.clone());
        }
        this.entrenadores = new ArrayList<>();
        for (Entrenador entrenador : entrenadores) {
            this.entrenadores.add(entrenador.clone());
        }
    }


    public Enum getNombreNacion() {
        return nombreNacion;
    }


    public void setNombreNacion(Enum nombreNacion) {
        this.nombreNacion = nombreNacion;
    }


    public Integer getPartidosJugados() {
        return partidosJugados;
    }


    public void setPartidosJugados(Integer partidosJugados) {
        this.partidosJugados = partidosJugados;
    }


    public Integer getPartidosGanados() {
        return partidosGanados;
    }


    public void setPartidosGanados(Integer partidosGanados) {
        this.partidosGanados = partidosGanados;
    }


    public Integer getPartidosPerdidos() {
        return partidosPerdidos;
    }


    public void setPartidosPerdidos(Integer partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }


    public Integer getPartidosEmpatados() {
        return partidosEmpatados;
    }


    public void setPartidosEmpatados(Integer partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }


    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }


    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    public ArrayList<Entrenador> getEntrenadores() {
        return entrenadores;
    }


    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }


    public Equipo clone() {
        return new Equipo(this);
    }


    public String toString() {
        return "Equipo [nombreNacion=" + nombreNacion + ", partidosJugados=" + partidosJugados + ", partidosGanados=" + partidosGanados + ", partidosPerdidos=" + partidosPerdidos + ", partidosEmpatados=" + partidosEmpatados + ", jugadores=" + jugadores + ", entrenadores=" + entrenadores + "]";
    }
    


}
