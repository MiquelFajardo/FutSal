package Persistencia;

import java.sql.Connection;
import java.util.List;

/**
 * Interfície per la implementació del patró de disseny DAO
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public interface InterficieDAO<T,K> {
	// Obté la connexió que es fara servir per executar les sentencies SQL	
	public Connection getConnection();
	
	// Guarda les dades pasades per paràmetres
	public void emmagatzemar(T entitat);
	
	// Modifica les dades d'un objecte passat per pàrametre	 
	public void modificar(K identificador, T entitatNova);
	
	// Eliminia les dades passades per paràmetre
	public void eliminar(T entitat);
	
	// Retorna un objecte que coincideixi amb l'identificador	 
	public T obtenir(K identificador);
	
	// Obté totes les dades d'un objecte	 
	public List<T> obtenirTot();	
}
