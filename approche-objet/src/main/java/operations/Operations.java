package operations;

import java.security.InvalidParameterException;

public class Operations {

    public static double calcul(double a, double b, char op){
        double result;
        if (op == '+'){
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '/') {
            if (b != 0){
                result = a / b;
            } else {
                throw new ArithmeticException("Division par 0");
            }
        } else if (op == '*'){
            result = a * b;
        } else {
            throw new InvalidParameterException("L'opérateur doit être + - / ou *");
        }
        return result;
    }

}
