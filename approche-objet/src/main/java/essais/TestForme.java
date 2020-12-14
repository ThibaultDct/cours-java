package essais;

import formes.Carre;
import formes.Cercle;
import formes.Rectangle;

public class TestForme {

    public static void main(String[] args) {

        Cercle cercle = new Cercle(12);
        Rectangle rectangle = new Rectangle(12, 10);
        Carre carre = new Carre(10);

        System.out.println(AffichageForme.afficher(cercle));
        System.out.println(AffichageForme.afficher(rectangle));
        System.out.println(AffichageForme.afficher(carre));

    }

}
