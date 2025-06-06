package ejInventarioMap;

import java.util.*;
import java.util.Map;

public class producto {

	public static void agregarProducto(Map<String, Integer> inventario, String producto, int cantidad) {
	    // Si el inventario no contiene el producto
	    if (!inventario.containsKey(producto)) {
	        // lo agregamos con la cantidad inicial indicada
	        inventario.put(producto, cantidad);
	        System.out.println("Producto agregado: " + producto + " con cantidad " + cantidad);
	    } else {
	        // Si el producto ya existe, obtenemos su cantidad actual y sumamos la nueva cantidad
	        int nuevaCantidad = inventario.get(producto) + cantidad; 
	        // Actualizamos el inventario con la cantidad sumada
	        inventario.put(producto, nuevaCantidad);
	        System.out.println("Producto actualizado: " + producto + " ahora tiene cantidad " + nuevaCantidad);
	    }
	}

	public static void actualizarStock(Map<String, Integer> inventario, String producto, int diferencia) {
	    // Verificamos si el producto existe en el inventario
	    if (inventario.containsKey(producto)) {
	        int stockActual = inventario.get(producto); // Obtenemos la cantidad actual del producto
	        int nuevoStock = stockActual + diferencia; // Calculamos el nuevo stock sumando o restando la diferencia
	        inventario.put(producto, nuevoStock); // Actualizamos el inventario con el nuevo stock
	        System.out.println("Stock actualizado: " + producto + " ahora tiene " + nuevoStock);
	    } else {
	        // Si el producto no se encuentra
	        System.out.println("El producto " + producto + " no se encontró en el inventario.");
	    }
	}

	public static int obtenerStock(Map<String, Integer> inventario, String producto) {
	    // Devuelve la cantidad del producto si existe, si no existe, devuelve 0
	    return inventario.getOrDefault(producto, 0);
	}

	public static int calcularTotalStock(Map<String, Integer> inventario) {
	    int total = 0; 
	    // Recorremos todas las cantidades que existen en el inventario
	    for (int cantidad : inventario.values()) {
	        total += cantidad; // Sumamos cada cantidad al total
	    }
	   
	    return total;
	}

	public static void removerProducto(Map<String, Integer> inventario, String producto) {
	    // Verificamos si el inventario contiene el producto
	    if (inventario.containsKey(producto)) {
	        // Si existe, lo eliminamos del inventario
	        inventario.remove(producto);
	        System.out.println("Producto removido: " + producto);
	    } else {
	        // Si no se encuentra
	        System.out.println("El producto " + producto + " no se encontró en el inventario.");
	    }
	}

	public static String obtenerProductoMayorStock(Map<String, Integer> inventario) {
	    String productoMayor = null; // Variable para almacenar el producto con mayor stock
	    int maxCantidad = Integer.MIN_VALUE; // Inicializamos con el valor mínimo para comparar
	    
	    // Recorremos cada entrada (producto y cantidad) del inventario
	    for (Map.Entry<String, Integer> entry : inventario.entrySet()) {
	        // Si la cantidad actual es mayor que la máxima registrada
	        if (entry.getValue() > maxCantidad) {
	            maxCantidad = entry.getValue();    // actualizamos la cantidad máxima
	            productoMayor = entry.getKey();      // actualizamos el producto con mayor stock
	        }
	    }
	    
	    return productoMayor;
	}
}
