package Module8.LambdaOperations;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(20);
        numbers.add(15);
        numbers.add(3);
        numbers.add(12);

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        } System.out.println("Sum of numbers: " + sum);

        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("Without even numbers: " + numbers);

        numbers.replaceAll(number -> number % 2 != 0 ? number * 2 : number);
        System.out.println("Odd numbers doubled: " + numbers);
    }
}
