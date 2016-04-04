package biblio_johan.metier;

public class Annee {
	private int annee;

	public Annee(int annee) {
		this.annee = annee;
	}
	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) throws BiblioException {
		if (annee <= 0) {
			throw new BiblioException("L'année doit être supérieure à 0");
		}
		this.annee = annee;
	}
	@Override
	public String toString() {
		return "Annee [annee=" + annee + "]";
	}
	
	
}
