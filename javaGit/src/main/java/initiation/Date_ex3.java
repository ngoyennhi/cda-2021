package initiation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ex3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		aujourdhui();
		maintenant();
		System.out.println("Saisir un jour");
		int jj = Clavier.lireInt();
		System.out.println("Saisir un mois");
		int mm = Clavier.lireInt();
		System.out.println("Sisir une année");
		int aaaa  = Clavier.lireInt();
		Date dateSaisie = saisirDate(jj,mm,aaaa);
		System.out.println(dateSaisie);
	}
	
public static void aujourdhui() {
	Date dateAujourdhui = new Date();
	SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
	String reformatedDate = myFormat.format(dateAujourdhui);
	System.out.println("Aujourd'hui est le "+reformatedDate);
	
}

@SuppressWarnings("deprecation")
public static void maintenant() {
	Date dateAujourdhui = new Date();
	int heure;
	heure = dateAujourdhui.getHours();
	int minute;
	minute = dateAujourdhui.getMinutes();
	System.out.println("Il est " + heure + ":" + minute);
}

public static Date saisirDate(int jj,int mm,int yyyy) throws ParseException {
	// vérifier les problems de saisir
	Date dateSaisiFormated = null;
	if(jj<1 || jj>31){
		System.out.println("ERREUR! Veuillez vérifier votre jour,svp");
	}
	else if(mm<1 || mm>31){
		System.out.println("ERREUR! Veuillez vérifier votre mois,svp");
	}
	else if(yyyy<0){
		System.out.println("ERREUR! Veuillez vérifier votre année,svp");
	}
	// Feb 29 jours maximum 
	else if(mm == 2 && jj > 29) {System.out.println("ERREUR! Veuillez vérifier votre jour,svp");}
	else if(jj == 31 && (mm == 4 || mm == 6 || mm == 9 || mm == 11)) {System.out.println("ERREUR! Veuillez vérifier votre jour,svp");}
	else {
		String dateStringSaisi= jj + "/" + mm + "/" + yyyy;
		SimpleDateFormat dateformated = new SimpleDateFormat("dd//yyyy");
		dateSaisiFormated = dateformated.parse(dateStringSaisi);
	}
	return dateSaisiFormated;
}
}
