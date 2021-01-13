package fr.epsi.jdbc;

import fr.epsi.jdbc.dao.FournisseurDaoJdbc;
import fr.epsi.jdbc.entities.Fournisseur;

public class TestInsertion {

    public static void main(String[] args) {

        Fournisseur fournisseur = new Fournisseur(20, "Apple");
        Fournisseur fournisseur2 = new Fournisseur(21, "L'Espace Création");
        FournisseurDaoJdbc.getSingle().insert(fournisseur);
        FournisseurDaoJdbc.getSingle().insert(fournisseur2);

    }

}
