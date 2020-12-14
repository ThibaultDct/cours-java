package essais;

import entites.Cercle;
import utils.CercleFactory;

public class TestCercle {

    public static void main(String[] args){

        Cercle cercle1 = CercleFactory.creerCercle(12);
        Cercle cercle2 = CercleFactory.creerCercle(21);

        System.out.println("=== CERCLE 1 ===");
        System.out.println("Périmètre : " + cercle1.perimetre());
        System.out.println("Surface : " + cercle1.surface());
        System.out.println("=== CERCLE 2 ===");
        System.out.println("Périmètre : " + cercle2.perimetre());
        System.out.println("Surface : " + cercle2.surface());

    }

}
