package Club;

import java.util.List;

/**
 * Dades del club
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class Club {
	private String nif;
	private String nom;
	private String adreca;
	private String poblacio;
	private List<String> telefons;
	private List<String> correusElectornics;
	private List<String> paginesWeb;	
	private List<Temporada> temporades;
	
	// Constructors
	public Club() {}
	
	public Club(String nif, String nom, String adreca, String poblacio, List<String> telefons,
			List<String> correusElectornics, List<String> paginesWeb, List<Temporada> temporades) {		
		this.nif = nif;
		this.nom = nom;
		this.adreca = adreca;
		this.poblacio = poblacio;
		this.telefons = telefons;
		this.correusElectornics = correusElectornics;
		this.paginesWeb = paginesWeb;
		this.temporades = temporades;
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

	public List<String> getCorreusElectornics() {
		return correusElectornics;
	}
	public void setCorreusElectornics(List<String> correusElectornics) {
		this.correusElectornics = correusElectornics;
	}

	public List<String> getPaginesWeb() {
		return paginesWeb;
	}
	public void setPaginesWeb(List<String> paginesWeb) {
		this.paginesWeb = paginesWeb;
	}

	public List<Temporada> getTemporades() {
		return temporades;
	}
	public void setTemporades(List<Temporada> temporades) {
		this.temporades = temporades;
	}
}