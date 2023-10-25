
 
 import java.util.ArrayList;

public class EvenSumCalculator {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some integers to the list (replace these with your numbers)
        numbers.add(1);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        // Calculate the sum of even numbers
        int evenSum = calculateEvenSum(numbers);

        // Display the result
        System.out.println("Sum of even numbers: " + evenSum);
    }

    public static int calculateEvenSum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}


// ----------OUTPUT------------
// Sum of even numbers: 28