package Ejnivel4;

import java.util.*;

public class Alumno {

	private String nombre;
	private double nota;

	public Alumno(String nombre, double nota) {

		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public double getNota() {
		return nota;
	}

	public String toString() {
		return "Nombre: " + nombre + ", nota: " + nota;
	}

}
