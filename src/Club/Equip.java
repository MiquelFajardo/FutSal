package Club;

import java.util.List;

/**
 * Dades d'un equip de FutSal
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */

public class Equip {
	private String identificador;
	private String nom;
	private String categoria;
	private List<EquipTecnic> equipTecnic;
	private List<Jugador> jugadors;
	
	// Constructors
	public Equip() {}

	public Equip(String identificador, String nom, String categoria, List<EquipTecnic> equipTecnic, List<Jugador> jugadors) {	
		this.identificador = identificador;
		this.nom = nom;
		this.categoria = categoria;
		this.equipTecnic = equipTecnic;
		this.jugadors = jugadors;
	}

	// Mètodes accessors
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<EquipTecnic> getEquipTecnic() {
		return equipTecnic;
	}
	
	public void setEquipTecnic(List<EquipTecnic> equipTecnic) {
		this.equipTecnic = equipTecnic;
	}
	public List<Jugador> getJugadors() {
		return jugadors;
	}
	
	public void setJugadors(List<Jugador> jugadors) {
		this.jugadors = jugadors;
	}
}