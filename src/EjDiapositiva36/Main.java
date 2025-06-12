package EjDiapositiva36;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String nombreArchivo = "texto.txt";

        // Verificar si el archivo existe antes de vaciarlo accidentalmente
        File archivo = new File(nombreArchivo);
        if (!archivo.exists()) {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado el archivo " + nombreArchivo);
                }
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        }

        ContadorPalabras.contarPalabras(nombreArchivo);
    }
}