package fr.epsi.jdbc.dao;

import fr.epsi.jdbc.entities.Fournisseur;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class FournisseurDaoJdbc implements FournisseurDao {

    private static FournisseurDaoJdbc single;

    public static FournisseurDaoJdbc getSingle() {
        if ( null == single ) {
            single = new FournisseurDaoJdbc();
        }
        return single;
    }

    @Override
    public List<Fournisseur> extraire() {
        List<Fournisseur> result = new ArrayList<>();

        try {
            PreparedStatement statement = DBConnection.getSingle().getConnection().prepareStatement("SELECT * FROM fournisseur");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Fournisseur fournisseur = new Fournisseur(resultSet.getInt("id"), resultSet.getString("nom"));
                result.add(fournisseur);
            }
        } catch (SQLException e) {
            result = null;
            System.out.println("Une erreur est survenue : " + e.getStackTrace());
        }

        return result;
    }

    @Override
    public void insert(Fournisseur fournisseur) {
        try {
            Statement st = DBConnection.getSingle().getConnection().createStatement();
            st.executeUpdate("INSERT INTO fournisseur VALUES (" + fournisseur.getId() + ", '" + fournisseur.getNom() + "')");
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de l'insertion en base de "+ fournisseur.toString() +" : " + e.getMessage());
        }
    }

    @Override
    public int update(String old_name, String new_name) {
        int result = 0;

        try {
            Statement st = DBConnection.getSingle().getConnection().createStatement();
            st.executeUpdate("UPDATE fournisseur SET NOM = '"+new_name+"' WHERE NOM = '"+old_name+"'");
            result = 1;
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de la mise a jour en base : " + e.getStackTrace());
        }

        return result;
    }

    @Override
    public boolean delete(Fournisseur fournisseur) {
        boolean result = false;

        try {
            Statement st = DBConnection.getSingle().getConnection().createStatement();
            st.executeUpdate("DELETE FROM fournisseur WHERE NOM = '"+fournisseur.getNom()+"' AND ID = "+fournisseur.getId());
            result = true;
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de la suppression : " + e.getStackTrace());
        }

        return result;
    }
}
