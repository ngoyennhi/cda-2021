package initiation;

public class Tp32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i; // on initialise i comme un entier
System.out.println("Saisissez un nombre");
i = Clavier.lireInt(); //on utilise la méthode LireInt,
//lireInt est écris en pseudo code
if (i != 1) // si i est different de 1 alors
{System.out.println("Vous avez saisi: " +i);
System.out.println("-1");//fin du programme
	}
else //sinon
{
	System.out.println("Bravo");}
	}

}
