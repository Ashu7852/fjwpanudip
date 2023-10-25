


import java.util.Scanner;

public class IntegerConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Please enter a number as a string: ");
            String userInput = scanner.nextLine();
            
            if (userInput == null || userInput.isEmpty()) {
                throw new NullPointerException("Input is empty or null.");
            }
            
            int convertedNumber = Integer.parseInt(userInput);
            System.out.println("Converted number: " + convertedNumber);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format.");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Input is empty or null.");
        } finally {
            scanner.close();
        }
    }
}


// --------------output------------
// Please enter a number as a string: 0
// Converted number: 0