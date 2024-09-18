import java.util.Scanner;

// CSCI 3501 Lab 4
// Andreas Nelson and Nate Ferrell

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter bin capacity, number of items, and item sizes separated by spaces: ");
        String input = scanner.nextLine();

        NateSort.nateSort(input); // Call nateSort with the input string

        // Examples demonstrating optimality and non-optimality
        System.out.println("\nExample 1 (Optimal):");
        NateSort.nateSort("20 8 12 4 8 15 9 3 1 10"); 

        System.out.println("\nExample 2 (Optimal):");
        NateSort.nateSort("10 8 5 5 4 4 3 3 2 2"); 

        System.out.println("\nExample 3 (Non-Optimal):");
        NateSort.nateSort("10 6 7 6 5 4 3 2");  
        // A better solution would be: [[7, 2], [6, 3], [5, 4]] with unused space of 1
    }
}