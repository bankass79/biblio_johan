package biblio_johan.metier;

import java.util.Date;

public class Personne {
	 protected  String nom, prenom, sexe;
	 protected Date dateNaissance;
	public Personne() {

	}

	public Personne(String nom, String prenom, String sexe, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Personne personne = (Personne) o;

		if (nom != null ? !nom.equals(personne.nom) : personne.nom != null) return false;
		if (prenom != null ? !prenom.equals(personne.prenom) : personne.prenom != null) return false;
		if (sexe != null ? !sexe.equals(personne.sexe) : personne.sexe != null) return false;
		return dateNaissance != null ? dateNaissance.equals(personne.dateNaissance) : personne.dateNaissance == null;

	}

	@Override
	public int hashCode() {
		int result = nom != null ? nom.hashCode() : 0;
		result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
		result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
		result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe
				+ ", dateNaissance=" + dateNaissance + "]";
	}
	
	
}
