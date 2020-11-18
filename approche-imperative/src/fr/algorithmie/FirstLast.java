package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 6} ;
        boolean valorisation = ((array2.length >= 1) && (array2[0] == array2[array2.length-1])) ? true : false;
    }

}
