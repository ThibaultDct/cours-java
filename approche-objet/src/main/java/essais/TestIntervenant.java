package essais;

import salaire.Pigiste;
import salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {

        Salarie salarie = new Salarie("DOUCET", "Thibault", 1100);
        Pigiste pigiste = new Pigiste("TOTO", "Titi", 95);

        System.out.println("Salaire mensuel salarié : " + salarie.getSalaire());
        System.out.println("Salaire journalier pigiste : " + pigiste.getSalaire());
        salarie.afficherDonnees();
        pigiste.afficherDonnees();

    }

}
