package Module1;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int [] integers = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter integer %d: ", i+1 );
            integers[i] = scanner.nextInt();

        int [] integers2 = (integers);
        for (int value : integers2) {
            System.out.println(value + " ");


        }}
    }

    }
