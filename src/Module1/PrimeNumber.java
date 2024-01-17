package Module1;

import java.util.Scanner;

public class PrimeNumber {

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter two positive integers (start and end, where start < end): ");
            System.out.println("Enter the first positive integer (start): ");
            int first = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the second positive integer (end): ");
            int second = Integer.parseInt(scanner.nextLine());

            if (second < first) {
                System.out.println("The first number should be smaller than the second number. Try again.");
            }

            for (int i = first; i <= second; i++) {
                if (isPrime(i)) {
                    System.out.println("Prime number between start and end numbers: " + i);
            }

        }

    }
}