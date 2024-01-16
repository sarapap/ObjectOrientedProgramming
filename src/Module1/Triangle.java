package Module1;

import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the length of the first leg of a triangle (cm):");
        int first = Integer.parseInt(scanner.nextLine());

        System.out.println("Give the length of the second leg of a triangle (cm):");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("The length of the hypotenuse is " + (Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2))) + " cm.");
    }
}
