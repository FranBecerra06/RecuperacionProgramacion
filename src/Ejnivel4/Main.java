package Ejnivel4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
		
		new Alumno ("Carlos", 8.0),
		new Alumno ("Paula", 10.0),
		new Alumno ("Jorge", 9.5),
		new Alumno ("Andres", 7.5),
		new Alumno ("Luis", 8.5)
		
				));
		
		Collections.sort(alumnos, new ComparadorPorLongitudNombre());
		System.out.println("Alumnos ordenados por longitud del nombre: ");
		alumnos.forEach(System.out::println);
		
		Collections.sort(alumnos, new ComparadorPorNotayNombre());
		System.out.println("Alumnos ordenados por nota descendente y nombre: ");
		alumnos.forEach(System.out::println);
		
		TreeSet<Alumno> treesetAlumnos = new TreeSet<>(new ComparadorPorNotayNombre());
		
		treesetAlumnos.addAll(alumnos);
		System.out.println("treeSet ordenado por nota descendente y nombre: ");
		treesetAlumnos.forEach(System.out::println);

	}

}
