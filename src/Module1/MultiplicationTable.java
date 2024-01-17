package Module1;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalPoints = 0;

        while (totalPoints < 10) {
            System.out.println("New problems!:");

            for (int i = 0; i < 10; i++) {
                int factor1 = random.nextInt(10) + 1; // Generates a random number between 1 and 10
                int factor2 = random.nextInt(10) + 1;
                int correctAnswer = factor1 * factor2;

                System.out.printf("Question %d: %d x %d = ", i + 1, factor1, factor2);
                int userAnswer = scanner.nextInt();

                if (userAnswer == correctAnswer) {
                    System.out.println("Correct! +1 point");
                    totalPoints++;
                } else {
                    System.out.println("Incorrect. The correct answer is " + correctAnswer);
                }
            }

            System.out.println("You scored " + totalPoints + " points in this set.");

            if (totalPoints == 10) {
                System.out.println("Congratulations! You've mastered the multiplication tables.");
                break;
            } else {
                System.out.println("Starting a new set of problems...");
                totalPoints = 0; // Reset points for a new set of problems
            }
        }
    }
}

