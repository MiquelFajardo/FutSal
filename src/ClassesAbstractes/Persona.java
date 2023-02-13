package ClassesAbstractes;

import java.util.List;

/**
 * Classe abstracta amb dades de persona
 * S'utilitzara per les classes de jugador, persona contacte, entrenador...
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public abstract class Persona {
	private String nif;
	private String nom;
	private String cognom1;
	private String cognom2;
	private String adreca;
	private String poblacio;
	private List<String> telefons;
	private List<String> correusElectronincs;
	private String contrasenya;
	private boolean actiu;
	
	// constructors
	public Persona() {}

	public Persona(String nif, String nom, String cognom1, String cognom2, String adreca, String poblacio,
			List<String> telefons, List<String> correusElectronincs, String contrasenya, boolean actiu) {	
		this.nif = nif;
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
		this.adreca = adreca;
		this.poblacio = poblacio;
		this.telefons = telefons;
		this.correusElectronincs = correusElectronincs;
		this.contrasenya = contrasenya;
		this.actiu = actiu;
	}

	// Mètodes accessors
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom1() {
		return cognom1;
	}
	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}
	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}

	public String getPoblacio() {
		return poblacio;
	}
	public void setPoblacio(String poblacio) {
		this.poblacio = poblacio;
	}

	public List<String> getTelefons() {
		return telefons;
	}
	public void setTelefons(List<String> telefons) {
		this.telefons = telefons;
	}

	public List<String> getCorreusElectronincs() {
		return correusElectronincs;
	}
	public void setCorreusElectronincs(List<String> correusElectronincs) {
		this.correusElectronincs = correusElectronincs;
	}
	
	public String getContrasenya() {
		return contrasenya;
	}
	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public boolean esActiu() {
		return actiu;
	}

	public void setActiu(boolean actiu) {
		this.actiu = actiu;
	}
}