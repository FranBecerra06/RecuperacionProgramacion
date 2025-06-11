package Ejnivel4;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		// Se crea una lista de alumnos utilizando ArrayList y se inicializa con varios objetos Alumno
		List<Alumno> alumnos = new ArrayList<>(Arrays.asList(

		    // Se agregan varios objetos Alumno con su nombre y calificación
		    new Alumno ("Carlos", 8.0),
		    new Alumno ("Paula", 10.0),
		    new Alumno ("Jorge", 9.5),
		    new Alumno ("Andres", 7.5),
		    new Alumno ("Luis", 8.5)
		));

		// Se ordena la lista de alumnos utilizando un comparador basado en la longitud del nombre
		Collections.sort(alumnos, new ComparadorPorLongitudNombre());

		System.out.println("Alumnos ordenados por longitud del nombre: ");
		alumnos.forEach(System.out::println);

		// Se vuelve a ordenar la lista utilizando un comparador que ordena por nota descendente y luego por nombre
		Collections.sort(alumnos, new ComparadorPorNotayNombre());

		System.out.println();
		System.out.println("Alumnos ordenados por nota descendente y nombre: ");
		alumnos.forEach(System.out::println);

		// Se crea un TreeSet, que es una estructura ordenada, utilizando el mismo comparador de nota descendente y nombre
		TreeSet<Alumno> treesetAlumnos = new TreeSet<>(new ComparadorPorNotayNombre());

		// Se añaden todos los elementos de la lista al TreeSet
		treesetAlumnos.addAll(alumnos);

		System.out.println();
		System.out.println("TreeSet ordenado por nota descendente y nombre: ");
		treesetAlumnos.forEach(System.out::println);
	}

}
