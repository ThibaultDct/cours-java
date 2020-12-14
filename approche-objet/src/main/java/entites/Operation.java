package entites;

public abstract class Operation {

    public String date;
    public Integer montant;

    public Operation(){}

    public Operation(String date, Integer montant){
        this.date = date;
        this.montant = montant;
    }

    public abstract String afficherType();

}
