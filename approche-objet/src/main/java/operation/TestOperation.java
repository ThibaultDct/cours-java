package operation;

public class TestOperation {

    public static void main(String[] args){

        Operation[] operations = {
                new Debit("11/12/2020", 200),
                new Credit("12/12/2020", 120),
                new Credit("13/12/2020", 90),
                new Debit("14/12/2020", 110)
        };

        Integer total = 0;
        for (Operation op : operations){
            System.out.println(op.date + " : " + op.montant + " (" + op.afficherType() + ")");
            if (op instanceof Debit){
                total -= op.montant;
            } else if (op instanceof Credit){
                total += op.montant;
            }
        }
        System.out.println("Total : " + total);

    }

}
