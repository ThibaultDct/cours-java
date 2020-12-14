package essais;

import operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        CalculMoyenne moy1 = new CalculMoyenne();
        CalculMoyenne moy2 = new CalculMoyenne();

        moy1.ajouter(12);
        moy1.ajouter(8);
        moy1.ajouter(16);
        moy1.ajouter(4);

        System.out.println("Moyenne 1 : " + moy1.calcul());
        System.out.println("Moyenne 2 : " + moy2.calcul());

    }

}
