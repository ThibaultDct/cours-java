package fr.boucles;

public class ExerciceBouclesEtTests {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Afficher tous les éléments du tableau
        System.out.println("Affichage entiers tableau :");
        for (int item : array) {
            System.out.println(item);
        }

        // Afficher tous les éléments du tableau dans l'ordre inverse
        System.out.println("Affichage entiers tableau sens inverse :");
        for (int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }

        // Afficher entiers supérieurs à 3
        System.out.println("Affichage entiers supérieurs à 3 :");
        for (int item : array){
            if (item > 3){
                System.out.println(item);
            }
        }

        // Afficher entiers pairs
        System.out.println("Affichage entiers pairs :");
        for (int item : array){
            if (item%2 == 0){
                System.out.println(item);
            }
        }

        // Afficher entiers aux indices pairs
        System.out.println("Affichage entiers aux indices pairs :");
        for (int i=0; i<array.length; i++){
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }

        // Afficher entiers impairs
        System.out.println("Affichage entiers impairs :");
        for (int item : array){
            if (item%2 != 0){
                System.out.println(item);
            }
        }
    }

}
