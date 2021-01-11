package salaire;

public abstract class Intervenant {

    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double getSalaire();
    public abstract String getStatut();

    public void afficherDonnees(){
        System.out.println("=== " + this.nom.toUpperCase() + " " + this.prenom + " ===");
        System.out.println("Salaire : " + this.getSalaire());
        System.out.println("Statut : " + this.getStatut());
    }

}
