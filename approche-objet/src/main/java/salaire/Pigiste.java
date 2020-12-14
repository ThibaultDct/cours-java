package salaire;

public class Pigiste extends Intervenant {

    public double salaire;

    public Pigiste(String nom, String prenom, double salaire){
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire(){
        return this.salaire;
    }

    public String getStatut(){
        return "Pigiste";
    }

}
