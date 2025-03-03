import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        // Create a Random object to generate random values
        Random rand = new Random();
        // Scanner for user input to ask if they want to continue
        Scanner scanner = new Scanner(System.in);

        // Variables for die values and the sum
        int die1, die2, die3, sum, rollCount;

        // Print the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Roll", "Die1", "Die2", "Die3", "Sum");
        System.out.println("----------------------------------------------------------");

        rollCount = 0;
        boolean isTriple = false;

        // Loop to roll dice until a triple is rolled
        while (!isTriple) {
            rollCount++;

            // Generate random values between 1 and 6 for each die
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            die3 = rand.nextInt(6) + 1;

            // Calculate the sum of the dice
            sum = die1 + die2 + die3;

            // Print the current roll results
            System.out.printf("%-10d%-10d%-10d%-10d%-10d\n", rollCount, die1, die2, die3, sum);

            // Check if the dice are the same (triple)
            if (die1 == die2 && die2 == die3) {
                isTriple = true;
            }

            // Ask the user if they want to continue rolling
            System.out.print("Do you want to roll again? (y/n): ");
            String userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("n")) {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
