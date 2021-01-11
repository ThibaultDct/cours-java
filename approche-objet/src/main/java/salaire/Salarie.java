package salaire;

public class Salarie extends Intervenant {

    private double salaire;

    public Salarie(String nom, String prenom, double salaire){
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire(){
        return this.salaire;
    }

    public String getStatut(){
        return "Salarie";
    }

}
