package fr.algorithmie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComparaisonTableau {

    public static void main(String[] args) {
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        int[] comp = array1.clone();

        List<Integer> listComp = Arrays.stream(comp)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> listArray2 = Arrays.stream(array2)
                .boxed()
                .collect(Collectors.toList());

        listComp.retainAll(listArray2);
        System.out.println("Nombre d'éléments en commun : " + listComp.size());
    }

}
