

import java.util.InputMismatchException;
import java.util.Scanner;
public class IntegerInputHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0; // Initialize the variable to store the integer

        try {
            System.out.print("Please enter an integer: ");
            number = scanner.nextInt(); // Try to read an integer from the user

            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close(); // Close the scanner to prevent resource leak
        }
    }
}

// ----------------output----------
// Please enter an integer: 12
// You entered: 12