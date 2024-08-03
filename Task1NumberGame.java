import java.util.Scanner;

import java.util.Random;

public class Task1NumberGame {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;

        int maxRange = 100;

        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        int maxAttempts = 10; 

        System.out.println("Welcome to the Number Guessing Game!");

        System.out.println("I've generated a number between " + minRange + " and " + maxRange + ".");

        System.out.println("Try to guess it!");

        int attempts = 0;

        boolean guessedCorrectly = false;

        while (!guessedCorrectly && attempts < maxAttempts)
         {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == targetNumber) 
            {
                guessedCorrectly = true;

                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            } 

            else if (userGuess < targetNumber) 
            {
                System.out.println("Too low! Try a higher number.");

            } 

            else 
            {
                System.out.println("Too high! Try a lower number.");
            }

        }


        if (!guessedCorrectly)
         {
            System.out.println("Sorry, you've reached the maximum number of attempts.");

            System.out.println("The correct number was: " + targetNumber);
        }

       

        scanner.close();
    }
}

