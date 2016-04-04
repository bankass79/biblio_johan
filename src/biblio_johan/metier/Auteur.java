package biblio_johan.metier;

import java.util.Date;

public class Auteur extends Personne {

	public Auteur(String nom, String prenom, String sexe, Date dateNaissance) {
		super(nom, prenom, sexe, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Auteur []";
	}

}
