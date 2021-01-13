package fr.epsi.jdbc.dao;

import fr.epsi.jdbc.entities.Fournisseur;

import java.util.List;
import java.util.Optional;

public interface FournisseurDao {

    List<Fournisseur> extraire();
    void insert(Fournisseur fournisseur);
    int update(String old_name, String new_name);
    boolean delete(Fournisseur fournisseur);
    Optional<Fournisseur> findById(int id);

}
