package Module1;

import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a weight in grams (g):");
        int grams = Integer.parseInt(scanner.nextLine());

        double leiviska = (grams / (20 * 32 * 13.28));
        double naula = ((grams % (20 * 32 * 13.28)) / (32 * 13.28));
        double luoti = ((grams % (32 * 13.28)) / 13.28);

        System.out.print(grams + "grams is " + leiviska + "leiviskä, " + naula + "naula and " + luoti + "luoti.");
    }
}