package ClubDAO;

import java.sql.Connection;
import java.util.List;

import Club.EquipTecnic;
import Persistencia.InterficieDAO;

/**
 * Implementació DAO de la classe EquipTecnic
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class EquipTecnicDAO implements InterficieDAO<EquipTecnic, String> {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(EquipTecnic entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, EquipTecnic entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(EquipTecnic entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EquipTecnic obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EquipTecnic> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean esActiu(String identificador) {
		return false;
	}
}
