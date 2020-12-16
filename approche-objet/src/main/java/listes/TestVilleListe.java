package listes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestVilleListe {

    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<Ville>();
        villes.add(new Ville("Nice", 343_000));
        villes.add(new Ville("Carcassonne", 47_800));
        villes.add(new Ville("Narbonne", 53_400));
        villes.add(new Ville("Lyon", 484_000));
        villes.add(new Ville("Foix", 9_700));
        villes.add(new Ville("Pau", 77_200));
        villes.add(new Ville("Marseille", 850_700));
        villes.add(new Ville("Tarbes", 40_600));

        System.out.println(villes.toString());
        Optional<Ville> villePeuplee = villes
                .stream()
                .sorted((e1, e2) -> e1.getNb_hab() > e2.getNb_hab() ? -1 : 1)
                .findFirst();
        if (villePeuplee.isPresent()) {
            System.out.println("La plus peuplée : " + villePeuplee.get().toString());
        } else {
            System.out.println("Aucune ville plus peuplée trouvée.");
        }
        Optional<Ville> villeMoinsPeuplee = villes
                .stream()
                .sorted((e1, e2) -> e1.getNb_hab() < e2.getNb_hab() ? -1 : 1)
                .findFirst();
        if (villeMoinsPeuplee.isPresent()) {
            System.out.println("La moins peuplée : " + villeMoinsPeuplee.get().toString());
            villes.removeIf(v -> v.equals(villeMoinsPeuplee.get()));
        } else {
            System.out.println("Aucune ville moins peuplée trouvée.");
        }
        System.out.println(villes.toString());
        for (Ville item : villes){
            if (item.getNb_hab() > 100_000){
                item.setNom(item.getNom().toUpperCase());
            }
        }
        System.out.println(villes.toString());

    }

}
