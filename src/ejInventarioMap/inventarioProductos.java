package ejInventarioMap;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class inventarioProductos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventario = new HashMap<>();
        boolean salir = false;
        
        while (!salir) {
            System.out.println("=== Menú de Inventario ===");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar stock");
            System.out.println("3. Consultar stock de un producto");
            System.out.println("4. Calcular total del stock");
            System.out.println("5. Remover producto");
            System.out.println("6. Obtener producto con mayor stock");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String prod = scanner.nextLine();
                    System.out.print("Ingrese cantidad: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    producto.agregarProducto(inventario, prod, cantidad);
                    break;
                    
                case 2:
                    System.out.print("Ingrese nombre del producto: ");
                    prod = scanner.nextLine();
                    System.out.print("Ingrese diferencia (positiva o negativa): ");
                    int diferencia = scanner.nextInt();
                    scanner.nextLine();
                    producto.actualizarStock(inventario, prod, diferencia);
                    break;
                    
                case 3:
                    System.out.print("Ingrese el nombre del producto: ");
                    prod = scanner.nextLine();
                    System.out.println("Stock de " + prod + ": " + producto.obtenerStock(inventario, prod));
                    break;
                    
                case 4:
                    System.out.println("Total del stock: " + producto.calcularTotalStock(inventario));
                    break;
                    
                case 5:
                    System.out.print("Ingrese el nombre del producto a remover: ");
                    prod = scanner.nextLine();
                    producto.removerProducto(inventario, prod);
                    break;
                    
                case 6:
                    String prodMayor = producto.obtenerProductoMayorStock(inventario);
                    if (prodMayor != null) {
                        System.out.println("Producto con mayor stock: " + prodMayor + " (" + inventario.get(prodMayor) + ")");
                    } else {
                        System.out.println("No hay productos en el inventario.");
                    }
                    break;
                    
                case 7:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        
        scanner.close();
    
    }
}