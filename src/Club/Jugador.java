package Club;

import ClassesAbstractes.Persona;

import java.util.List;

/**
 * Dades d'un jugador
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class Jugador extends Persona {
	private List<PersonaContacte> personsContacte;
	private boolean teGerma;	
	private String numerCompte;
	private String nomSemarreta;
	private String tallaSemarreta;
	private int numeroSemarreta;
	
	// Constructors
	public Jugador() {}

	public Jugador(List<PersonaContacte> personsContacte, boolean teGerma, String numerCompte, String nomSemarreta,
			String tallaSemarreta, int numeroSemarreta) {
		super();
		this.personsContacte = personsContacte;
		this.teGerma = teGerma;
		this.numerCompte = numerCompte;
		this.nomSemarreta = nomSemarreta;
		this.tallaSemarreta = tallaSemarreta;
		this.numeroSemarreta = numeroSemarreta;
	}

	// Mètodes accessors
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

	public String getNomSemarreta() {
		return nomSemarreta;
	}
	public void setNomSemarreta(String nomSemarreta) {
		this.nomSemarreta = nomSemarreta;
	}

	public String getTallaSemarreta() {
		return tallaSemarreta;
	}
	public void setTallaSemarreta(String tallaSemarreta) {
		this.tallaSemarreta = tallaSemarreta;
	}

	public int getNumeroSemarreta() {
		return numeroSemarreta;
	}
	public void setNumeroSemarreta(int numeroSemarreta) {
		this.numeroSemarreta = numeroSemarreta;
	}
	
}