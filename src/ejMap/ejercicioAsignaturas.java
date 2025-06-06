package ejMap;

import java.util.*;

public class ejercicioAsignaturas {

    public static void main(String[] args) {
        // Creamos un HashMap que relaciona cada asignatura con la lista de estudiantes inscritos
        // La clave es el nombre de la asignatura y el valor es una lista de nombres de estudiantes
        Map<String, List<String>> asignaturas = new HashMap<>();

        // Añadimos asignaturas junto con sus correspondientes listas de estudiantes
        asignaturas.put("Programacion", Arrays.asList("Ana", "Luis", "Carlos", "Ana"));//Ana duplicada en la misma asignatura
        asignaturas.put("Sistemas Informaticos", Arrays.asList("Ana", "Andres", "Laura"));
        asignaturas.put("Base de Datos", Arrays.asList("Luis", "Carlos", "Fernando", "Ana"));
        asignaturas.put("Entorno de Desarrollo", Arrays.asList("Pedro", "Susana"));

        // Creamos un HashMap para contar la cantidad de asignaturas en las que aparece cada estudiante
        // La clave es el nombre del estudiante y el valor es el número de asignaturas
        Map<String, Integer> numAparicion = new HashMap<>();

        // Recorremos cada lista de estudiantes de cada asignatura con for each
        for (List<String> estudiantes : asignaturas.values()) {
            // Convertimos la lista en un Set para eliminar duplicados dentro de la misma asignatura
            Set<String> estudiantesUnicos = new HashSet<>(estudiantes);

            // Para cada estudiante único, incrementamos su contador en el map
            for (String estudiante : estudiantesUnicos) {
                // Si el estudiante ya está en el map se incrementa su conteo, de lo contrario, se inicia en 0 y se suma 1
                numAparicion.put(estudiante, numAparicion.getOrDefault(estudiante, 0) + 1);
            }
        }

        // Imprimimos los nombres de los estudiantes que están inscritos en dos o más asignaturas
        System.out.println("Nombres que están en varias asignaturas:");
        for (Map.Entry<String, Integer> entrada : numAparicion.entrySet()) {
            if (entrada.getValue() >= 2) {
                System.out.println(entrada.getKey() + " aparece en " + entrada.getValue() + " asignaturas");
            }
        }
    }
}