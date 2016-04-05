package biblio_johan.metier;

import java.util.ArrayList;
import java.util.Date;

public class Exemplaire {
	private int idExemplaire;
	private Livre livre;
	private Date dateAchat;
	private Status status;
	private EmpruntEnCours empruntEnCours;
	public enum Status { PRETE, DISPONIBLE, SUPPRIME }
	public Exemplaire(int idExemplaire,
			Livre livre,
			Date dateAchat, 
			Status status) {
		super();
		this.livre = livre;
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
		
		if (empruntEnCours != null) {
			this.status = Status.PRETE;
		}
		else {
			this.empruntEnCours.getUtilisateur().retirerEmpruntEnCours(this.empruntEnCours);
			EmpruntArchive.addEmpruntArchive(new Date(), this.empruntEnCours.getDateEmprunt());
			this.status= Status.DISPONIBLE;
		}
		this.empruntEnCours = empruntEnCours;
	}

	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", livre=" + livre
				+ ", dateAchat=" + dateAchat + ", status=" + status;
	}
	

}
