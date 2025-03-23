package EquipoDeFutbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Futbolista> futbolistas;
    private int[] maxPorPosicion = {2, 5, 5, 4};
    
    public Equipo(String nombre) {
        this.nombre = nombre;
        this.futbolistas = new ArrayList<>();
    }
    
    public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {
        int conteo = 0;
        for (Futbolista f : futbolistas) {
            if (f.getPosicion() == futbolista.getPosicion()) {
                conteo++;
            }
        }
        if (conteo >= maxPorPosicion[futbolista.getPosicion().ordinal()]) {
            throw new RegistroFutbolistaException("No se puede añadir más " + futbolista.getPosicion() + " en el equipo.");
        }
        futbolistas.add(futbolista);
    }
    
    public void listarFormacionDelEquipo() {
        Collections.sort(futbolistas);
        Iterator<Futbolista> iterator = futbolistas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}