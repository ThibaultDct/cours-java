package essais;

import formes.Forme;

public class AffichageForme {

    public static String afficher(Forme forme){
        return "Périmètre : " + forme.calculerPerimetre() + " | Surface : " + forme.calculerSurface();
    }

}
