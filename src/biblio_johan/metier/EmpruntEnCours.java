package biblio_johan.metier;

import java.util.Date;

public class EmpruntEnCours {

	private Exemplaire exemplaire;
	private Utilisateur utilisateur;
	private Date dateEmprunt;
	
	public EmpruntEnCours(Exemplaire exemplaire, Utilisateur utilisateur,
			Date dateEmprunt) throws BiblioException {
	
		utilisateur.addEmpruntEnCours(this);


		this.exemplaire = exemplaire;
		this.utilisateur = utilisateur;
		this.dateEmprunt = dateEmprunt;
		

		exemplaire.setEmpruntEnCours(this);
	}
	public void setDateEmpunt(Date dateEmpunt) {
		this.dateEmprunt = dateEmpunt;
	}

	public Date getDateEmpunt() {
		return dateEmprunt;
	}
	
	public static void main(String[] args) {
		System.out.println("Test");
	}
	@Override
	public String toString() {
		return "EmpruntEnCours [exemplaire=" + exemplaire + ", utilisateur="
				+ utilisateur + ", dateEmpunt=" + dateEmprunt + "]";
	}
	public Exemplaire getExemplaire() {
		return exemplaire;
	}
	public void setExemplaire(Exemplaire exemplaire) {
		this.exemplaire = exemplaire;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("L'emprunt en cours est garbage collecté");
	}
	
	
	
	
	
	
}
