package fr.epsi.jdbc;

import fr.epsi.jdbc.dao.FournisseurDaoJdbc;
import fr.epsi.jdbc.entities.Fournisseur;

import java.util.List;

public class TestSelect {

    public static void main(String[] args) {

        List<Fournisseur> results = FournisseurDaoJdbc.getSingle().extraire();
        for (Fournisseur f : results){
            System.out.println(f.toString());
        }

    }

}
