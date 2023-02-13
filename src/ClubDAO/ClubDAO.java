package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.Club;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de Club
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */


public class ClubDAO implements InterficieDAO<Club, String> {
	
	public ClubDAO(Connection connexio) {
		super();
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(Club entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, Club entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Club entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Club obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Club> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}
}
