package EjBBDD;

import java.util.*;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Agenda {
	    
public static void main(String[] args) {
    	
    	String DB_URL = "jdbc:mysql://localhost:3306/agenda";
	    String DB_USER = "root";
	    String DB_PASSWORD = "";
    	
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conexión exitosa.");

            InsertarCita cita = new InsertarCita();
            // Insertar una nueva cita
            cita.insertarCita(conn, "María González", "Dentista", LocalDateTime.of(2025, 6, 14, 16, 0));

            ConsultarCitas consultarcita = new ConsultarCitas();
            // Consultar citas posteriores a cierta fecha
            consultarcita.consultarCitasDesde(conn, LocalDateTime.of(2025, 6, 12, 0, 0));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }   
}