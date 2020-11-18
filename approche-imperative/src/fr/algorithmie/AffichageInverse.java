package fr.algorithmie;

public class AffichageInverse {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Afficher tous les éléments du tableau
        System.out.println("Affichage de tous les entiers :");
        for (int item : array){
            System.out.println(item);
        }

        // Afficher tous les éléments du tableau dans le sens inverse
        System.out.println("Affichage de tous les entiers dans le sens inverse :");
        for (int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }

        // Créer une copie
        System.out.println("Copie du tableau :");
        int[] arrayCopy = array.clone();
        for (int item : arrayCopy){
            System.out.println(item);
        }
    }

}
