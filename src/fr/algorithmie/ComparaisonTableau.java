package fr.algorithmie;

public class ComparaisonTableau {

	public static void main(String[] args) {

		// Ecrire le code permettant de compter le nombre d’éléments en commun dans ces
		// 2 tableaux
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		// la variable qui portera le nombre des valeurs en commun initialisée a 0
		int v = 0;

		// deux boucles pour imbriquées avec un index pour chaque tableau

		for (int i = 0; i < array1.length; i++) {

			for (int j = 0; j < array2.length; j++) {

				// controle de l'égalité des valeurs de chaque tableau entre eux

				if (array1[i] == array2[j]) {

					// incrémentation de la variable de 1 pas a chaque égalité trouvée
					v++;
				}

			}
		}
		// affichage de résultat
		System.out.println("le nombres de valeurs en communs : " + v);

	}

}
