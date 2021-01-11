package essais;

import operations.Operations;

public class TestOperations {

    public static void main(String[] args){

        double[] ops = {
                Operations.calcul(12, 3, '+'),
                Operations.calcul(12, 3, '-'),
                Operations.calcul(12, 3, '/'),
                Operations.calcul(12, 3, '*')
        };

        for (double res : ops){
            System.out.println(res);
        }

    }

}
