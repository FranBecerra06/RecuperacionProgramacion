package Ejnivel4;

import java.util.*;

public class ComparadorPorLongitudNombre implements Comparator<Alumno>{

	public int compare(Alumno a1, Alumno a2) {
		
		return Integer.compare(a1.getNombre().length(), a2.getNombre().length());
	}
	
	
}