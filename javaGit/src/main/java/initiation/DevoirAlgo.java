package initiation;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class DevoirAlgo {

	private static String player;
	private static String computer;
	private static String playerDecided;
	private static int computerNote;
	private static int playerNote;
	private static int quiGagne;
	private static boolean jouer;
	private static int countPoint;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jouer = true;
		countPoint = 0;
		while(jouer == true) {
			//commencer
			jeu();
			//compter scores 
			if(quiGagne == 2){countPoint++;};
			
			System.out.println("tu veux rejouer? Y or N ?");
			
			playerDecided = Clavier.lireString();
			
			//System.out.println(playerDecided instanceof String);
			
			if(playerDecided.equals("Y")) {jouer = true;
				
			}
			else {
				jouer = false;
				countPoint++;
				System.out.println("Merci de jouer avec moi, votre scores est " + countPoint);
			}
			}
		}
	public static void jeu() {
		countPoint = 0;
		System.out.println("pierre-feuille-ciseaux, joue!");
		player = Clavier.lireString(); 
	   computer = givenComputerRandomElement();
	   playerNote = changeNote(player);
	   computerNote = changeNote(computer);
	   quiGagne = compare2notes(playerNote,computerNote);
	   affichageGagner(quiGagne);
	}
	
	public static String givenComputerRandomElement() {
		Random rand = new Random();
		List<String> givenList = Arrays.asList("pierre","feuille","ciseaux");
		String randomElement = givenList.get(rand.nextInt(givenList.size()));
		return randomElement;
	}
	
	public static int changeNote(String a) {
		int note;
		if(a=="pierre") { note = 0;}
		else if(a=="feuille") { note = 1;}
		else {note = 2;}
		return note;
	}
	
     public static int compare2notes(int b, int c) {
    	 // 0: egal 1 ; 
    	 // 1: b est gagner ;
    	 // 2: c est gagner ;
    	 int QuiGagner;
    	 if( b == c) {
    		QuiGagner = 0;
    	 }
    	 else {
    		 if(b==0) {
    			 if (c==1) {
    				 QuiGagner = 2;
    			 }
    		     else { QuiGagner = 1;
    		    	}}
    		 else if(b==1) {
    			 if (c==2) {QuiGagner = 2;}
    		     else {	QuiGagner = 1;}}
    		 else {
    			 if (c==0) {QuiGagner = 2;}
    		     else {QuiGagner = 1;}}
    	 }return QuiGagner;
     } 
     
     public static void affichageGagner(int d) {
    	 if(d == 1) {
    		 System.out.println("Dommage!l'ordinateur a gagné");
    	 }
    	 else if(d == 2){
    		 System.out.println("Bravo!tu a gagné");
    	 }
    	 else {
    		 System.out.println("On a la même, rejoue?");
    	 }
     }
	}


