package ejDiapositivasComparator;

import java.util.*;

public class Docente implements PersonaCentroEducativo {

	private String nombre;
	private int permanencia;
	private double salario;

	public Docente(String nombre, int permanencia, double salario) {
		this.nombre = nombre;
		this.permanencia = permanencia;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPermanencia() {
		return permanencia;
	}

	public double getSalario() {
		return salario;
	}

	public String toString() {
		return  nombre ;
	}

}
