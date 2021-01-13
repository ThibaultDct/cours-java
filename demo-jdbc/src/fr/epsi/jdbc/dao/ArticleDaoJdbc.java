package fr.epsi.jdbc.dao;

import fr.epsi.jdbc.entities.Article;
import fr.epsi.jdbc.entities.Fournisseur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ArticleDaoJdbc implements ArticleDao {

    private static final String SELECT_QUERY = "SELECT * FROM article";
    private static final String INSERT_QUERY = "INSERT INTO article VALUES (?, ?, ?, ?, ?)";
    private static final String UPDATE_QUERY = "UPDATE article SET REF = ?, DESIGNATION = ?, PRIX = ?, ID_FOU = ? WHERE ID = ?";
    private static final String DELETE_QUERY = "DELETE FROM article WHERE ID = ?";
    private static final String AVG_QUERY = "SELECT AVG(prix) FROM article";

    private static ArticleDaoJdbc instance;

    private ArticleDaoJdbc(){}

    public static ArticleDaoJdbc getInstance() {
        if ( null == instance ) {
            instance = new ArticleDaoJdbc();
        }
        return instance;
    }

    @Override
    public List<Article> extraire() {
        List<Article> result = new ArrayList<>();
        Fournisseur fournisseur;

        try (PreparedStatement statement = DBConnection.getSingle().getConnection().prepareStatement(SELECT_QUERY);) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Optional<Fournisseur> fou = FournisseurDaoJdbc.getSingle().findById(resultSet.getInt("id"));
                fournisseur = fou.orElse(null);
                Article article = new Article(resultSet.getInt("id"), resultSet.getString("ref"), resultSet.getString("designation"), resultSet.getFloat("prix"), fournisseur);
                result.add(article);
                System.out.println(article.toString());
            }
        } catch (SQLException e) {
            result = null;
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }

        return result;
    }

    @Override
    public void insert(Article article) {
        try (PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(INSERT_QUERY);) {
            st.setInt(1, article.getId());
            st.setString(2, article.getRef());
            st.setString(3, article.getDesignation());
            st.setFloat(4, article.getPrix());
            st.setInt(5, article.getFournisseur().getId());
            st.executeQuery();
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de l'insertion en base de "+ article.toString() +" : " + e.getMessage());
        }
    }

    @Override
    public int update(Article article, String new_ref, String new_designation, float new_prix, Fournisseur new_fournisseur) {
        int result = 0;

        try (PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(UPDATE_QUERY);) {
            st.setString(1, new_ref);
            st.setString(2, new_designation);
            st.setFloat(3, new_prix);
            st.setInt(4, new_fournisseur.getId());
            st.setInt(5, article.getId());
            st.executeQuery();
            result = 1;
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de la mise a jour en base : " + e.getStackTrace());
        }

        return result;
    }

    @Override
    public boolean delete(Article article) {
        boolean result = false;

        try (PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(DELETE_QUERY);) {
            st.setInt(1, article.getId());
            st.executeQuery();
            result = true;
        } catch (SQLException e){
            System.out.println("Une erreur est survenue lors de la suppression : " + e.getStackTrace());
        }

        return result;
    }

    @Override
    public double moyenne(){
        double result = 0.;

        try (PreparedStatement st = DBConnection.getSingle().getConnection().prepareStatement(AVG_QUERY);) {
            ResultSet query_result = st.executeQuery();
            if (query_result.next()){
                result = query_result.getDouble("AVG(prix)");
            }
        } catch (SQLException e) {
            System.out.println("Une erreur est survenue lors du calcul de la moyenne : " + e.getMessage());
        }

        return result;
    }
}
