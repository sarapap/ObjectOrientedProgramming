package Module1;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = {"John", "Olli", "Sara", "Isabella", "Maria", "Pekka", "Aiden", "Alexa", "Niina", "Matias"};
        String[] lastNames = {"Pappila", "Mäkinen", "Smith", "Jacobs", "Laakso", "Jokinen", "Murray", "Waters", "Keith", "Saari"};

        System.out.println("How many random names should be generated? ");
        int names = scanner.nextInt();

        int i;
        for (i = 0; i < names; i++) {
            String firstname = generateRandomName(firstNames);
            String lastname = generateRandomName(lastNames);
            String fullName = firstname + " " + lastname;
            System.out.println("Random Name: " + fullName);
        }
    }
        private static String generateRandomName(String[] array) {
            Random random = new Random();
            int index = random.nextInt(array.length);
            return array[index];
        }
    }