package sets;

import java.util.HashSet;
import java.util.Optional;

public class TestSetDouble {

    public static void main(String[] args) {

        HashSet<Double> doubles = new HashSet<Double>();
        doubles.add(1.5);
        doubles.add(8.25);
        doubles.add(-7.32);
        doubles.add(13.3);
        doubles.add(-12.45);
        doubles.add(48.5);
        doubles.add(0.01);

        System.out.println(doubles.toString());
        Optional<Double> max = doubles.stream().max(Double::compare);
        if (max.isPresent()){
            System.out.println("Max : " + max.get());
        } else {
            System.out.println("Aucun max trouvé");
        }
        Optional<Double> min = doubles.stream().min(Double::compare);
        if (min.isPresent()){
            System.out.println("Min : " + min.get());
            doubles.removeIf(v -> v.equals(min.get()));
        } else {
            System.out.println("Aucun min trouvé");
        }
        System.out.println(doubles.toString());

    }

}
