package tp4;

import initiation.Clavier;

public class Ex2 {

	
		// TODO Auto-generated method stub
/**
 * Écrire un programme qui donne la moyenne de 4 notes ?

Écrire un programme qui selon la moyenne donne une mention

 « admis »: pour une moyenne supérieure ou égale à 10
« admissible » : pour une moyenne entre 8 et 10
« recalé » : pour une moyenne strictement inférieure à 8
 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int n,i,som, moyen;
	som = 0;
	i=0;
	while(i<4){
		System.out.println( i+" Donnez un entier");
		n = Clavier.lireInt();
		i++;
		som=som+n;
	}
	moyen = som/4;
	System.out.println( " Moyen: " + moyen);
	mention(moyen);
	}
		
		public static void mention(int i) {
			if(i >= 10) {
				System.out.println("Vous êtes admis(e)");
			}
			else {
				if ( i>=8 && i<10) {
					System.out.println("Vous êtes admissable");
				}
				else {
					System.out.println("Vous êtes recalé(e)");
				}
			}
	}
}
