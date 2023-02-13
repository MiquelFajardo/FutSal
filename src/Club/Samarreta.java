package Club;

/**
 * Informació de la semarreta de partit
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public class Samarreta {
	private String nom;
	private String talla;
	private int numero;
	
	// Constructors
	public Samarreta() {} 
	
	public Samarreta(String nom, String talla, int numero) {	
		this.nom = nom;
		this.talla = talla;
		this.numero = numero;
	}

	// Mètodes accessors
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}	
}