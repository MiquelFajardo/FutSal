package Club;

import java.util.List;

/**
 * Dades de la temporada 
 * Miquel A Fajardo <miquel.fajardo@protonmail.com>
 * 
 */

public class Temporada {
	private String nom;
	private JuntaDirectiva juntaDirectiva;
	private List<Equip> equips;
	
	// Constructor
	public Temporada() {}
	
	public Temporada(String nom, JuntaDirectiva juntaDirectiva, List<Equip> equips) {
		this.nom = nom;
		this.juntaDirectiva = juntaDirectiva;
		this.equips = equips;
	}



	// Mètodes accessors
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public JuntaDirectiva getJuntaDirectiva() {
		return juntaDirectiva;
	}
	public void setJuntaDirectiva(JuntaDirectiva juntaDirectiva) {
		this.juntaDirectiva = juntaDirectiva;
	}

	public List<Equip> getEquips() {
		return equips;
	}
	public void setEquips(List<Equip> equips) {
		this.equips = equips;
	}
}