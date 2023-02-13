package Club;

import ClassesAbstractes.Persona;

import java.util.List;

/**
 * Dades d'un jugador
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class Jugador extends Persona {
	private Samarreta samarreta;	
	private List<PersonaContacte> personsContacte;
	private boolean teGerma;
	private String numerCompte;
	
	// Constructors
	public Jugador() {}
	
	public Jugador(Samarreta samarreta, List<PersonaContacte> personsContacte, boolean teGerma, String numerCompte) {	
		this.samarreta = samarreta;
		this.personsContacte = personsContacte;
		this.teGerma = teGerma;
		this.numerCompte = numerCompte;
	}

	// Mètodes accessors
	public Samarreta getSamarreta() {
		return samarreta;
	}
	public void setSamarreta(Samarreta samarreta) {
		this.samarreta = samarreta;
	}

	public List<PersonaContacte> getPersonsContacte() {
		return personsContacte;
	}
	public void setPersonsContacte(List<PersonaContacte> personsContacte) {
		this.personsContacte = personsContacte;
	}

	public boolean teGerma() {
		return teGerma;
	}
	public void setTeGerma(boolean teGerma) {
		this.teGerma = teGerma;
	}

	public String getNumerCompte() {
		return numerCompte;
	}
	public void setNumerCompte(String numerCompte) {
		this.numerCompte = numerCompte;
	}
}