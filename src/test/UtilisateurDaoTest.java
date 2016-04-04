package test;

import biblio_johan.dao.UtilisateurDao;
import biblio_johan.metier.Employe;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by johan on 4/4/16.
 */
public class UtilisateurDaoTest {

	@org.junit.Test
	public void testFindByKey() throws Exception {
		Employe shouldFind = new Employe(Employe.Categorie.BIBLIOTHECAIRE,
				2, "glmsdkjg", "Johan", "0795439453",
				"Johan", "Baskovec", "M", new Date(42));
		UtilisateurDao utilisateurDao = new UtilisateurDao();

		assertEquals(utilisateurDao.findByKey(2), shouldFind);
	}
}