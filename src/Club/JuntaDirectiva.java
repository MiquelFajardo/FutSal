package Club;

import java.util.List;

/**
 * Dades junta directiva d'una temporada
 * @author Miquel Fajardo <miquel.fajardo@protonmail.com>
 *
 */
public class JuntaDirectiva  {
	private List<Directiu> directius;

	// Constructors
	public JuntaDirectiva() {}
	
	public JuntaDirectiva(List<Directiu> directius) {		
		this.directius = directius;
	}
	
	// Mètodes accessors
	public List<Directiu> getDirectius() {
		return directius;
	}
	public void setDirectius(List<Directiu> directius) {
		this.directius = directius;
	}
}