package EquipoDeFutbol;

import java.util.*;

public enum Posicion {
 PORTERO(2000, 3000), DEFENSA(2500, 3500), CENTROCAMPISTA(3500, 4000), DELANTERO(4000, 5000);
 
 private final int salarioMin;
 private final int salarioMax;
 
 Posicion(int salarioMin, int salarioMax) {
     this.salarioMin = salarioMin;
     this.salarioMax = salarioMax;
 }
 
 public int getSalarioMin() { 
	 return salarioMin; 
	 }
 public int getSalarioMax() { 
	 return salarioMax; 
	 }
}

