package fr.epsi.jdbc.dao;

import fr.epsi.jdbc.entities.Article;
import fr.epsi.jdbc.entities.Fournisseur;

import java.util.List;

public interface ArticleDao {

    List<Article> extraire();
    void insert(Article article);
    public int update(Article article, String new_ref, String new_designation, float new_prix, Fournisseur new_fournisseur);
    boolean delete(Article article);
    double moyenne();

}
