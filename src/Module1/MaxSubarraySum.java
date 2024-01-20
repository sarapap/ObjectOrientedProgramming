package Module1;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int [] integers = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            integers[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        int current_start = 0;

        int i;
        for (i=0; i<size; i++) {
            sum += integers[i];

            if (sum > max) {
                max = sum;
                start = current_start;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                current_start = i + 1;
            }
        }

        System.out.println("\nMaximum sum: " + max);
        System.out.println("Integers: " + (start + 1) + "-" + (end + 1));
}
}
