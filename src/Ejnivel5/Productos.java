package Ejnivel5;

import java.util.*;
import java.util.Map.Entry;

public class Productos {

	public static void prueba() {

		//13 Crear Map con productos y precios
		Map<String, Double> productos = new HashMap<>();

		productos.put("Manzanas", 2.5);
		productos.put("Peras", 3.0);
		productos.put("Naranjas", 1.5);
		productos.put("Plátano", 2.0);

		System.out.println("Productos y precios: ");
		System.out.println();
		
		//Mostrar las claves
		System.out.println("Claves");
		System.out.println();
		for (String clave : productos.keySet()) {

			System.out.println(clave);
		}
		System.out.println();
		
		//Mostrar los valores 
		System.out.println("Valores");
		System.out.println();

		for (Double valor : productos.values()) {

			System.out.println(valor);

		}
		System.out.println();

		//Map completo con claves y valores
		System.out.println("Map al completo:");
		System.out.println();

		for (Map.Entry<String, Double> entrada : productos.entrySet()) {

			System.out.println(entrada.getKey() + entrada.getValue());

		}
		System.out.println();
		
		// 14 Ordenar map por valor con Comparator
		List<Map.Entry<String, Double>> listaProductos = new ArrayList<>(productos.entrySet());
		listaProductos.sort(new Comparator<Map.Entry<String, Double>>() {

			public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {

				return e1.getValue().compareTo(e2.getValue());

			}

		});

		System.out.println("Map ordenado por valor:");

		for (Map.Entry<String, Double> entrada : listaProductos) {

			System.out.println(entrada.getKey() + " -> " + entrada.getValue());

		}

	}

}
