public class Main {
    public static void main(String[] args) {
        Bin bin = new Bin(10);
        bin.setBinValue(3);
        bin.setBinValue(4);
        bin.setBinValue(2);

        System.out.println("Current bin values: " + bin.getBins());

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int b = 10;

        int[] remainder = nateSort(arr, b);

        System.out.println("Remainder: ");
        for (int num : remainder) {
            System.out.print(num + " ");
        }
    }

    // Define the nateSort method
    public static int[] nateSort(int[] arr, int b) {
        // Example implementation of nateSort
        int[] remainder = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (num % b != 0) {
                remainder[index++] = num;
            }
        }

        // Trim the remainder array to the correct size
        int[] trimmedRemainder = new int[index];
        System.arraycopy(remainder, 0, trimmedRemainder, 0, index);

        return trimmedRemainder;
    }
}