package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.Temporada;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de la classe Temporada
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class TemporadaDAO implements InterficieDAO<Temporada, String>{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(Temporada entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, Temporada entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Temporada entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Temporada obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Temporada> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}

}
