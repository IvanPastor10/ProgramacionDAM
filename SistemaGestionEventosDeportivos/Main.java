package SistemaGestionEventosDeportivos;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
        Carrera carrera = new Carrera("Carrera salesiana", LocalDate.of(2025, 6, 21), "Sevilla", 7000);
        Participante p1 = new Participante("Ivi", "Pastor", 18, 3600);
        Participante p2 = new Participante("Sergio", "Fernández", 18, 3500);
        carrera.inscribirParticipante(p1);
        carrera.inscribirParticipante(p2);
        System.out.println("Evento: " + carrera);
        System.out.println("Ganador: " + carrera.obtenerGanador());


        TorneoDeFutbol torneo = new TorneoDeFutbol("Copa medallas", LocalDate.of(2025, 3, 13), "Sevilla");
        Equipo equipo1 = new Equipo("Sevilla");
        Equipo equipo2 = new Equipo("Betis");
        equipo1.setPuntos(30);
        equipo2.setPuntos(15);
        torneo.inscribirEquipo(equipo1);
        torneo.inscribirEquipo(equipo2);
        Participante p3 = new Participante("Nabil", "Fekir", 25, 1);
        equipo1.añadirJugador(p3);
        System.out.println("Torneo: " + torneo);
        System.out.println("Ganador: " + torneo.obtenerGanador());

        try {
            equipo1.eliminarJugador("Nabil", "Fekir");
        } catch (JugadorNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
