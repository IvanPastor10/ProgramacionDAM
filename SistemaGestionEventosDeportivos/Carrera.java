package SistemaGestionEventosDeportivos;

import java.time.LocalDate;

public class Carrera extends EventoDeportivo {
    private double distancia;

    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    public double getDistancia() {
    	return distancia;
    }
    public void setDistancia(double distancia) {
    	this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador() {
        if (getParticipantes().isEmpty()) {
            return null;
        }
        Participante ganador = getParticipantes().get(0);
        for (Participante p : getParticipantes()) {
            if (p.getTiempo() < ganador.getTiempo()) {
                ganador = p;
            }
        }
        return ganador;
    }
    @Override
    public String toString() {
        return getNombre() + ", " + getLugar() + " (" + getFecha() + "). " + distancia + "m.";
    }
}