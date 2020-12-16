package sets;

import java.util.HashSet;
import java.util.Optional;

public class TestSetString {

    public static void main(String[] args) {

        HashSet<String> chaines = new HashSet<String>();
        chaines.add("USA");
        chaines.add("France");
        chaines.add("Allemagne");
        chaines.add("UK");
        chaines.add("Italie");
        chaines.add("Japon");
        chaines.add("Chine");
        chaines.add("Russie");
        chaines.add("Inde");

        System.out.println(chaines.toString());
        Optional<String> plusLong = chaines
                .stream()
                .sorted((e1, e2) -> e1.length() > e2.length() ? -1 : 1)
                .findFirst();
        if (plusLong.isPresent()) {
            System.out.println("Chaine la plus longue : " + plusLong.get());
            chaines.removeIf(v -> v == plusLong.get());
        } else {
            System.out.println("Aucun mot le plus long trouvé.");
        }
        System.out.println(chaines.toString());

    }

}
