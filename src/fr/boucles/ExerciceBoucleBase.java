package fr.boucles;

public class ExerciceBoucleBase {

	public static void main(String[] args) {

// boucle qui affiche les 10 premiers nombres avec incrémentation de 1 
		for (int i=1;i<11;i++) {
			
			System.out.println("les nombres sont : " +" "+i); 
		
		}
		    System.out.println("-----------------------------------------");
// boucle qui affiche 20 fois nom et prénom 
		for (int i=1;i<21;i++)    {
			
			System.out.println("kerkoub Amine"); 
		}
		
		    System.out.println("-----------------------------------------");

// Affichez les éléments pairs de 2 à 100		    
		    
		    for (int i=2;i<101;i+=2) {
		    	
		    System.out.println("les nombres pairs de 2 sont : "+i );
		    	
		    }
		    
		    System.out.println("-----------------------------------------");	
		    
//Affichez les éléments impairs de 1 à 99
		    
		    for (int i=1;i<100;i+=2) {
		    	
		    System.out.println("les nombres impairs sont : " +i );
		    
		    }
		    System.out.println("-----------------------------------------");
	}

}
