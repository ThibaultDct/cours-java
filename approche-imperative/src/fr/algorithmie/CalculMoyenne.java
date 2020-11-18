package fr.algorithmie;

import java.util.Arrays;
import java.util.OptionalDouble;

public class CalculMoyenne {

    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Moyenne du tableay
        OptionalDouble moyenne = Arrays.stream(array).average();
        System.out.println("Moyenne du tableau : " + moyenne.getAsDouble());
    }
}
