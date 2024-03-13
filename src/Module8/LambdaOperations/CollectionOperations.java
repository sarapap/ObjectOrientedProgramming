package Module8.LambdaOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 5, 8, 20, 15, 3, 12));
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);

        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("Without even numbers: " + numbers);

        numbers.replaceAll(number -> number % 2 != 0 ? number * 2 : number);
        System.out.println("Odd numbers doubled: " + numbers);
    }

}
