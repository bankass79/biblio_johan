package biblio_johan.metier;

import java.util.Date;

public class Adherent extends Utilisateur {
	String ntelephone;
	static int nbMaxPrets=3;
	static int dureeMaxPrets=15;
	static long dureeMaxPretsMilliseconds = 15 * 24 * 60 * 60 * 1000;
	
	public Adherent(int idUtilisateur, String pwd, String pseudonyme,
			String ntelephone, String nom, String prenom, String sexe, Date dateNaissance) {
		super(idUtilisateur, pwd, pseudonyme, nom, prenom, sexe, dateNaissance);
		this.ntelephone = ntelephone;
	}

	public Adherent() {
		super();
	}
	
	public boolean isConditionPretAcceptees() {
		return getNombreEmprunt() < 3 && getNbRetards() == 0; 
	}
	
	public int getNbRetards() {
		int nbRetards = 0;
		for (EmpruntEnCours ep : empruntsEnCours) {
			if (new Date().getTime() - ep.getDateEmpunt().getTime() > 
				dureeMaxPretsMilliseconds) {
				nbRetards++;
			}
		}
		return nbRetards;
	}
	
 
	public void emprunter (Livre livre){
		livre.setEmpruntable (false);
	}
	// retirer le livre de la collection des livres empruntés par l'adhérent
	public void rendre (Livre livre){
	 livre.setEmpruntable (true);
	 
 }
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Adherent adherent = (Adherent) o;

		return ntelephone != null ? ntelephone.equals(adherent.ntelephone) : adherent.ntelephone == null;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (ntelephone != null ? ntelephone.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Adherent [ntelephone=" + ntelephone + "]";
	}
	
	
}
