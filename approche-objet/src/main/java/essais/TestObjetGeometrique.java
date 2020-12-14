package essais;

import entites.Cercle;
import entites.ObjetGeometrique;
import entites.Rectangle;

public class TestObjetGeometrique {

    public static void main(String[] args){

        ObjetGeometrique[] objets = {
                new Cercle(10),
                new Rectangle(11, 7)
        };

        for (ObjetGeometrique objet : objets){
            System.out.println("Périmètre : " + objet.perimetre() + " | Surface : " + objet.surface());
        }

    }

}
