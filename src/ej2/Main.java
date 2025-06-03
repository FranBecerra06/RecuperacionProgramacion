package ej2;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Alumno> lista = new HashSet<>();
		
		Alumno a1 = new Alumno("Pep","222A",25);
		Alumno a2 = new Alumno("Sam","222B",18);
		Alumno a3 = new Alumno("Pep","222A",25);
		Alumno a4 = new Alumno("Kal","224C",20);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for(Alumno listaA:lista) {
			
			System.out.println(listaA);
		}
		
	}

}
