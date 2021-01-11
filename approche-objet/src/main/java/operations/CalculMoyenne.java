package operations;

import java.util.ArrayList;
import java.util.List;

public class CalculMoyenne {

    private List<Double> values = new ArrayList<>();
    public CalculMoyenne(){}

    public void ajouter(double value){
        this.values.add(value);
    }

    public double calcul(){
        double result = 0;
        for (double value : this.values){
            result += value;
        }
        if (this.values.size() == 0){
            throw new ArithmeticException("Division par 0");
        } else {
            return result / this.values.size();
        }
    }

}
