import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NateSort {
    public static void nateSort(int[] arr, int b) {
        Arrays.sort(arr); // Step 1: Sort the array in ascending order

        Bin bin1 = new Bin(b);
        Bin bin2 = new Bin(b);
        Bin bin3 = new Bin(b);
        List<Integer> remainder = new ArrayList<>();

        List<Integer> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add(num);
        }

        int high = arrayList.size() - 1;
        int mid = arrayList.size() / 2;

        while (high >= 0) {
            boolean added = false;
            while (mid >= 0 && high >= 0) {
                int sum = arrayList.get(high) + arrayList.get(mid);
                if (sum <= b) {
                    if (bin1.setBinValue(arrayList.get(high)) && bin1.setBinValue(arrayList.get(mid))) {
                        arrayList.remove(high);
                        arrayList.remove(mid);
                        added = true;
                    } else if (bin2.setBinValue(arrayList.get(high)) && bin2.setBinValue(arrayList.get(mid))) {
                        arrayList.remove(high);
                        arrayList.remove(mid);
                        added = true;
                    } else if (bin3.setBinValue(arrayList.get(high)) && bin3.setBinValue(arrayList.get(mid))) {
                        arrayList.remove(high);
                        arrayList.remove(mid);
                        added = true;
                    } else {
                        remainder.add(arrayList.get(high));
                        remainder.add(arrayList.get(mid));
                        arrayList.remove(high);
                        arrayList.remove(mid);
                    }
                    high = arrayList.size() - 1;
                    mid = arrayList.size() / 2;
                    break;
                } else {
                    mid--;
                }
            }
            if (!added && high >= 0) {
                if (bin1.setBinValue(arrayList.get(high))) {
                    // Successfully added to bin1
                } else if (bin2.setBinValue(arrayList.get(high))) {
                    // Successfully added to bin2
                } else if (bin3.setBinValue(arrayList.get(high))) {
                    // Successfully added to bin3
                } else {
                    remainder.add(arrayList.get(high));
                }
                arrayList.remove(high);
                high = arrayList.size() - 1;
                mid = arrayList.size() / 2;
            }
        }

        // Print bins and remainder
        System.out.println("Bin 1: " + bin1.getBins());
        System.out.println("Bin 2: " + bin2.getBins());
        System.out.println("Bin 3: " + bin3.getBins());
        System.out.println("Remainder: " + remainder);
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int b = 30;
        nateSort(arr, b);
    }
}