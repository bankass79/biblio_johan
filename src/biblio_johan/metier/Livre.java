package biblio_johan.metier;

import java.util.ArrayList;

public class Livre {
	String isbn;
	String titre;
	Annee anneeParution;
	Integer nbPages;
	Theme theme;
	ArrayList<Auteur> auteurs;
	
	
	
	public Livre(String isbn, String titre, 
			Annee anneeParution, Integer nbPages,
			Theme theme, Auteur[] auteurs) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.anneeParution = anneeParution;
		this.nbPages = nbPages;
		this.theme = theme;
		this.auteurs = new ArrayList<>();
		for (Auteur a : auteurs) {
			this.auteurs.add(a);
		}
	}
	


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Annee getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(Annee anneeParution) {
		this.anneeParution = anneeParution;
	}

	public Integer getNbPages() {
		return nbPages;
	}

	public void setNbPages(Integer nbPages) {
		this.nbPages = nbPages;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public ArrayList<Auteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(ArrayList<Auteur> auteurs) {
		this.auteurs = auteurs;
	}
	
	public void addAuteur(Auteur auteur) {
		this.auteurs.add(auteur);
	}



	@Override
	public String toString() {
		return "Livre [isbn=" + isbn + ", titre=" + titre + ", anneeParution="
				+ anneeParution + ", nbPages=" + nbPages + ", theme=" + theme
				+ ", auteurs=" + auteurs + "]";
	}



	
	 
	 
	
	
}
