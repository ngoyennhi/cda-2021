package initiation;

public class Exercice2_2_if_alors {

	public static void main(String[] args) {
int i;
int j;
System.out.println("Veuillez saisir un 1e numéro, svp");
i = Clavier.lireInt();
System.out.println("Veuillez saisir un 2e numéro, svp");
j = Clavier.lireInt();
if(i>j) {System.out.println("Max est le numéro: "+ i);};
if(j>i) {System.out.println("Max est le numéro: "+ j );};
	}
}
