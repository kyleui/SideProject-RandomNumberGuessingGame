import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        // generate a random number between 1 and 100
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        // play the game
        Scanner scanner = new Scanner(System.in);
        int numGuesses = 0;
        boolean hasWon = false;
        while (numGuesses < 10 && !hasWon) {
            System.out.print("Guess a number between 1 and 100: ");
            int guess = scanner.nextInt();
            numGuesses++;
            if (guess < randomNumber) {
                System.out.println("Too low! Guess again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Guess again.");
            } else {
                hasWon = true;
                System.out.println("Congratulations, you won!");
                System.out.println("You guessed the number in " + numGuesses + " guesses.");
            }
        }
        if (!hasWon) {
            System.out.println("Sorry, you lost! The number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
