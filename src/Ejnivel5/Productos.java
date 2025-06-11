package Ejnivel5;

import java.util.*;
import java.util.Map.Entry;

public class Productos {

	public static void prueba() {

		// 13 Crear Map con productos y precios
		Map<String, Double> productos = new HashMap<>();

		productos.put("Manzanas", 2.5);
		productos.put("Peras", 3.0);
		productos.put("Naranjas", 1.5);
		productos.put("Plátano", 2.0);

		System.out.println("Productos y precios: ");
		System.out.println();

		// Se recorren las claves del mapa y se imprimen una por una
		for (String clave : productos.keySet()) {
			System.out.println(clave);
		}
		System.out.println();

		System.out.println("Valores");
		System.out.println();

		// Se recorren los valores del mapa y se imprimen uno por uno
		for (Double valor : productos.values()) {
			System.out.println(valor);
		}
		System.out.println();

		System.out.println("Map al completo:");
		System.out.println();

		// Se recorren las entradas del mapa y se imprimen clave y valor juntos
		for (Map.Entry<String, Double> entrada : productos.entrySet()) {
			System.out.println(entrada.getKey() + entrada.getValue());
		}
		System.out.println();

		// Se convierte el conjunto de entradas del mapa en una lista para poder
		// ordenarla
		List<Map.Entry<String, Double>> listaProductos = new ArrayList<>(productos.entrySet());

		// Se ordena la lista según el valor usando un Comparator anónimo
		listaProductos.sort(new Comparator<Map.Entry<String, Double>>() {

			public int compare(Map.Entry<String, Double> e1, Map.Entry<String, Double> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});

		System.out.println("Map ordenado por valor:");

		// Se recorre la lista ya ordenada e imprime cada entrada con su clave y valor
		for (Map.Entry<String, Double> entrada : listaProductos) {
			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}

	}

}
