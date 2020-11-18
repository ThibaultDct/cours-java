package fr.algorithmie;

public class AffichagePartiel {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Affichage entiers supérieurs à 3
        System.out.println("Affichage entiers supérieurs à 3 :");
        for (int item : array){
            if (item > 3){
                System.out.println(item);
            }
        }

        // Affichage entiers pairs
        System.out.println("Affichage entiers pairs :");
        for (int item : array){
            if (item%2 == 0){
                System.out.println(item);
            }
        }

        // Affichage entiers indices pairs
        System.out.println("Affichage entiers indices pairs :");
        for (int i=0; i< array.length-1; i++){
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }

        // Affichage entiers impairs
        System.out.println("Affichage entiers impairs :");
        for (int item : array){
            if (item%2 != 0){
                System.out.println(item);
            }
        }
    }

}
