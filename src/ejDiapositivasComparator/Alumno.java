package ejDiapositivasComparator;

import java.util.*;

public class Alumno implements PersonaCentroEducativo {

	private String nombre;
	private String nia;
	private int edad;
	
	public Alumno(String nombre, String nia, int edad) {
		this.nombre = nombre;
		this.nia = nia;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNia() {
		return nia;
	}

	public int getEdad() {
		return edad;
	}


	public String toString() {
		return  nombre ;
	}
	
}

