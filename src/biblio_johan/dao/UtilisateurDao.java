package biblio_johan.dao;

import biblio_johan.metier.Adherent;
import biblio_johan.metier.Employe;
import biblio_johan.metier.Utilisateur;

import java.util.Date;

public class UtilisateurDao {

	private Utilisateur[] utilisateurs;
	
	public UtilisateurDao() {
		utilisateurs = new Utilisateur[]{
				new Adherent(1, "password5",
						"Amadou", "0605439392",
						"Amadou", "Amadou",
						"M", new Date(42)),

				new Employe(Employe.Categorie.BIBLIOTHECAIRE, 
						2, "glmsdkjg", "Johan", "0795439453",
						"Johan", "Baskovec", "M", new Date(42))
				
		};
	}
	
	public Utilisateur findByKey(Integer id) {
		for (Utilisateur u: utilisateurs) {
			if (u.getIdUtilisateur() == id) {
				return u;
			}
		}
		return null;
	}

	public Utilisateur[] findAll() {

		return utilisateurs;
	}
}
