package biblio_johan.metier;

import java.util.ArrayList;

public class Theme {
	String code;
	String libelle;
	ArrayList<Theme> sousThemes;
	
	public Theme(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	
	public void addSousTheme(Theme sousTheme) {
		sousTheme.addSousTheme(sousTheme);
	}
	
}