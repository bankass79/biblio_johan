package biblio_johan.metier;

import java.util.ArrayList;

public abstract class Utilisateur {
	protected 	int idUtilisateur;
	protected String pwd, pseudonyme;
	protected ArrayList<EmpruntEnCours> empruntsEnCours;
	protected ArrayList<EmpruntEnCours> empruntsArchive;
	
	public Utilisateur(int idUtilisateur, String pwd, String pseudonyme) {
		super();
		this.empruntsArchive = new ArrayList<>();
		this.empruntsEnCours = new ArrayList<>();
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudonyme = pseudonyme;
	}

	public Utilisateur () {
	 
		super ();
	}
	
	abstract public boolean isConditionPretAcceptees();
	
	public void addEmpruntEnCours(EmpruntEnCours ep) {
		empruntsEnCours.add(ep);
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

}
