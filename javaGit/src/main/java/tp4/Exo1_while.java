package tp4;

public class Exo1_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,i,som;
som = 0;
i=0;
while(i<4){
	System.out.println( i+" Donnez un entier");
	n = Clavier.lireInt();
	i++;
	som=som+n;
	
}
System.out.println( " Somme: " + som);}
}
