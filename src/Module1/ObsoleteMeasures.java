package Module1;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a weight in grams (g):");
        int grams = Integer.parseInt(scanner.nextLine());

        int leiviska = (int) (grams / (20 * 32 * 13.28));
        int naula = (int) ((grams % (20 * 32 * 13.28)) / (32 * 13.28));
        double luoti = ((grams % (32 * 13.28)) / 13.28);

        System.out.printf(grams + " grams is %1.0f leiviskä, %2.0f naula and %2.2f luoti.",
        Math.floor(leiviska), Math.floor(naula), luoti);
    }
}