package Module1;

import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int [] integers = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i+1 );
            integers[i] = scanner.nextInt();

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        int currentStart = 0;

        int j;
        for (j = 0; j < size; j++) {
            currentSum += integers[j];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = currentStart;
                end = j;
            }

            if (currentSum < 0) {
                currentSum = 0;
                currentStart = j + 1;
            }
        }


        System.out.println("Maximum sum: " + maxSum);
        System.out.println("Integers: ");
        for (int k = start; k <= end; k++) {
            System.out.print(integers[k]);
}
} }}
