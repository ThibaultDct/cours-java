package fr.boucles;

public class ExerciceTableauEntier {

    public static void main(String[] args) {
        int[] entiers = {1,2,3,4,5,6,7,8,9,10};

        // Afficher 1er élément
        System.out.println("Premier entier du tableau : " + entiers[0]);

        // Afficher la taille du tableau
        System.out.println("Taille du tableau : " + entiers.length);

        // Afficher dernier entier du tableau
        System.out.println("Dernier entier du tableau : " + entiers[entiers.length-1]);

        // Modifier la valeur de l'élément d'indice 4
        System.out.println("Ancien entier indice 4 : " + entiers[4]);
        entiers[4] = 8;
        System.out.println("Nouveau entier indice 4 : " + entiers[4]);
    }

}
