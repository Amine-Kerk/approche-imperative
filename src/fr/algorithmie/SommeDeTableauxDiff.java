package fr.algorithmie;

public class SommeDeTableauxDiff {

	public static void main(String[] args) {
	
		//Déclaration du tableau 1
		int[] tab1 = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };

		// Déclaration du tableau 2
		int[] tab2 = { -1, 12, 17, 14, 5, -9, 0, 18 };

		// Déclaration du tableau du resultat de l'addition 
		
		int[] tabSom;

		// un controle pour savoir la taille du tableau la plus grande et elle sera prise par le tableau du resultat
		
		if (tab1.length >= tab2.length) {
			
			tabSom = new int[tab1.length];
		} else {
			tabSom = new int[tab2.length];
		}

		if (tab1.length >= tab2.length) {
			
			// Si le tableau 1 est le plus grand on fait la somme jusqua l'index max
			for (int i = 0; i < tab1.length; i++) {

				
				if (i < tab2.length) {
					tabSom[i] = tab1[i] + tab2[i];
				} else {
					tabSom[i] = tab1[i];
				}
				System.out.print(tabSom[i] + " ");
			}
		} else {
			// si le tableau 2 est le plus grand
			for (int i = 0; i < tab2.length; i++) {

				// On ne fait la somme que jusqu'à l'index max du tableau 1
				if (i < tab1.length) {
					tabSom[i] = tab1[i] + tab2[i];
				} else {
					tabSom[i] = tab2[i];
				}
				System.out.print(tabSom[i] + " ");
			} 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}