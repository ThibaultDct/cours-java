package fr.algorithmie;

public class SommeDeTableauxDiff {

    public static void main(String[] args) {
        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18 };
        int[] resultat = tab1.clone();

        for (int i=0; i<tab1.length-1; i++){
            int add = i<tab2.length ? tab2[i] : 0;
            resultat[i] = tab1[i] + add;
        }

        // Affichage du résultat
        for (int item : resultat){
            System.out.println(item);
        }
    }

}
