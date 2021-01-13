package fr.epsi.jdbc;

import fr.epsi.jdbc.dao.FournisseurDaoJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {

    public static void main(String[] args) {

        FournisseurDaoJdbc.getSingle().update("Apple", "Microsoft");

    }

}
