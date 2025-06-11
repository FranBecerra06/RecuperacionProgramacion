package Ejnivel5;

import java.util.*;

public class Asignaturas {

	public static void prueba() {

		Map<String, List<String>> asignaturas = new HashMap<>();

		asignaturas.put("Programacion", Arrays.asList("Ana", "Luis", "Carlos", "Beatriz"));
		asignaturas.put("Sistemas Informaticos", Arrays.asList("Carlos", "Luis", "Raúl", "Elena"));
		asignaturas.put("Base de datos", Arrays.asList("Ana", "Carlos", "Jorge"));

		// Se crea un mapa para contar cuántas veces aparece cada estudiante en distintas asignaturas
		Map<String, Integer> contadorEstudiantes = new HashMap<>();

		// Se recorren las listas de estudiantes contenidas en el mapa de asignaturas
		for (List<String> listaEstudiantes : asignaturas.values()) {

		    // Se recorre cada estudiante dentro de la lista de una asignatura
		    for (String estudiante : listaEstudiantes) {

		        // Se actualiza el contador de cada estudiante en el mapa, aumentando su valor en 1 si ya existe
		        contadorEstudiantes.put(estudiante, contadorEstudiantes.getOrDefault(estudiante, 0) + 1);
		    }
		}

		System.out.println();

		System.out.println("Estudiantes que están en varias asignaturas");

		// Se recorre el mapa que almacena el número de veces que aparece cada estudiante
		for (Map.Entry<String, Integer> entrada : contadorEstudiantes.entrySet()) {

		    // Se verifica si el estudiante aparece en más de una asignatura
		    if (entrada.getValue() > 1) {

		        // Se imprime el nombre del estudiante junto con el número de asignaturas en las que está inscrito
		        System.out.println(entrada.getKey() + " (aparece en " + entrada.getValue() + " asignaturas)");
		    }
		}

	}

}
