package biblio_johan.metier;

import java.util.ArrayList;
import java.util.Date;

public abstract class Utilisateur extends Personne {
	protected 	int idUtilisateur;
	protected String pwd, pseudonyme;
	protected ArrayList<EmpruntEnCours> empruntsEnCours;
	protected ArrayList<EmpruntEnCours> empruntsArchive;
	
	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme,
	                   String nom, String prenom, String sexe, Date dateNaissance) {
		super(nom, prenom, sexe, dateNaissance);
		this.empruntsArchive = new ArrayList<>();
		this.empruntsEnCours = new ArrayList<>();
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}

	public Utilisateur () {
		super();
	}
	
	abstract public boolean isConditionPretAcceptees();
	
	public void addEmpruntEnCours(EmpruntEnCours ep) throws BiblioException {
		if (!isConditionPretAcceptees()) {
			throw new BiblioException("L'utilisateur ne peut pas emprunter de livre!");
		}
		empruntsEnCours.add(ep);
	}
	
	public void retirerEmpruntEnCours(EmpruntEnCours ep) {
		empruntsEnCours.remove(ep);
	}
	
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntsEnCours;
	}
	
	public int getNombreEmprunt() {
		return empruntsEnCours.size();
	}
	 
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPseudonyme() {
		return pseudonyme;
	}

	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;

		Utilisateur that = (Utilisateur) o;

		if (idUtilisateur != that.idUtilisateur) return false;
		if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
		if (pseudonyme != null ? !pseudonyme.equals(that.pseudonyme) : that.pseudonyme != null) return false;
		if (empruntsEnCours != null ? !empruntsEnCours.equals(that.empruntsEnCours) : that.empruntsEnCours != null)
			return false;
		return empruntsArchive != null ? empruntsArchive.equals(that.empruntsArchive) : that.empruntsArchive == null;

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + idUtilisateur;
		result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
		result = 31 * result + (pseudonyme != null ? pseudonyme.hashCode() : 0);
		result = 31 * result + (empruntsEnCours != null ? empruntsEnCours.hashCode() : 0);
		result = 31 * result + (empruntsArchive != null ? empruntsArchive.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd
				+ ", pseudonyme=" + pseudonyme + ", empruntsEnCours="
				+ empruntsEnCours + ", empruntsArchive=" + empruntsArchive
				+ "]";
	}
	
	
}
