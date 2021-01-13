package fr.epsi.jdbc;

import fr.epsi.jdbc.dao.FournisseurDaoJdbc;
import fr.epsi.jdbc.entities.Fournisseur;

public class TestDelete {

    public static void main(String[] args) {

        Fournisseur fournisseur = new Fournisseur(7, "Microsoft");
        FournisseurDaoJdbc.getSingle().delete(fournisseur);

    }

}
