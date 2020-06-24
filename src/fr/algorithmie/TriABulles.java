package fr.algorithmie;

public class TriABulles {

	public static void main(String[] args) {

		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		// premiere boucle pour la case 0
		for (int i = 0; i < array2.length - 1; i++) {
			// deuxieme boucle pour la case 1
			for (int j = i + 1; j < array2.length; j++) {
				// comparaison des deux cases
				if (array2[i] > array2[j]) {

					// variable temporaire qui prend en charge la valeur a décaler si elle existe
					int tmp = array2[i];
					array2[i] = array2[j];
					array2[j] = tmp;

				}
			}
		}
		// troisiéme boucle pour afficher le resultat
		for (int k = 0; k < array2.length; k++) {

			System.out.print(array2[k] + " ");

		}

	}

}
