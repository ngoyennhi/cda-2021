package initiation;

import java.util.Scanner;

public class Tp43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valeur;
		String chaine_lue;
		try {
			//une boucle do/while vous êtes assuré que le corps sera exécuté au moins une fois. 
		    do {
		         // Lecture d'une ligne au clavier
		         chaine_lue = sc.nextLine();
		         //Conversion de la chaine en entier
		         valeur=Integer.parseInt(chaine_lue);
		       }while ((valeur < 5) || ( valeur > 10));
		} catch (Exception e) {
		    System.out.println("Erreur d'Entree/Sortie " + e.getMessage());
		}
	}

}
