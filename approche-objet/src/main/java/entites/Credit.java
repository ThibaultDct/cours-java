package entites;

public class Credit extends Operation {

    public Credit(String date, Integer montant){
        super(date, montant);
    }

    public String afficherType(){
        return "Credit";
    }

}
