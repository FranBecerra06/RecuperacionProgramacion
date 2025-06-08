package ejIteradoresLibro;

import java.util.*;

public class CatalogoLibros implements Iterable<Libro> { // La clase implementa Iterable para permitir iteraciones con for-each

    ArrayList<Libro> libros = new ArrayList<Libro>(); // Lista de libros almacenados en el catálogo

    public void agregarLibro(Libro libro) { 
        libros.add(libro); // Agrega un libro a la lista
    }

    public Iterator<Libro> iterator() { 
        return libros.iterator(); // Devuelve un iterador para recorrer la lista de libros
    }
}
	

