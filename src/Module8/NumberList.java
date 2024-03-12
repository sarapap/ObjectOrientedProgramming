package Module8;

import java.util.Arrays;
import java.util.List;
public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        int sum = numbers.stream().filter(number -> number % 2 != 0)
                .peek(number -> System.out.println("Pariton luku: " + number))
                .mapToInt(number -> number * 2)
                .sum();
        System.out.println("\nSum: " + sum);
    }
}
