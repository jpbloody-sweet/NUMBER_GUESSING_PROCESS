import java.util.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Select difficulty level:");
        System.out.println("1. Easy (1-50)");
        System.out.println("2. Medium (1-100)");
        System.out.println("3. Hard (1-200)");

        int maxNumber;
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                maxNumber = 50;
                break;
            case 2:
                maxNumber = 100;
                break;
            case 3:
                maxNumber = 200;
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medium (1-100).");
                maxNumber = 100;
                break;
        }

        int numberToGuess = random.nextInt(maxNumber) + 1;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("I'm thinking of a number between 1 and " + maxNumber + ".");
        System.out.println("Can you guess what it is?");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number in " + numberOfAttempts + " attempts.");
            }
        }

        scanner.close();
        System.out.println("Thank you for playing the Number Guessing Game!");
    }
}