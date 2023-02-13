package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.PersonaContacte;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de la classe PersonaContacte
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class PersonaContacteDAO implements InterficieDAO<PersonaContacte, String> {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(PersonaContacte entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, PersonaContacte entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(PersonaContacte entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonaContacte obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonaContacte> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean esActiu(String identificador) {
		return false;
	}

}
