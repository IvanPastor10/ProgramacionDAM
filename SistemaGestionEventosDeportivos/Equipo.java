package SistemaGestionEventosDeportivos;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;
    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.jugadores = new ArrayList<>();
    }

    public String getNombre() {
    	return nombre;
    }
    
    public int getPuntos() {
    	return puntos;
    }
    public void setPuntos(int puntos) {
    	this.puntos = puntos;
    }

    public void añadirJugador(Participante jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(String nombre, String apellido)
    		throws JugadorNoEncontradoException {
    	  for (int i = 0; i < jugadores.size(); i++) {
    		  Participante jugador = jugadores.get(i);
              if (jugadores.get(i).getNombre().equals(nombre) && jugadores.get(i).getApellido().equals(apellido)) {
                  jugadores.remove(i);
                  return;
              }
          }
          throw new JugadorNoEncontradoException("Jugador no encontrado: " + nombre + " " + apellido);
      }
  
    @Override
    public String toString() {
        return nombre + " - " + puntos + " Pts." + "\n" + "Jugadores: " + jugadores;
    }
}