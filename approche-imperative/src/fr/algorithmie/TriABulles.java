package fr.algorithmie;

public class TriABulles {

    public static void main(String[] args) {
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        tri_bulle(array2);
        // Affichage résultat
        for (int item : array2){
            System.out.println(item);
        }
    }

    // Tri à baulles
    static void tri_bulle(int[] tab)
    {
        int taille = tab.length;
        int tmp = 0;
        for(int i=0; i < taille; i++)
        {
            for(int j=1; j < (taille-i); j++)
            {
                if(tab[j-1] > tab[j])
                {
                    tmp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tmp;
                }

            }
        }
    }
}
