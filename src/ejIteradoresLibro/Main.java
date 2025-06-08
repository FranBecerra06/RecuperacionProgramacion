package ejIteradoresLibro;

public class Main {
	public static void main(String[] args) {
		CatalogoLibros catalogo = new CatalogoLibros();
		
		catalogo.agregarLibro(new Libro("1984", "George Orwell", 1949));
		catalogo.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", 2003));
		catalogo.agregarLibro(new Libro("Los juegos del hambre", "Suzanne Collins", 2008));

		System.out.println("Catálogo de libros:");
		
		for (Libro libro : catalogo) {
			
			System.out.println(libro);
		}
	}
}
