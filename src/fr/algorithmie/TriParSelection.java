package fr.algorithmie;

public class TriParSelection {

	public static void main(String[] args) {
		
		//Impl�menter la m�thode tri par s�lection
		
		int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
		
		//une premiere boucle pour parcourir les elements du tableau � partir de lindice 0
		
		for (int i=0;i<array2.length;i++ ) {
			
		//une deuxieme boucle pour parcourir les elements du tableau avec indice d�cal� � une case
			
			
			
			
			for(int j=i+1;j<array2.length;j++) {
// test des cases pour la valeur sup�rieur 
				
				if (array2[i]>array2[j]) {
					
//si notre boucle est confirm�e j'affecte une variable temporaire qui nous 
					//sauvgarde la valeur sup�rieur a chaque test

					int tmp=array2[i];
					array2[i]=array2[j];
					array2[j]=tmp;
				
					
				}
					
			}
		}
		
// une troisi�me boucle pour pr�parer l'affichage du nouveau tableau
		for (int k=0;k<array2.length;k++) {
			
			System.out.print(array2[k]+" ");
		}
		
		
		
	
		
		
	} 

}
