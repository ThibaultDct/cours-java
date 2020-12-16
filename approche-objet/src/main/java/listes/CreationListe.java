package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

    public static void main(String[] args) {

        List<Integer> entiers = new ArrayList<>();
        for (int i=1; i<=100; i++){
            entiers.add(i);
        }

        System.out.println(entiers.size());

    }

}
