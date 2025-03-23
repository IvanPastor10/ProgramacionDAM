package EquipoDeFutbol;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Equipo equipo = new Equipo("Los medallas");

        try {
            // Agregar futbolistas hasta alcanzar el límite permitido por posición
            equipo.agregarFutbolista(new Futbolista("Sergio", 25, Posicion.PORTERO, 5, Arrays.asList("Equipo A"), 3));
            equipo.agregarFutbolista(new Futbolista("Aarón", 26, Posicion.PORTERO, 6, Arrays.asList("Equipo B"), 2));
            
            equipo.agregarFutbolista(new Futbolista("Alonsillo", 27, Posicion.DEFENSA, 7, Arrays.asList("Equipo C"), 2));
            equipo.agregarFutbolista(new Futbolista("Ivi", 28, Posicion.DEFENSA, 8, Arrays.asList("Equipo D"), 3));
            equipo.agregarFutbolista(new Futbolista("Jaime", 29, Posicion.DEFENSA, 9, Arrays.asList("Equipo E"), 4));
            equipo.agregarFutbolista(new Futbolista("Arturo", 30, Posicion.DEFENSA, 10, Arrays.asList("Equipo F"), 5));
            equipo.agregarFutbolista(new Futbolista("Enrique", 31, Posicion.DEFENSA, 11, Arrays.asList("Equipo G"), 6));
            
            equipo.agregarFutbolista(new Futbolista("Viso", 24, Posicion.CENTROCAMPISTA, 6, Arrays.asList("Equipo H"), 5));
            equipo.agregarFutbolista(new Futbolista("Coke", 25, Posicion.CENTROCAMPISTA, 7, Arrays.asList("Equipo I"), 6));
            equipo.agregarFutbolista(new Futbolista("Jose", 26, Posicion.CENTROCAMPISTA, 8, Arrays.asList("Equipo J"), 7));
            equipo.agregarFutbolista(new Futbolista("Paco", 27, Posicion.CENTROCAMPISTA, 9, Arrays.asList("Equipo K"), 8));
            equipo.agregarFutbolista(new Futbolista("Fernando", 28, Posicion.CENTROCAMPISTA, 10, Arrays.asList("Equipo L"), 9));
            
            equipo.agregarFutbolista(new Futbolista("Iker", 29, Posicion.DELANTERO, 8, Arrays.asList("Equipo M"), 7));
            equipo.agregarFutbolista(new Futbolista("Elías", 30, Posicion.DELANTERO, 9, Arrays.asList("Equipo N"), 8));
            equipo.agregarFutbolista(new Futbolista("Juan", 31, Posicion.DELANTERO, 10, Arrays.asList("Equipo O"), 9));
            equipo.agregarFutbolista(new Futbolista("Carlos", 32, Posicion.DELANTERO, 11, Arrays.asList("Equipo P"), 10));
            
         
            System.out.println("Formación del equipo (ordenada por posición):");
            equipo.listarFormacionDelEquipo();
            
            
            equipo.agregarFutbolista(new Futbolista("Extra", 33, Posicion.PORTERO, 12, Arrays.asList("Equipo X"), 11));
        } catch (RegistroFutbolistaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

