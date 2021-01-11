package sets;

public class Pays {

    private String nom;
    private int nb_hab;
    private double pib;

    public Pays(String nom, int nb_hab, double pib) {
        this.nom = nom;
        this.nb_hab = nb_hab;
        this.pib = pib;
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

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nb_hab=" + nb_hab +
                ", pib=" + pib +
                '}';
    }
}
