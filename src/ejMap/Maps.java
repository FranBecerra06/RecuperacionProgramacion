package ejMap;

import java.util.*;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Creamos un HashMap para almacenar productos y sus precios
        Map<String, Double> productos = new HashMap<>();

        // Añadimos productos y sus precios al HashMap
        productos.put("Monitor", 100.3);
        productos.put("Teclado", 40.0);
        productos.put("Telefono", 300.0);
        productos.put("Ratón", 20.3);

        // Recorremos el HashMap y mostramos los productos
        System.out.println("Productos sin ordenar:");
        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            // Mostramos el nombre del producto y su precio
            System.out.println("El producto: " + producto.getKey() + " cuesta " + producto.getValue());
        }
        System.out.println();

        // Creamos un TreeMap con un Comparator personalizado para ordenar:
        // Primero, por el precio del producto
        // Segundo, por el nombre del producto en caso de que tengan el mismo precio
        TreeMap<String, Double> listaOrdenada = new TreeMap<>(new Comparator<String>() {
            public int compare(String clave1, String clave2) {
                // Compara los precios (valores) de los productos asociados a cada clave
                int comparacion = productos.get(clave1).compareTo(productos.get(clave2));
                // Si los precios son iguales, ordena alfabéticamente por el nombre (clave)
                if (comparacion == 0) {
                    return clave1.compareTo(clave2);
                }
                return comparacion;
            }
        });

        // Se transfieren todos los productos del HashMap al TreeMap, cambiando el orden pedido
        listaOrdenada.putAll(productos);

        // Recorremos el TreeMap ya ordenado e imprimimos cada producto con su precio
        System.out.println("Lista ordenada de productos:");
        for (Map.Entry<String, Double> entrada : listaOrdenada.entrySet()) {
            System.out.println("El producto: " + entrada.getKey() + " cuesta " + entrada.getValue());
        }
    }
}