package ejIteradoresLibro;

import java.util.*;

public class CatalogoLibros implements Iterable<Libro>{

	 ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public void agregarLibro(Libro libro) {
		
		libros.add(libro);
		
	}
	public Iterator<Libro> iterator(){
		
		return libros.iterator();
		
	}
	
}
