package biblio_johan.metier;

public class Employe  extends Utilisateur {
	public enum Categorie { BIBLIOTHECAIRE, RESPONSABLE, GESTIONNAIRE_DE_FONDS }
	Categorie categorie;
	String matricule;
	
	public Employe(Categorie categorie, int idUtilisateur, String pwd, 
			String pseudonyme, String matricule) {
		super(idUtilisateur, pwd, pseudonyme);
		this.categorie = categorie;
		this.matricule= matricule;
	}

	@Override
	public boolean isConditionPretAcceptees() {
		return true;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}
