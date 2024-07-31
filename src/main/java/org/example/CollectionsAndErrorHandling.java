package org.example;
import java.util.*;

public class CollectionsAndErrorHandling {
    public static void main(String[] args) {
        // 1. Define a List of integers with at least one set of duplicates
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10));

        try {
            // 2. Use a Set to remove duplicates
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);

            // 3. Calculate the sum and average of the integers
            int sum = 0;
            for (int num : uniqueNumbers) {
                sum += num;
            }
            double average = (double) sum / uniqueNumbers.size();

            // 4. Print the sum, average, and the list of integers without duplicates
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Numbers without duplicates: " + uniqueNumbers);

            // 5. Demonstrating exception handling
            // IndexOutOfBoundsException
            try {
                System.out.println(numbers.get(20)); // This will throw an exception
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException caught: " + e.getMessage());
            }

            // IllegalArgumentException
            try {
                List<Integer> illegalList = new ArrayList<>(Arrays.asList(null, 1, 2, 3));
                Collections.sort(illegalList); // This will throw an exception
            } catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught: " + e.getMessage());
            }

            // ArithmeticException
            try {
                int result = sum / 0; // This will throw an exception
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program execution completed.");
        }
    }
}