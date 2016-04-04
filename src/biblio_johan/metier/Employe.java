package biblio_johan.metier;

import java.util.Date;

public class Employe  extends Utilisateur {
	public enum Categorie { BIBLIOTHECAIRE, RESPONSABLE, GESTIONNAIRE_DE_FONDS }
	Categorie categorie;
	String matricule;
	
	public Employe(Categorie categorie, int idUtilisateur, String pwd, 
			String pseudonyme, String matricule,
	               String nom, String prenom, String sexe, Date dateNaissance) {
		super(idUtilisateur, pwd, pseudonyme, nom, prenom, sexe, dateNaissance);
		this.categorie = categorie;
		this.matricule= matricule;
	}

	public Employe() {
		super();
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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Employe employe = (Employe) o;

		if (categorie != employe.categorie) return false;
		return matricule != null ? matricule.equals(employe.matricule) : employe.matricule == null;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (categorie != null ? categorie.hashCode() : 0);
		result = 31 * result + (matricule != null ? matricule.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Employe [categorie=" + categorie + ", matricule=" + matricule
				+ "]";
	}
	
	
}
