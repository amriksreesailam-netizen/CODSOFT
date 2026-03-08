import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char playAgain;

        do {
            int number = rand.nextInt(100) + 1; // random number between 1 and 100
            int guess;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("----- Number Guessing Game -----");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have only 5 attempts!");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > number) {
                    System.out.println("Too high!");
                } 
                else if (guess < number) {
                    System.out.println("Too low!");
                } 
                else {
                    System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
                    break;
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You used all attempts. The correct number was: " + number);
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thank you for playing!");
        sc.close();
    }
}
