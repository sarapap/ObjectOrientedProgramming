package Module1;

import java.util.Scanner;

public class FahrenheitToCelsius  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.printf("The temperature in celsius is %2.1f", celsius);
        System.out.print("°.");
    }
}


