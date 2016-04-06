package test;

import java.util.Date;

import biblio_johan.dao.ExemplaireDao;
import biblio_johan.dao.UtilisateurDao;
import biblio_johan.metier.Adherent;
import biblio_johan.metier.EmpruntEnCours;
import biblio_johan.metier.Exemplaire;
import biblio_johan.metier.EmpruntArchive;

public class TestRetour {
	public static void main(String[] args) {
		ExemplaireDao exemplaireDao = new ExemplaireDao();
		Exemplaire ex1 = exemplaireDao.findByKey(1);
		Exemplaire ex2 = exemplaireDao.findByKey(2);
		
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		Adherent ad1 = (Adherent) utilisateurDao.findByKey(1);
		EmpruntEnCours empruntEnCours = new EmpruntEnCours(ex1, ad1, new Date());
		//System.out.println(ex1.getEmpruntEnCours());
		EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(ex2, ad1, new Date(0));
		System.out.println(ad1.getEmpruntEnCours());
	
		System.out.println("On rend exemplaire 2");
		ex2.rendre();
		System.out.println(ad1.getEmpruntEnCours());
		if (ex2.getStatus() == Exemplaire.Status.DISPONIBLE) {
			System.out.println("L'exemplaire 2 est disponible");
		}
		
		System.out.println(EmpruntArchive.getEmpruntsArchives());
		/*
		for (int i = 0 ; i < 100000 ; i++) {
			empruntEnCours = new EmpruntEnCours(ex2, ad1, new Date());
			ex2.setEmpruntEnCours(null);
		}
		*/
	}
}
