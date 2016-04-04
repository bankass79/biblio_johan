package biblio_johan.metier;

import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private Livre livre;
	private Date dateAchat;
	private Status status;
	private EmpruntEnCours empruntEnCours;
	private ArrayList<EmpruntArchive> empruntsArchives;
	public enum Status { PRETE, DISPONIBLE, SUPPRIME }
	public Exemplaire(int idExemplaire,
			Livre livre,
			Date dateAchat, 
			Status status) {
		super();
		this.livre = livre;
		this.empruntsArchives = new ArrayList<>();
		this.idExemplaire = idExemplaire;
		this.dateAchat = dateAchat;
		this.status = status;
	}
	public int getIdExemplaire() {
		return idExemplaire;
	}
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public EmpruntEnCours getEmpruntEnCours() {
		return empruntEnCours;
	}
	public void setEmpruntEnCours(EmpruntEnCours empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}
	public ArrayList<EmpruntArchive> getEmpruntsArchives() {
		return empruntsArchives;
	}
	public void setEmpruntsArchives(ArrayList<EmpruntArchive> empruntsArchives) {
		this.empruntsArchives = empruntsArchives;
	}
	

}
