package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Rotation {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};

        List<Integer> res = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        Collections.rotate(res, 1);

        // Affichage résultat
        for (Integer item : res){
            System.out.println(item);
        }

    }

}
