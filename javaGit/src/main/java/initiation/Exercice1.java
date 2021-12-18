package initiation;

public class Exercice1 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		int i; // on initialise i comme un entier
		System.out.println("Veuillez saisir la note");
		i = Clavier.lireInt(); //on utilise la méthode LireInt,
		//lireInt est écris en pseudo code
		if(i >= 10) {
			System.out.println("Vous êtes admis(e)");
			if(i<12) {
				System.out.println("Votre mention est assez bien");
			}
			else {
				if(i< 14) {
					System.out.println("Votre mention est bien");
				}
				else {
					if(i<16) {System.out.println("Votre mention est très bien");}	
				}
			}
			
		}
		else {
			if ( i>=8) {
				System.out.println("Vous êtes sur liste d'attente");
			}
			else {
				System.out.println("Vous êtes refusé(e)");
			}
		}
}
}