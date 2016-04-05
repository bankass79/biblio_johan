package biblio_johan.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EmpruntArchive {
	private Date dateRestitution;
	private Date dateEmprunt;
	static private ArrayList<EmpruntArchive> empruntsArchives;
	
	public static void addEmpruntArchive(Date dateRestitution, Date dateEmprunt) {
		empruntsArchives = new ArrayList<>();
		empruntsArchives.add(new EmpruntArchive(dateRestitution, dateEmprunt));
	}
	
	
	public static ArrayList<EmpruntArchive> getEmpruntsArchives() {
		return empruntsArchives;
	}

	public static void setEmpruntsArchives(
			ArrayList<EmpruntArchive> empruntsArchives) {
		EmpruntArchive.empruntsArchives = empruntsArchives;
	}



	private EmpruntArchive(Date dateRestitution, Date dateEmprunt) {
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
	 
	public  String dateRestitutionEff(String date, long days){
		days = dateRestitution.getTime()- dateEmprunt.getTime();
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
		return "EmpruntArchive [dateRestitution=" + dateRestitution
				+ ", dateEmprunt=" + dateEmprunt + "]";
	}
	
	
}
