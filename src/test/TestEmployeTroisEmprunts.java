package test;

import java.util.Date;

import biblio_johan.dao.ExemplaireDao;
import biblio_johan.dao.UtilisateurDao;
import biblio_johan.metier.Adherent;
import biblio_johan.metier.BiblioException;
import biblio_johan.metier.Employe;
import biblio_johan.metier.EmpruntEnCours;
import biblio_johan.metier.Exemplaire;

public class TestEmployeTroisEmprunts {
	public static void main(String[] args) {
		ExemplaireDao exemplaireDao = new ExemplaireDao();
		Exemplaire ex1 = exemplaireDao.findByKey(1);
		Exemplaire ex2 = exemplaireDao.findByKey(2);
		Exemplaire ex3 = exemplaireDao.findByKey(3);
		Exemplaire ex4 = exemplaireDao.findByKey(4);
		
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		Employe ad1 = (Employe) utilisateurDao.findByKey(2);
		
		try {
			new EmpruntEnCours(ex1, ad1, new Date());
			new EmpruntEnCours(ex2, ad1, new Date());
			new EmpruntEnCours(ex3, ad1, new Date());
			System.out.println("Ok");
		} catch (BiblioException e) {
			System.out.println(e);
		}
		
		try {
		new EmpruntEnCours(ex4, ad1, new Date());
		} catch (BiblioException e) {
			System.out.println(e);
		}
		
	}
}
