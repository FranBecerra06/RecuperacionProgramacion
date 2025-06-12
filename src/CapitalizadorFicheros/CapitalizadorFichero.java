package CapitalizadorFicheros;

import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CapitalizadorFichero {
	public static void capitalizarFichero(String nombreArchivo) {
		StringBuilder contenidoModificado = new StringBuilder();
		try {
			FileReader fr = new FileReader(nombreArchivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] palabras = linea.split(" ");
				StringBuilder nuevaLinea = new StringBuilder();
				for (String palabra : palabras) {
					if (!palabra.isEmpty()) {
						String capitalizada = palabra.substring(0, 1).toUpperCase()
								+ (palabra.length() > 1 ? palabra.substring(1).toLowerCase() : "");
						nuevaLinea.append(capitalizada).append(" ");
					}
				}
				contenidoModificado.append(nuevaLinea.toString().trim()).append(System.lineSeparator());
			}
			br.close();

			FileWriter fw = new FileWriter(nombreArchivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenidoModificado.toString());
			bw.close();
			System.out.println("El fichero " + nombreArchivo + " ha sido capitalizado.");
		} catch (IOException e) {
			System.out.println("Error al procesar el archivo: " + e.getMessage());
		}
	}

}
