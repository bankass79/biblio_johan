package biblio_johan.dao;

import java.util.Date;

import biblio_johan.metier.Annee;
import biblio_johan.metier.Auteur;
import biblio_johan.metier.Exemplaire;
import biblio_johan.metier.Livre;
import biblio_johan.metier.Theme;

public class ExemplaireDao {
	public Exemplaire findByKey (int id) {
		for (Exemplaire ep: exemplaires) {
		 if ( ep.getIdExemplaire()== id){ return ep;} 	
		};
		return null;
	}  
	
	private Exemplaire[] exemplaires;
	public ExemplaireDao() {
		Livre livre1 = new Livre("4512", "Le cahat",
				new Annee(54), 564, 
				new Theme("Litterarture", "roman noir"), 
				new Auteur[]{
					new Auteur("Johan", "Amadou", "masculin", new Date(1987))
				});
		Livre livre2 = new Livre("222", "Asterix",
				new Annee(879), 564, 
				new Theme("Bande dessinée", "Bd enfant"), 
				new Auteur[]{
					new Auteur(" George", "Claude", "masculin", new Date(1987))
				});
		Livre livre3 = new Livre ("3", "Tarzan", new Annee(2005), 22, new Theme ("litterature", "roman enfant"), new Auteur[] {new Auteur("Robert", "Marie", "masculin", new Date (1979))});
		
		Livre livre4 = new Livre ("4", "Bambi", new Annee(2005), 22, new Theme ("litterature", "roman enfant"), new Auteur[] {new Auteur("Robert", "Claudette", "masculin", new Date (1959))});
		
		exemplaires = new Exemplaire[] {
				new Exemplaire(1,  
						livre1,
						new Date(58345), 
						Exemplaire.Status.DISPONIBLE),
				new Exemplaire(2,  
						livre1,
						new Date(558345),
						Exemplaire.Status.DISPONIBLE),
				new Exemplaire(3,  
						livre2,
						new Date(58345), 
						Exemplaire.Status.DISPONIBLE),
				new Exemplaire(4,  
						livre3,
						new Date(58345), 
						Exemplaire.Status.DISPONIBLE),
								
		};
	}
}
