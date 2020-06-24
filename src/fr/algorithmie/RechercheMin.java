package fr.algorithmie;

public class RechercheMin {

	public static void main(String[] args) {
	
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ; 
		 int pv = array[0];
		 //Rechercher le plus petit élément du tableau 
		 
		 for(int i=1;i<=array.length-1;i++) {
			 
			 if (array[i]<pv) {
				 
				 pv=array[i];
				 
				 
			 }
		 }
		 
		 System.out.print("la plus petite valeur est : "+pv);

	}

}
