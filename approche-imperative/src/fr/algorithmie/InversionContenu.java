package fr.algorithmie;

import java.util.Arrays;

public class InversionContenu {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Copie sens inverse du tableau
        System.out.println("Copie sens inverse :");
        int[] arrayReverse = array.clone();
        for (int i=0; i<array.length; i++){
            arrayReverse[array.length-1-i] = array[i];
        }
        for (int i=0; i<arrayReverse.length; i++){
            System.out.println(arrayReverse[i] + " : " + array[i]);
        }
    }

}
