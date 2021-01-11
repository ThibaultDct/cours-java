package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class TestListeInt {

    public static void main(String[] args) {

        List<Integer> entiers = new ArrayList<Integer>();
        entiers.add(-1);
        entiers.add(5);
        entiers.add(7);
        entiers.add(3);
        entiers.add(-2);
        entiers.add(4);
        entiers.add(8);
        entiers.add(5);

        System.out.println(entiers.toString());
        int taille = entiers.size();
        System.out.println("Taille : " + entiers.size());
        int max = entiers
                .stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);
        System.out.println("Max : " + max);
        int min = entiers
                .stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);
        System.out.println("Min : " + min);
        entiers.remove(entiers.indexOf(min));
        System.out.println(entiers.toString());
        for (Integer item : entiers){
            if (Integer.signum(item) == -1){
                entiers.set(entiers.indexOf(item), Math.abs(item));
            }
        }
        System.out.println(entiers.toString());
    }

}
