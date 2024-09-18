import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NateSort {

    public static void nateSort(int[] arr, int b) {
        Arrays.sort(arr); // Sort the array in ascending order

        Bin bin1 = new Bin(b);
        Bin bin2 = new Bin(b);
        Bin bin3 = new Bin(b);
        List<Integer> remainder = new ArrayList<>();

        boolean[] used = new boolean[arr.length]; // To track used items

        int high = arr.length - 1;
        int mid = arr.length / 2;

        while (high >= 0) {
            if (used[high]) { 
                high--;
                continue; 
            }

            boolean paired = false;
            // Try to pair with another item
            for (int i = mid; i >= 0 && !paired; i--) {
                if (!used[i]) {
                    int sum = arr[high] + arr[i];
                    if (sum <= b) {
                        if (bin1.setBinValue(arr[high]) && bin1.setBinValue(arr[i])) {
                            used[high] = true;
                            used[i] = true;
                            paired = true;
                        } else if (bin2.setBinValue(arr[high]) && bin2.setBinValue(arr[i])) {
                            used[high] = true;
                            used[i] = true;
                            paired = true;
                        } else if (bin3.setBinValue(arr[high]) && bin3.setBinValue(arr[i])) {
                            used[high] = true;
                            used[i] = true;
                            paired = true;
                        } else {
                            // If the first value was added but the second was not, remove the first value
                            bin1.removeBinValue(arr[high]);
                            bin2.removeBinValue(arr[high]);
                            bin3.removeBinValue(arr[high]);
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
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int b = 30;
        nateSort(arr, b);
    }
}