package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        List<String> liste3 = new ArrayList<String>();
        for (String item : liste1){
            if (!(liste3.contains(item))){
                liste3.add(item);
            }
        }
        for (String item : liste2){
            if (!(liste3.contains(item))){
                liste3.add(item);
            }
        }

        // DEBUG
        for (String item : liste3){
            System.out.println(item);
        }

    }

}
