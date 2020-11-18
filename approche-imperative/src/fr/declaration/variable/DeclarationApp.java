package fr.declaration.variable;

import java.util.Scanner;

public class DeclarationApp {

    public static void main(String[] args){
        byte byteVar = 2;
        short shortVar = 3;
        int intVar = 4;
        long longVar = 5;
        float floatVar = 6.1F;
        double doubleVar = 7326L;
        boolean booleanVar = true;
        String randomString = "test\ntest apres retour a la ligne";

        System.out.println("Valeur byte : " + byteVar);
        System.out.println("Valeur short : " + shortVar);
        System.out.println("Valeur int : " + intVar);
        System.out.println("Valeur long : " + longVar);
        System.out.println("Valeur float : " + floatVar);
        System.out.println("Valeur double : " + doubleVar);
        System.out.println("Valeur boolean : " + booleanVar);
        System.out.println("Valeur string : " + randomString);

        Scanner scan = new Scanner( System.in );
        String test = scan.nextLine();
        scan.close();
        System.out.println(test);

    }

}