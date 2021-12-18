package initiation;

public class Exercice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // on initialise i comme un entier
		int j;
		int k;
		int l;
	    int max;
		System.out.println("Veuillez saisir un 1e numéro, svp");
		i = Clavier.lireInt(); //on utilise la méthode LireInt,
		//lireInt est écris en pseudo code
		System.out.println("Veuillez saisir un 2e numéro, svp");
	    j = Clavier.lireInt(); 
		System.out.println("Veuillez saisir un 2e numéro, svp");
	    k = Clavier.lireInt(); 
		System.out.println("Veuillez saisir un 2e numéro, svp");
	    l = Clavier.lireInt(); 		
	    
	    if (i>j && i>k && i>k && i>l) {
	    	max = i;
	    };
	    
	    System.out.println("Max est le numéro: "+ i );
	}
}
