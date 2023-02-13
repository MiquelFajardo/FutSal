/**
 * Utilitats per treballar amb Base de dades PostgreSQL
 * Miquel A Fajardo <miquel.fajardo@protonmail.com>
 */

package Utilitats;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UtilitatsJDBC {
	final static String ARXIU_CONFIGURACIO = "configuracio.properties";
	
	public static Connection connectar() {
		Connection connexio = null;
		String url = null;
		String usuari = null;
		String contrasenya = null;
		
		// Carreguem les dades per la connexió amb la base de dades			
			Properties properties = new Properties();
			try {
				String arxiu = "src" + System.getProperty("file.separator") + ARXIU_CONFIGURACIO;
				properties.load(new FileInputStream(arxiu));
			} catch (FileNotFoundException ex) {
				System.out.println("Error (UtilitatsJDBC - connectar) No s'ha trobat l'arxiu amb les dades de connexió de la base de dades");				
			} catch (IOException ex) {
				System.out.println("Error (UtilitatsJDBC - connectar) No s'ha pogut carregar les dades de connexió amb la base de dades");				
			}
			url = properties.getProperty("jdbc.url");
			usuari = properties.getProperty("jdbc.usuari");
			contrasenya = properties.getProperty("jdbc.contrasenya");
		
		// Connectar amb la base de dades
		try {			 
			connexio = DriverManager.getConnection(url, usuari, contrasenya);	
			System.out.print("OK");
		} catch (SQLException ex) {
			System.out.println("Error (UtilitatsJDBC - connectar) No s'ha pogut connectar amb la base de dades");
		}		
		return connexio;
	}
}