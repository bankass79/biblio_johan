package biblio_johan.metier;

import java.util.Date;

public class EmpruntArchive {
	private Date dateRestitution;
	private Date dateEmprunt;
	public EmpruntArchive(Date dateRestitution, Date dateEmprunt) {
		super();
		this.dateRestitution = dateRestitution;
		this.dateEmprunt = dateEmprunt;
	}
	public Date getDateRestitution() {
		return dateRestitution;
	}
	public void setDateRestitution(Date dateRestitution) {
		this.dateRestitution = dateRestitution;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	
}
