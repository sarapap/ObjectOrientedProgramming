package Module1;

import java.util.Scanner;
public class BinaryValues {

    private static int binaryToDecimal(String binary) {
        int decimal = 0;

        // Loop through each bit
        for (int i = binary.length() - 1, power = 0; i >= 0; i--, power++) {
            int bit = Character.getNumericValue(binary.charAt(i));
            decimal += (int) (bit * Math.pow(2, power));
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String number = scanner.nextLine();

        // Convert binary to decimal
        int decimal = binaryToDecimal(number);

        System.out.println("Binary number in decimal : " + decimal);
    }

}
