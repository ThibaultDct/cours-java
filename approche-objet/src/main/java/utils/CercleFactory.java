package utils;

import entites.Cercle;

public class CercleFactory {

    public static Cercle creerCercle(double rayon){
        return new Cercle(rayon);
    }

}
