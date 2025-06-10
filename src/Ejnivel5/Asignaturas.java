package Ejnivel5;

import java.util.*;

public class Asignaturas {

	public static void prueba() {

		Map<String, List<String>> asignaturas = new HashMap<>();

		asignaturas.put("Programacion", Arrays.asList("Ana", "Luis", "Carlos", "Beatriz"));
		asignaturas.put("Sistemas Informaticos", Arrays.asList("Carlos", "Luis", "Raúl", "Elena"));
		asignaturas.put("Base de datos", Arrays.asList("Ana", "Carlos", "Jorge"));

		Map<String, Integer> contadorEstudiantes = new HashMap<>();
		for (List<String> listaEstudiantes : asignaturas.values()) {

			for (String estudiante : listaEstudiantes) {

				contadorEstudiantes.put(estudiante, contadorEstudiantes.getOrDefault(estudiante, 0) + 1);

			}

		}
		System.out.println();

		System.out.println("Estudiantes que están en varias asignaturas");
		for (Map.Entry<String, Integer> entrada : contadorEstudiantes.entrySet()) {
			if (entrada.getValue() > 1) {
				System.out.println(entrada.getKey() + " (aparece en " + entrada.getValue() + " asignaturas)");
			}
		}

	}

}
