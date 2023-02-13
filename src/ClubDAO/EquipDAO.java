package ClubDAO;

import Persistencia.InterficieDAO;

import java.sql.Connection;
import java.util.List;

import Club.Equip;

/**
 * Implementació DAO de la classe Equip
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class EquipDAO implements InterficieDAO<Equip, String> {

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void emmagatzemar(Equip entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(String identificador, Equip entitatNova) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Equip entitat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Equip obtenir(String identificador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Equip> obtenirTot() {
		// TODO Auto-generated method stub
		return null;
	}

}
