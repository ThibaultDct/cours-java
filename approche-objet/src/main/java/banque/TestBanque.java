package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args){
        Compte[] comptes = {
                new Compte("03125", 126),
                new CompteTaux("03126", 512, 1.14),
        };

        for (Compte compte : comptes){
            System.out.println(compte);
        }
    }

}
