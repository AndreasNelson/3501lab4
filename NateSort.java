import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NateSort {

    public static void nateSort(String input) {
        Scanner scanner = new Scanner(input);
        
        try {
            int binSize = scanner.nextInt(); // Read bin size
            int n = scanner.nextInt(); // Read number of items

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Read items
            }

            Arrays.sort(arr); // Sort the array in ascending order

            Bin bin1 = new Bin(binSize);
            Bin bin2 = new Bin(binSize);
            Bin bin3 = new Bin(binSize);
            List<Integer> remainder = new ArrayList<>();

            boolean[] used = new boolean[arr.length];

            int high = arr.length - 1;
            int mid = arr.length / 2;

            while (high >= 0) {
                if (used[high]) { 
                    high--;
                    continue; 
                }

                boolean paired = false;
                boolean firstAdded = false; 

                for (int i = mid; i >= 0 && !paired; i--) {
                    if (!used[i]) {
                        int sum = arr[high] + arr[i];
                        if (sum <= binSize) {
                            if (bin1.setBinValue(arr[high]) && bin1.setBinValue(arr[i])) {
                                firstAdded = true;
                            } else if (bin2.setBinValue(arr[high]) && bin2.setBinValue(arr[i])) {
                                firstAdded = true;
                            } else if (bin3.setBinValue(arr[high]) && bin3.setBinValue(arr[i])) {
                                firstAdded = true;
                            }
                            if (firstAdded) {
                                used[high] = true;
                                used[i] = true;
                                paired = true;
                            }
                        }
                    }
                }

                // If no pair is found, place the item alone
                if (!paired) {
                    if (!bin1.setBinValue(arr[high]) && 
                        !bin2.setBinValue(arr[high]) &&
                        !bin3.setBinValue(arr[high])) {
                        remainder.add(arr[high]);
                    }
                    used[high] = true;
                }

                high--;
                mid = arr.length / 2; // Recalculate mid after potential removals
            }

            // Print bins and remainder
            System.out.println("Bin 1: " + bin1.getBins());
            System.out.println("Bin 2: " + bin2.getBins());
            System.out.println("Bin 3: " + bin3.getBins());
            System.out.println("Remainder: " + remainder);
        } finally {
            scanner.close(); // Ensure the scanner is closed
        }
    }
}