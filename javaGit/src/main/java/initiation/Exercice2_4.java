package initiation;

public class Exercice2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // on initialise i comme un entier
		int max_num;
		System.out.println("Veuillez saisir un 1e numéro, svp");
		i = Clavier.lireInt(); //on utilise la méthode LireInt,
		max_num = i;
		//lireInt est écris en pseudo code
		System.out.println("Veuillez saisir un 2e numéro, svp");
	    i = Clavier.lireInt(); 
	    if (i>max_num) {
	    	max_num = i;
	    };
		System.out.println("Veuillez saisir un 3e numéro, svp");
	    i = Clavier.lireInt(); 
	    if (i>max_num) {
	    	max_num = i;
	    };
		System.out.println("Veuillez saisir un 4e numéro, svp");
	    i = Clavier.lireInt(); 		
	    if (i>max_num) {
	    	max_num = i;
	    };  
	    System.out.println("Max est le numéro: "+ max_num );
	}
}