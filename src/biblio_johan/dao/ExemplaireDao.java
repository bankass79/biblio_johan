package biblio_johan.dao;

import java.util.Date;

import biblio_johan.metier.Annee;
import biblio_johan.metier.Auteur;
import biblio_johan.metier.Exemplaire;
import biblio_johan.metier.Livre;
import biblio_johan.metier.Theme;

public class ExemplaireDao {
	private Exemplaire[] exemplaires;
	public ExemplaireDao() {
		Livre livre1 = new Livre("4512", "gfdsfgs",
				new Annee(54), 564, 
				new Theme("gdsg", "dsg"), 
				new Auteur[]{
					new Auteur("gsdfkjh", "gsdmlkg", "goiu", new Date(0))
				});
		Livre livre2 = new Livre("ljkljkl", "gfluirrfdtgs",
				new Annee(879), 564, 
				new Theme("gdsg", "dsg"), 
				new Auteur[]{
					new Auteur("gsdfkjh", "gsdmlkg", "goiu", new Date(0))
				});
		exemplaires = new Exemplaire[] {
				new Exemplaire(5245,  
						livre1,
						new Date(58345), 
						Exemplaire.Status.DISPONIBLE),
				new Exemplaire(5245,  
						livre1,
						new Date(558345),
						Exemplaire.Status.DISPONIBLE),
				new Exemplaire(5245,  
						livre2,
						new Date(58345), 
						Exemplaire.Status.DISPONIBLE),
								
		};
	}
}
