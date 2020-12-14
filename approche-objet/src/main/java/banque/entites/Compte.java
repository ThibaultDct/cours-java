package banque.entites;

public class Compte {

    public String numero;
    public Integer solde;

    public Compte(String numero, Integer solde){
        this.numero = numero;
        this.solde = solde;
    }

    @Override
    public String toString(){
        return "Compte : " + this.numero + " | Solde : " + this.solde;
    }

}
