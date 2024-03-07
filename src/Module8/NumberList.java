package Module8;

import java.util.ArrayList;
import java.util.List;
public class NumberList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        int sum = numbers.stream().filter(number -> number % 2 != 0)
                .peek(number -> System.out.println("Pariton luku: " + number))
                .mapToInt(number -> number * 2)
                .sum();
        System.out.println("\nSum: " + sum);
    }
}
