package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.Jugador;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de la classe Jugador
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class JugadorDAO implements InterficieDAO<Jugador, String> {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(Jugador entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, Jugador entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Jugador entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Jugador obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Jugador> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean esActiu(String identificador) {
		return false;
	}
}