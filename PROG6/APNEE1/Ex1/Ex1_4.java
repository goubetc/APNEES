import java.util.*;

class Essai_Scanner {
    public static void main(String [] args) {
        Scanner my_scanner;
        int entier;
        boolean erreur = true;

        while(erreur) {
		    erreur = false;
		    try {
		    	my_scanner = new Scanner(System.in);
				System.out.println("Saisissez un entier");
				entier = my_scanner.nextInt();
				System.out.println("Vous avez l'entier : " + entier);
			}
			catch(InputMismatchException e) {
				System.out.println("Pas un int bolosse");
				erreur = true;
			}
		}
    	    	
    }
}
