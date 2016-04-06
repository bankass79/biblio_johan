package biblio_johan.metier;

import java.util.ArrayList;
import java.util.Date;

public abstract class Utilisateur extends Personne {
	protected 	int idUtilisateur;
	protected String pwd, pseudonyme;
	protected ArrayList<EmpruntEnCours> empruntsEnCours;
	
	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme,
	                   String nom, String prenom, String sexe, Date dateNaissance) {
		super(nom, prenom, sexe, dateNaissance);
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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (empruntsEnCours == null) {
			if (other.empruntsEnCours != null)
				return false;
		} else if (!empruntsEnCours.equals(other.empruntsEnCours))
			return false;
		if (idUtilisateur != other.idUtilisateur)
			return false;
		if (pseudonyme == null) {
			if (other.pseudonyme != null)
				return false;
		} else if (!pseudonyme.equals(other.pseudonyme))
			return false;
		
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((empruntsEnCours == null) ? 0 : empruntsEnCours.hashCode());
		result = prime * result + idUtilisateur;
		result = prime * result
				+ ((pseudonyme == null) ? 0 : pseudonyme.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd
				+ ", pseudonyme=" + pseudonyme + ", empruntsEnCours="
				+ empruntsEnCours
				+ "]";
	}
	
	
}
