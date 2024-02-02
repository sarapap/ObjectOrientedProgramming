package Module3;

import java.io.*;

public class FibonacciSequence {
    private final static String FILENAME = "fibonacci.csv";
    public static void main(String[] args) {
        long[] fibonacci = generateFibonacci(100);

        writeToCSV(fibonacci, FILENAME);
        System.out.println("Sequence has been written");
    }

    private static long[] generateFibonacci(int number) {
        long[] fibonacci = new long[number];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
}

private static void writeToCSV(long[] fibonacci, String filename) {
    try (FileWriter writer = new FileWriter(filename)) {
        writer.append("Index, Fibonacci Number\n");

        for (int i = 0; i < fibonacci.length; i++) {
            writer.append(i + 1 + "," + fibonacci[i] + "\n");
        }
    } catch (IOException e) {
        System.err.println("Error writing to CSV file: " + e.getMessage());
    }
}}
