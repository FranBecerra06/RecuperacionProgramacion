package EliminadorPalabra;

import java.io.IOException;
import java.util.*;

public class Main {
	    public static void main(String[] args) {
	        String archivo = "texto.txt"; 
	        String palabra = "ejemplo";   // La palabra a eliminar
	        
	        System.out.println("Eliminando la palabra \"" + palabra + "\" del archivo " + archivo + "...");
	        EliminadorPalabras.eliminarPalabra(archivo, palabra);
	    }
	}
