package listes;

public class Ville {

    private String nom;
    private int nb_hab;

    public Ville(String nom, int nb_hab) {
        this.nom = nom;
        this.nb_hab = nb_hab;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNb_hab() {
        return nb_hab;
    }

    public void setNb_hab(int nb_hab) {
        this.nb_hab = nb_hab;
    }

    @Override
    public String toString(){
        return this.nom + " (" + this.nb_hab + " hab)";
    }

}
