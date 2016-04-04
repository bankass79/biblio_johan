package biblio_johan.metier;

import java.util.Date;

public class Adherent extends Utilisateur {
	String ntelephone;
	static int nbMaxPrets=3;
	static int dureeMaxPrets=15;
	static long dureeMaxPretsMilliseconds = 15 * 24 * 60 * 60 * 1000;
	
	public Adherent(int idUtilisateur, String pwd, String pseudonyme,
			String ntelephone) {
		super(idUtilisateur, pwd, pseudonyme);
		this.ntelephone = ntelephone;
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

}
