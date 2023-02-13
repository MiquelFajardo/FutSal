package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.JuntaDirectiva;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de la classe JuntaDIrectiva
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class JuntaDirectivaDAO implements InterficieDAO<JuntaDirectiva, String>{

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(JuntaDirectiva entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, JuntaDirectiva entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(JuntaDirectiva entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public JuntaDirectiva obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<JuntaDirectiva> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean esActiu(String identificador) {
		return false;
	}
	
}
