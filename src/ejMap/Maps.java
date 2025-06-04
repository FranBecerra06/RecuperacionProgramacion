package ejMap;

import java.util.*;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map<String, Double> productos = new HashMap<>();
		
		productos.put("Ratón", 20.3);
		productos.put("Teclado", 40.0);
		productos.put("Telefono", 300.0);
		productos.put("Monitor", 100.3);


		System.out.println("Productos sin ordenar:");
		
		for(Map.Entry<String, Double> producto : productos.entrySet()) {
			
			System.out.println("El producto: " + producto.getKey() + " cuesta " + producto.getValue() );
			System.out.println();
		}
		
		
		List<Map.Entry<String, Double>> listaordenada = new ArrayList<>(productos.entrySet());
		
		listaordenada.sort(Comparator.comparing(Map.Entry::getValue));
		
		System.out.println("Lista ordenada de productos:");
		
		for(Map.Entry<String , Double> entrada : listaordenada.getValue) {
			
			System.out.println("El producto: " + entrada.getKey() + " cuesta " + entrada.getValue());
			
		}
		
		
	}
}