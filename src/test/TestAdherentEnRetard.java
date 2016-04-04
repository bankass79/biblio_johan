package test;

import java.util.Date;

import biblio_johan.dao.ExemplaireDao;
import biblio_johan.dao.UtilisateurDao;
import biblio_johan.metier.Adherent;
import biblio_johan.metier.EmpruntEnCours;
import biblio_johan.metier.Exemplaire;

public class TestAdherentEnRetard {
	public static void main(String[] args) {
		ExemplaireDao exemplaireDao = new ExemplaireDao();
		Exemplaire ex1 = exemplaireDao.findByKey(1);
		Exemplaire ex2 = exemplaireDao.findByKey(2);
		
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		Adherent ad1 = (Adherent) utilisateurDao.findByKey(1);
		EmpruntEnCours empruntEnCours = new EmpruntEnCours(ex1, ad1, new Date(0));
		EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(ex2, ad1, new Date());
		System.out.println(ad1.getEmpruntEnCours());
	}
}
