package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestListeString {

    public static void main(String[] args) {

        List<String> chaines = new ArrayList<String>();
        chaines.add("Nice");
        chaines.add("Carcassonne");
        chaines.add("Narbonne");
        chaines.add("Lyon");
        chaines.add("Foix");
        chaines.add("Pau");
        chaines.add("Marseille");
        chaines.add("Tarbes");

        System.out.println(chaines.toString());
        Optional<String> plusLong = chaines
                .stream()
                .sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst();
        if (plusLong.isPresent()) {
            System.out.println("Chaine la plus longue : " + plusLong.get());
        } else {
            System.out.println("Aucun mot le plus long trouvé.");
        }
        for (String item : chaines){
            chaines.set(chaines.indexOf(item), item.toUpperCase());
        }
        System.out.println(chaines.toString());
        chaines.removeIf(item -> item.charAt(0) == 'N');
        System.out.println(chaines.toString());

    }

}
