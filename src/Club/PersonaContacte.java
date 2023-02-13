package Club;

import ClassesAbstractes.Persona;

/**
 * Dades de persona de contacte d'un jugador
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public class PersonaContacte extends Persona {
	private String parentatge;

	// Constructors
	public PersonaContacte() {}
	
	public PersonaContacte(String parentatge) {	
		this.parentatge = parentatge;
	}
	
	// mètodes accessors
	public String getParentatge() {
		return parentatge;
	}
	public void setParentatge(String parentatge) {
		this.parentatge = parentatge;
	}	
}