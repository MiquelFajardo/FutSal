package Club;

import ClassesAbstractes.Persona;

/**
 * Classe per les dades d'un directiu del club
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public class Directiu extends Persona {
	private String carrec;

	// Constructors
	public Directiu() {}
	
	public Directiu(String carrec) {
		super();
		this.carrec = carrec;
	}
	
	// Mètode accessors
	public String getCarrec() {
		return carrec;
	}
	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}		
}