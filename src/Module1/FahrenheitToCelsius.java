package Module1;

import java.util.Scanner;

public class FahrenheitToCelsius  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        int fahrenheit = Integer.parseInt(scanner.nextLine());

        double celsius = (double) ((fahrenheit - 32) * 5) / 9;

        System.out.printf("The temperature in Celsius " + celsius + "°.");
    }
}


