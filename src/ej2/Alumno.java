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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNia() {
		return nia;
	}

	public void setNia(String nia) {
		this.nia = nia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean equals(Object objeto) {

		if (this == objeto) {

			return true;

		}

		if (objeto == null || getClass() != objeto.getClass()) {

			return false;

		}

		Alumno other = (Alumno) objeto;

		return Objects.equals(nia, other.nia);

	}

	public int hashCode() {

		return Objects.hash(nia);

	}

	public String toString() {
		return "Alumno [nombre=" + nombre + ", nia=" + nia + ", edad=" + edad + "]";
	}

}
