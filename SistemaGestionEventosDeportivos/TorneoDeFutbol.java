package SistemaGestionEventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo {
    private ArrayList<Equipo> equipos;

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
        super(nombre, fecha, lugar);
        this.equipos = new ArrayList<>();
    }

    public ArrayList<Equipo> getEquipos() {
    	return equipos;
    }
    public void inscribirEquipo(Equipo equipo) {
    	equipos.add(equipo);
    }

    @Override
    public Equipo obtenerGanador() {
    	 if (equipos.isEmpty()) {
             return null;
         }
         Equipo ganador = equipos.get(0);
         for (Equipo e : equipos) {
             if (e.getPuntos() > ganador.getPuntos()) {
                 ganador = e;
             }
         }
         return ganador;
    }
    @Override
    public String toString() {
        return getNombre() + ", " + getLugar() + " (" + getFecha() + ").";
    }
}


