package EquipoDeFutbol;

import java.util.ArrayList;
import java.util.List;

public class Futbolista implements Deportista, Comparable<Futbolista> {
    private String nombre;
    private int edad;
    private Posicion posicion;
    private int anyosProfesional;
    private List<String> equipos;
    private int trofeos;
    
    public Futbolista(String nombre, int edad, Posicion posicion, int anyosProfesional, List<String> equipos, int trofeos) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.anyosProfesional = anyosProfesional;
        this.equipos = new ArrayList<>(equipos);
        this.trofeos = trofeos;
    }
    
    public String getNombre() { 
    	return nombre; 
    }
    
    public int getEdad() { 
    	return edad; 
    }
    
    public Posicion getPosicion() { 
    	return posicion; 
    }
    
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    }
    
    public void setEdad(int edad) { 
    	this.edad = edad; 
    }
    
    public void setPosicion(Posicion posicion) { this.posicion = posicion; }
    
    @Override
    public int getAnyosProfesional() { return anyosProfesional; }
    
    @Override
    public List<String> getListadoEquipos() { return new ArrayList<>(equipos); }
    
    @Override
    public int getTotalTrofeos() { return trofeos; }
    
    @Override
    public String toString() {
        return "Futbolista{" + "nombre='" + nombre + '\'' + ", edad=" + edad + ", posicion=" + posicion + '}';
    }
    
    @Override
    public int compareTo(Futbolista otro) {
        return this.posicion.compareTo(otro.posicion);
    }
}
