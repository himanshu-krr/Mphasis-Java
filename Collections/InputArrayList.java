package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    
    public static ArrayList<Integer> getNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt()); // Taking input and adding to ArrayList
        }

        scanner.close(); // Close the scanner to prevent resource leaks
        return numbers; // Returning the ArrayList
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbersFromUser(); // Calling method to get input
        System.out.println("ArrayList elements: " + numbers);
    }
}
