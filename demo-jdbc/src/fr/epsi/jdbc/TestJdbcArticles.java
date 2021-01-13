package fr.epsi.jdbc;

import fr.epsi.jdbc.dao.ArticleDaoJdbc;
import fr.epsi.jdbc.dao.FournisseurDaoJdbc;
import fr.epsi.jdbc.entities.Article;
import fr.epsi.jdbc.entities.Fournisseur;

import java.util.List;

public class TestJdbcArticles {

    public static void main(String[] args) {

        ArticleDaoJdbc dao_art = ArticleDaoJdbc.getInstance();
        FournisseurDaoJdbc dao_fou = FournisseurDaoJdbc.getSingle();
        Fournisseur fournisseur = new Fournisseur(30, "La Maison de la Peinture");

        dao_fou.insert(fournisseur);

        dao_art.insert(new Article(11, "blanc_1L", "Peinture blanche 1L", (float) 12.5, fournisseur));
        dao_art.insert(new Article(12, "rouge_mat_1L", "Peinture rouge mat 1L", (float) 15.5, fournisseur));
        dao_art.insert(new Article(13, "noir_laque_1L", "Peinture noire laquée 1L", (float) 17.8, fournisseur));
        dao_art.insert(new Article(14, "bleu_mat_1L", "Peinture bleue mat 1L", (float) 15.5, fournisseur));

        List<Article> articles_to_update = dao_art.extraire();
        articles_to_update.forEach(article -> {
            dao_art.update(article, article.getRef(), article.getDesignation(), (float) (article.getPrix() - (article.getPrix()*0.25)), article.getFournisseur());
        });

        System.out.println("Moyenne des prix : " + dao_art.moyenne());

        List<Article> articles_to_delete = dao_art.extraire();
        articles_to_delete.forEach(article -> {
            if (article.getDesignation().contains("Peinture")){
                dao_art.delete(article);
            }
        });

        dao_fou.delete(fournisseur);
    }

}
