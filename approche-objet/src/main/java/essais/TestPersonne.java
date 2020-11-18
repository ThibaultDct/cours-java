package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

    public static void main(String[] args) {
        Personne personne1 = new Personne("DOUCET", "Thibault", new AdressePostale(52, "rue du Coudray", "44000", "Nantes"));
        Personne personne2 = new Personne("DOUCET", "Nathan", new AdressePostale(33, "rue Principale", "72190", "Neuville sur Sarthe"));
    }

}
