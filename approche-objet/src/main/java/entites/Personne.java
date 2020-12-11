package entites;

public class Personne {

    String nom;
    String prenom;
    AdressePostale adresse;

    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse){
        this(nom, prenom);
        this.adresse = adresse;
    }

    public void afficher(){
        System.out.println("Nom : " + this.nom.toUpperCase());
        System.out.println("Prénom : " + this.prenom);
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse){
        this.adresse = adresse;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public AdressePostale getAdresse(){
        return this.adresse;
    }

}
