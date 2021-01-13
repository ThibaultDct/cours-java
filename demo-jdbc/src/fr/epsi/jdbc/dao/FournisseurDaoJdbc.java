package fr.epsi.jdbc.dao;

import fr.epsi.jdbc.entities.Fournisseur;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Optional;

public class FournisseurDaoJdbc implements FournisseurDao {

    private static final String SELECT_QUERY = "SELECT * FROM fournisseur";
    private static final String INSERT_QUERY = "INSERT INTO fournisseur VALUES (?, ?)";
    private static final String UPDATE_QUERY = "UPDATE fournisseur SET NOM = ? WHERE NOM = ?";
    private static final String DELETE_QUERY = "DELETE FROM fournisseur WHERE NOM = ? AND ID = ?";
    private static final String FIND_BY_ID_QUERY = "SELECT * FROM fournisseur WHERE ID = ?";

    private static FournisseurDaoJdbc single;

    private FournisseurDaoJdbc(){}

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
            PreparedStatement statement = DBConnection.getSingle().getConnection().prepareStatement(SELECT_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Fournisseur fournisseur = new Fournisseur(resultSet.getInt("id"), resultSet.getString("nom"));
                result.add(fournisseur);
            }
        } catch (SQLException e) {
            result = null;
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }

        return result;
    }

    @Override
    public void insert(Fournisseur fournisseur) {
        try (PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(INSERT_QUERY);) {
            st.setInt(1, fournisseur.getId());
            st.setString(2, fournisseur.getNom());
            st.executeQuery();
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de l'insertion en base de "+ fournisseur.toString() +" : " + e.getMessage());
        }
    }

    @Override
    public int update(String old_name, String new_name) {
        int result = 0;

        try {
            PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(UPDATE_QUERY);
            st.setString(1, new_name);
            st.setString(2, old_name);
            st.executeQuery();
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
            PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(DELETE_QUERY);
            st.setString(1, fournisseur.getNom());
            st.setInt(2, fournisseur.getId());
            st.executeQuery();
            result = true;
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de la suppression : " + e.getStackTrace());
        }

        return result;
    }

    @Override
    public Optional<Fournisseur> findById(int id){
        Optional<Fournisseur> result = Optional.empty();

        try {
            PreparedStatement statement = DBConnection.getSingle().getConnection().prepareStatement(SELECT_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Fournisseur fournisseur = new Fournisseur(resultSet.getInt("id"), resultSet.getString("nom"));
                result = Optional.of(fournisseur);
            }
        } catch (SQLException e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }

        return result;
    }
}
