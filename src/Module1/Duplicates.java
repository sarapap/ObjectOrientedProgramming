package Module1;

import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] integers = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i + 1);
            integers[i] = scanner.nextInt();
        }

        int [] new_integers = withoutDuplicates(integers);

        System.out.println("Array without duplicates: ");
        for (int array : new_integers) {
            System.out.print(array + " ");
        }
        }

    private static int[] withoutDuplicates(int[] integers) {
        int[] new_integers = new int[integers.length];
        int newSize = 0;

        int i;
        for (i = 0; i < integers.length; i++) {
            boolean isDuplicate = false;

        int j;
        for (j = 0; j < newSize; j++) {
            if (integers[i] == new_integers[j]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            new_integers[newSize] = integers[i];
            newSize++;
        }
    }
        int[] array = new int[newSize];
        System.arraycopy(new_integers, 0, array, 0, newSize);
        return array;
} }
