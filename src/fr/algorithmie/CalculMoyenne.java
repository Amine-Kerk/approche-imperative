package fr.algorithmie;

public class CalculMoyenne {

	public static void main(String[] args) {

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int som = 0;
		double moy;
		// Quelle est la moyenne des éléments du tableau ?

		for (int i = 0 ; i <= array.length - 1; i++) {

			som = som + array[i];

		}

		moy = (som / 17);
		System.out.println("la moyenne est : " + moy);
	}

}
