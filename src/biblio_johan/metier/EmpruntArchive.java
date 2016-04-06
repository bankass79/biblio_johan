package biblio_johan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntArchive {
	private Exemplaire exemplaire;
	private Utilisateur utilisateur;
	private Date dateRestitutionEff;
	private Date dateEmprunt;
	static private ArrayList<EmpruntArchive> empruntsArchives;
	
	public static void addEmpruntArchive(Exemplaire exemplaire,
			Utilisateur utilisateur, Date dateRestitution, Date dateEmprunt) {

		empruntsArchives = new ArrayList<>();
		empruntsArchives.add(new EmpruntArchive(exemplaire, utilisateur,
				dateRestitution, dateEmprunt));
	}
	
	
	public static ArrayList<EmpruntArchive> getEmpruntsArchives() {
		return empruntsArchives;
	}

	public static void setEmpruntsArchives(
			ArrayList<EmpruntArchive> empruntsArchives) {
		EmpruntArchive.empruntsArchives = empruntsArchives;
	}



	private EmpruntArchive(Exemplaire exemplaire,
			Utilisateur utilisateur, Date dateRestitution, Date dateEmprunt) {
		this.utilisateur = utilisateur;
		this.exemplaire = exemplaire;
		this.dateRestitutionEff = dateRestitution;
		this.dateEmprunt = dateEmprunt;
		
	}
	public Date getDateRestitution() {
		return dateRestitutionEff;
	}
	public void setDateRestitution(Date dateRestitution) {
		this.dateRestitutionEff = dateRestitution;
	}
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	 
	public  String dateRestitutionEff(String date, long days){
		days = dateRestitutionEff.getTime()- dateEmprunt.getTime();
		SimpleDateFormat sdf= new SimpleDateFormat ("yy-MM-dd");
		 String result="";
		 try {
			 Date df = sdf.parse(date);
			 GregorianCalendar calendar = new GregorianCalendar ();
			 calendar.setTime(df);
			 calendar.add(Calendar.DAY_OF_MONTH, (int) days);
			 result = sdf.format(calendar.getTime());
		 }
		catch  (ParseException e)
		 {
			e.printStackTrace();
			
		 }
		 return result;
		
	}
	@Override
	public String toString() {
		return "EmpruntArchive [exemplaire=" + exemplaire + ", utilisateur="
				+ utilisateur + ", dateRestitutionEff=" + dateRestitutionEff
				+ ", dateEmprunt=" + dateEmprunt + "]";
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


	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}


	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}
	
	
}
