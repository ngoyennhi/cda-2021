package tp5;

import java.util.Date;

public class Poo1 {
	
         /* Variable de classe*/
		 private static int random = (int) (new Date().getTime());
		 
		 /**
		  * Méthode qui fourni un nombre aléatoire
		  **/
		  public static int random() {
		  random = random ^ (random * random);
		  return random;
		  }
		  /**
		   * Méthode principale
		   **/
		   public static void main(String[] args) {
		   for (;;) //c'est une boucle sans fin 
		   System.out.println("Aleatoire : " + Poo1.random());
		   }
		  }
