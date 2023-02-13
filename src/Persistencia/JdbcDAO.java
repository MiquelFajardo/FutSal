package Persistencia;

import java.sql.Connection;
import java.util.List;

/**
 * Classe abstracta per la implementació del patró de disseny DAO
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public abstract class JdbcDAO<T> {
	protected Connection connexio;

	/**
	 * Constructor que rep la connexió per paràmetre
	 * @param connexio
	 */
	public JdbcDAO(Connection connexio) {		
		this.connexio = connexio;
	}

	/**
	 * Obté la connexió que es fara servir per executar les sentencies SQL
	 * @return
	 */
	public Connection getConnection() {
		return connexio;
	}
	
	/**
	 * Guarda les dades pasades per paràmetres
	 * @param entitat
	 */
	public void emmagatzemar(T entitat) {}
	
	/**
	 * Modifica les dades d'un objecte passat per pàrametre
	 * @param entitat
	 */
	public void modificar(T entitat) {}
	
	/**
	 * Eliminia les dades passades per paràmetre
	 * @param entitat
	 */
	public void eliminar(T entitat) {}
	
	/**
	 * Retorna un objecte que coincideixi amb l'identificador
	 * @param identificador
	 * @return
	 */
	public T obtenir(String identificador) {
		return null;
	}
	
	/**
	 * Obté totes les dades d'un objecte
	 * @return
	 */
	public List<T> obtenirTot() {
		return null;
	}
	
}
