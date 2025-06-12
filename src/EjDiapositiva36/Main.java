package EjDiapositiva36;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Nombre del archivo que quiero analizar
		String nombreArchivo = "texto.txt";

		// Llamada al método contarPalabras
		try {
			new java.io.PrintWriter(nombreArchivo).close();
		} catch (IOException e) {
			System.out.println("Error al crear el archivo: " + e.getMessage());
		}

		ContadorPalabras.contarPalabras(nombreArchivo);
	}

}
