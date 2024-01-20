package Module1;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int total = 0;

        while (total < 10) {
            System.out.println("New problems!: ");

            for (int i = 0; i < 10; i++) {
                int first = random.nextInt(10) + 1; // Random number between 1 and 10
                int second = random.nextInt(10) + 1;
                int answer = first * second;

                System.out.printf("Question %d: %d x %d = ", i + 1, first, second);
                int user_answer = scanner.nextInt();

                if (user_answer == answer) {
                    System.out.println("Correct! +1 point");
                    total++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + answer);
                }
            }

            System.out.println("You scored " + total + "!");

            if (total == 10) {
                System.out.println("Congratulations! You've mastered the multiplication table.");
                break;
            } else {
                System.out.println("Time for another set of problems! ");
                total = 0; // A new set of problems
            }
        }
    }
}

