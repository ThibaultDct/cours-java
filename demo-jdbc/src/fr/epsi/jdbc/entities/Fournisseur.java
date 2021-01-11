package fr.epsi.jdbc.entities;

public class Fournisseur {

    private int id;
    private String nom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "ID : " + this.getId() + " | Nom : " + this.getNom();
    }
}
