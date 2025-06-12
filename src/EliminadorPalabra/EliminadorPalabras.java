package EliminadorPalabra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

import java.io.*;

public class EliminadorPalabras {
	public static void eliminarPalabra(String nombreArchivo, String palabraEliminar) {
		StringBuilder contenidoModificado = new StringBuilder();
		try {
			FileReader fr = new FileReader(nombreArchivo);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String[] palabrasLinea = linea.split("\\s+");
				StringBuilder nuevaLinea = new StringBuilder();
				for (String palabra : palabrasLinea) {
					if (!palabra.equals(palabraEliminar)) {
						nuevaLinea.append(palabra).append(" ");
					}
				}
				contenidoModificado.append(nuevaLinea.toString().trim()).append(System.lineSeparator());
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
			return;
		}

		String nuevoArchivo;
		int pos = nombreArchivo.lastIndexOf(".");
		if (pos != -1) {
			nuevoArchivo = nombreArchivo.substring(0, pos) + "_2" + nombreArchivo.substring(pos);
		} else {
			nuevoArchivo = nombreArchivo + "_2";
		}

		try {
			FileWriter fw = new FileWriter(nuevoArchivo);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenidoModificado.toString());
			bw.close();
			System.out.println("El nuevo archivo se ha creado: " + nuevoArchivo);
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
}