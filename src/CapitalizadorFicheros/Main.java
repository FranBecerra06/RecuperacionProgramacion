package CapitalizadorFicheros;

public class Main {

	public static void main(String[] args) {

		String archivo = "texto.txt";
		System.out.println("Capitalizando el archivo " + archivo + "...");
		CapitalizadorFichero.capitalizarFichero(archivo);
	}

}
