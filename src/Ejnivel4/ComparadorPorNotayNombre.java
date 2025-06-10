package Ejnivel4;

import java.util.*;

public class ComparadorPorNotayNombre implements Comparator<Alumno> {

	public int compare(Alumno a1, Alumno a2) {

		int comparacionNota = Double.compare(a1.getNota(), a2.getNota());

		if (comparacionNota == 0) {

			return a1.getNombre().compareTo(a2.getNombre());

		}

		return comparacionNota;

	}

}