package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.Directiu;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de Directiu
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class DirectiuDAO implements InterficieDAO<Directiu, String> {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(Directiu entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, Directiu entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Directiu entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Directiu obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Directiu> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean esActiu(String identificador) {
		return false;
	}

}
