package tp4;

public class Exo1_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int som, i, n; 
		som = 0;
		i = 0;
do{
System.out.println( i+" Donnez un entier");
n = Clavier.lireInt();
som = som+n;
i++;

} while(i<4);
	
System.out.println("Somme: " + som);
}
}
