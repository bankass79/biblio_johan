package test;

import java.util.Date;

import biblio_johan.dao.ExemplaireDao;
import biblio_johan.dao.UtilisateurDao;
import biblio_johan.metier.Adherent;
import biblio_johan.metier.Employe;
import biblio_johan.metier.EmpruntEnCours;
import biblio_johan.metier.Exemplaire;
import biblio_johan.metier.Livre;

public class TestDeBase {
	static public void main(String [] args){
		ExemplaireDao exemplairedao =  new ExemplaireDao();
		Exemplaire ex1 = exemplairedao.findByKey(1); 
		Exemplaire ex2 = exemplairedao.findByKey(3);
		
		UtilisateurDao utilisateurDao = new UtilisateurDao();
		Adherent ad1 = (Adherent) utilisateurDao.findByKey(1);
		Employe em2 = (Employe) utilisateurDao.findByKey(2);
		
		EmpruntEnCours empruntEnCours1 = new EmpruntEnCours(ex1, ad1, new Date());
		EmpruntEnCours empruntEnCours2 = new EmpruntEnCours(ex2, em2, new Date());
		
		System.out.println(ad1.getEmpruntEnCours());
		System.out.println(em2.getEmpruntEnCours());
	}
	
	
}
