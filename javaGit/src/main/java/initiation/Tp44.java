package initiation;

public class Tp44 {
	  public static void main(String args[]) {
	    int x = 1;
	    float a;
	    while (x <= 10) {
	      x++;
	      System.out.print("x = " + x);
	      if (x == 7) {
	        System.out.println("\tDivision par zero!");
	        continue;//l'instruction continue il est possible de traiter cette valeur à part puis de continuer la boucle!
	      }
	      a = (float) 1 / (x - 7);
	      System.out.println(" \ta = " + a);
	    }
	  }
	}


