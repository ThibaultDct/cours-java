package sets;

import listes.Ville;

import java.util.HashSet;
import java.util.Optional;

public class TestSetPays {

    public static void main(String[] args) {

        HashSet<Pays> pays = new HashSet<Pays>();
        pays.add(new Pays("USA", 382_200_000, 20.54));
        pays.add(new Pays("France", 66_990_000, 2.78));
        pays.add(new Pays("Allemagne", 83_020_000, 3.95));
        pays.add(new Pays("UK", 66_650_000, 2.85));
        pays.add(new Pays("Italie", 60_360_000, 2.08));
        pays.add(new Pays("Japon", 126_500_000, 4.97));
        pays.add(new Pays("Chine", 1_393_000_000, 13.61));
        pays.add(new Pays("Russie", 144_500_000, 1.66));
        pays.add(new Pays("Inde", 1_353_000_000, 2.72));

        System.out.println(pays.toString());

        // Meilleur PIB/hab
        Optional<Pays> paysMaxPibHab = pays
                .stream()
                .sorted((e1, e2) -> e1.getPib()/e1.getNb_hab() > e2.getPib()/e2.getNb_hab() ? -1 : 1)
                .findFirst();
        if (paysMaxPibHab.isPresent()) {
            System.out.println("Meilleur PIB/hab : " + paysMaxPibHab.get().toString() + " (" + paysMaxPibHab.get().getPib()/paysMaxPibHab.get().getNb_hab() + " PIB/hab)");
        } else {
            System.out.println("Aucun pays meilleur PIB trouvé.");
        }

        // Meilleur PIB total
        Optional<Pays> paysMaxPib = pays
                .stream()
                .sorted((e1, e2) -> e1.getPib() > e2.getPib() ? -1 : 1)
                .findFirst();
        if (paysMaxPib.isPresent()) {
            System.out.println("Meilleur PIB : " + paysMaxPib.get().toString());
        } else {
            System.out.println("Aucun pays meilleur PIB trouvé.");
        }

        // Majuscules sur PIB min
        Optional<Pays> paysMinPib = pays
                .stream()
                .sorted((e1, e2) -> e1.getPib() < e2.getPib() ? -1 : 1)
                .findFirst();
        if (paysMaxPib.isPresent()) {
            System.out.println("Moins bon PIB : " + paysMinPib.get().toString());
            paysMinPib.get().setNom(paysMinPib.get().getNom().toUpperCase());
        } else {
            System.out.println("Aucun pays meilleur PIB trouvé.");
        }
        System.out.println(pays.toString());

        // Suppression pays PIB min
        pays.removeIf(p -> p.equals(paysMinPib.get()));
        System.out.println(pays.toString());

    }

}
