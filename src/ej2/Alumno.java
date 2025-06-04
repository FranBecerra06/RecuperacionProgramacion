package ej2;

import java.util.*;
import java.util.Objects;

public class Alumno {

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

	public boolean equals(Object objeto) {

		if (this == objeto) {

			return true;

		}

		if (objeto == null || getClass() != objeto.getClass()) {

			return false;

		}

		Alumno alumno = (Alumno) objeto;

		return 	Objects.equals(nombre, alumno.nombre) && 
				Objects.equals(nia, alumno.nia)&& 
				Objects.equals(edad, alumno.edad);

	}

	public int hashCode() {

		return Objects.hash(nia, edad, nombre);

	}

	

	public String toString() {
		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
	}

}
