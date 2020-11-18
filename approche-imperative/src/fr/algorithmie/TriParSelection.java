package fr.algorithmie;

public class TriParSelection {

    public static void main(String[] args) {
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8} ;
        tri_selection(array2);
        // Affichage résultat
        for (int item : array2){
            System.out.println(item);
        }
    }

    // Tri par sélection
    public static void tri_selection(int[] tab)
    {
        for (int i = 0; i < tab.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < tab.length; j++)
            {
                if (tab[j] < tab[index]){
                    index = j;
                }
            }

            int min = tab[index];
            tab[index] = tab[i];
            tab[i] = min;
        }
    }

}
