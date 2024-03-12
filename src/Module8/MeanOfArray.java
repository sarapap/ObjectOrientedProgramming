package Module8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeanOfArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        double mean = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Mean of numbers: " + mean);
    }
}
