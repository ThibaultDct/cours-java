package banque.entites;

public class CompteTaux extends Compte {

    public double taux;

    public CompteTaux(String numero, Integer solde, double taux){
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public String toString(){
        return super.toString() + " (Taux : " + this.taux + ")";
    }

}
