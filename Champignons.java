/*
 * Le but de ce jeu est de faire découvrir à l'ordinateur quel est le champignon auquel on pense.
 * L'ordinateur va nous poser 3 questins au maximum. Nous pouvons répondre seulement par oui ou non.
 */

import java.util.Scanner;

public class Champi {

	 public static void main(String[] args) {
	        Scanner clavier = new Scanner(System.in);
	        System.out.println("Pensez a un champignon : amanite tue mouches, pied bleu, girolle,");
	        System.out.println("cèpe de Bordeaux, coprin chevelu ou agaric jaunissant.");
	        
	        
	        boolean saisie1= false, saisie2=false, saisie3=false;
	        
	        System.out.print("Est-ce que votre champignon a un anneau (true : oui, false : non) ? ");
	        saisie1 = clavier.nextBoolean();
	        
	        System.out.print("Est-ce que votre champignon a un chapeau convexe (true : oui, false : non) ? ");
	        saisie2 = clavier.nextBoolean();
	        
	        System.out.print(saisie1);
	        System.out.print(saisie2);
	        
	        if ((saisie1)&&(saisie2)) {
	        	System.out.print("Est-ce que votre champignon vit en forêt (true : oui, false : non) ? ");
	        	saisie3 = clavier.nextBoolean();
	        } else if ((!saisie1)&&(!saisie2)) {
	        	System.out.print("Est-ce que votre champignon a des lamelles (true : oui, false : non) ? ");
	        	saisie3 = clavier.nextBoolean();
	        }
	        System.out.print("Abracadabra!!! Le champignon auquel vous pensez est ");
	        
	        if ((saisie1)&&(saisie2)&&(saisie3)) {
	        	System.out.print("l'amanite tue-mouches");
	        }
	        if ((saisie1)&&(saisie2)&&(!saisie3)) {
	        	System.out.print("l'agaric jaunissant");
	        }
	        if ((saisie1)&&(!saisie2)) {
	        	System.out.print("le coprin chevelu");	
	        }
	        if ((!saisie1)&&(!saisie2)&&(!saisie3)) {
	        	System.out.print("le cèpe de Bordeaux");
	        }
	        if ((!saisie1)&&(!saisie2)&&(saisie3)) {
	        	System.out.print("la girolle");
	        }
	        if ((!saisie1)&&(saisie2)) {
	        	System.out.print("le pied bleu");
	        }
	  }
}

