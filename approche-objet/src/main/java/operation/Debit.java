package operation;

public class Debit extends Operation {

    public Debit(String date, Integer montant){
        super(date, montant);
    }

    public String afficherType(){
        return "Debit";
    }

}
