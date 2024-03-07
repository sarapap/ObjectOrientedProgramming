package Module8;

import java.util.ArrayList;
import java.util.List;

public class MeanOfArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        double mean = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Mean of numbers: " + mean);
    }
}
