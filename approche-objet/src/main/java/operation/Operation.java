package operation;

public abstract class Operation {

    String date;
    Integer montant;

    public Operation(){}

    public Operation(String date, Integer montant){
        this.date = date;
        this.montant = montant;
    }

    public String afficherType(){
        String type = "";
        if (this instanceof Debit){
            type = "Debit";
        } else if (this instanceof Credit){
            type = "Credit";
        }
        return type;
    }

}
