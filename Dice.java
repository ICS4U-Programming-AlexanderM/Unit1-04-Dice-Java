import java.util.Random;
import java.util.Scanner;
/**
* This program plays a guessing game with the user.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-02-21
*/

public final class Dice {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Dice() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(final String[] args) {
        // Variables
        String stringInput = "";
        int userInput = 0;
        int counter = 0;
        int randomNumber = 0;

        // Generate random number
        final Random rand = new Random();
        // random numbers in specific range
        final int upperBound = 6;
        // Generating random values from 0 - 5
        randomNumber = rand.nextInt(upperBound);
        // Change from 0-5 to 1-6
        randomNumber = randomNumber + 1;

        // Loop
        do {
            counter = counter + 1;
            try {
                // Get food input
                System.out.println("Enter your guess (between 1 and 6):");
                final Scanner line = new Scanner(System.in);
                stringInput = line.nextLine();
                userInput = Integer.parseInt(stringInput);
                // Check size of input
                if (userInput > randomNumber) {
                    System.out.println("Too big.");
                } else if (userInput < randomNumber) {
                    System.out.println("Too small.");
                } else {
                    System.out.println("Correct");
                }
            } catch (NumberFormatException err) {
                System.out.println("Error, not a viable input.");
                userInput = 0;
            }
        } while (userInput != randomNumber);
        System.out.println("It took " + counter + " guess(es).");
    }
}
