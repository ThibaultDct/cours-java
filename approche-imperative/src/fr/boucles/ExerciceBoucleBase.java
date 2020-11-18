package fr.boucles;

public class ExerciceBoucleBase {

    public static void main(String[] args) {

        // Afficher nombres de 1 à 10
        System.out.println("Nombres de 1 à 10 :");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        // Afficher 20 fois nom et prénom
        String nom = "DOUCET";
        String prenom = "Thibault";
        System.out.println("Affichage nom et prénom 20 fois :");
        for (int i=1; i<=20; i++){
            System.out.println(nom + " " + prenom + " (" + i + ")");
        }

        // Afficher nombres pairs de 2 à 100
        System.out.println("Nombres pairs de 2 à 100 :");
        for (int i=2; i<=100; i+=2){
            System.out.println(i);
        }

        // Afficher nombres impairs de 1 à 99
        System.out.println("Nombres impairs de 1 à 99 :");
        for (int i=1; i<=99; i+=2){
            System.out.println(i);
        }
    }

}
