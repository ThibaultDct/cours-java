package chaines;

import banque.entites.Compte;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Durand;Marcel;012345;1 523.5";

        System.out.println("Premier caractère : " + chaine.charAt(0));
        System.out.println("Longueur de la chaine : " + chaine.length());
        System.out.println("Indice 1er ';' : " + chaine.indexOf(';'));
        String lastname = chaine.substring(0, chaine.indexOf(';'));
        System.out.println("Nom de famille : " + lastname + " (" + lastname.toUpperCase() + " | " + lastname.toLowerCase() + ")");
        String[] words = chaine.split(";");
        for (String word : words){
            System.out.println(word);
        }
        Compte compte = new Compte(words[2], Double.parseDouble(words[3].replace(" ", "")));
        System.out.println(compte.toString());

    }

}
