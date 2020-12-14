package banque;

import banque.entites.Compte;

public class TestBanque {

    public static void main(String[] args){
        Compte instance = new Compte("0315", 256);
        System.out.println(instance.numero + " : " + instance.solde);
    }

}
