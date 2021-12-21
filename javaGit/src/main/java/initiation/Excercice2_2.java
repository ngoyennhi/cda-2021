package initiation;

public class Excercice2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; // on initialise i comme un entier
		int j;
		System.out.println("Veuillez saisir un 1e numéro, svp");
		i = Clavier.lireInt(); //on utilise la méthode LireInt,
		//lireInt est écris en pseudo code
		System.out.println("Veuillez saisir un 2e numéro, svp");
		j= Clavier.lireInt(); 
	    if (i>j) {
	    	System.out.println("Max est le numéro: "+ i);
	    } else 
	    	{
	    	System.out.println("Max est le numéro: "+ j);
	    	};
	}
}
