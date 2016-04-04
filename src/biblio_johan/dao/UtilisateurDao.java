package biblio_johan.dao;

import biblio_johan.metier.Adherent;
import biblio_johan.metier.Employe;
import biblio_johan.metier.Utilisateur;

public class UtilisateurDao {

	private Utilisateur[] utilisateurs;
	
	public UtilisateurDao() {
		utilisateurs = new Utilisateur[]{
				new Adherent(1, "gsdgds", "Amadou", "gsdmjg"),
				new Employe(Employe.Categorie.BIBLIOTHECAIRE, 
						44, "glmsdkjg", "Johan", "gmshjdgklhds")
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
}
