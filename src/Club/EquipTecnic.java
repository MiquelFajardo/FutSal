package Club;

import ClassesAbstractes.Persona;

/**
 * Dades de membres del equip técnic d'un equip
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
	
public class EquipTecnic extends Persona {
	private String carrec;

	// Constrcutors
	public EquipTecnic() {}
	
	public EquipTecnic(String carrec) {
		super();
		this.carrec = carrec;
	}

	// Mètodes accessors
	public String getCarrec() {
		return carrec;
	}
	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}
}