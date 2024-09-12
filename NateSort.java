import java.util.ArrayList;
import java.util.List;

public class NateSort {
    public static int[] nateSort(int[] arr, int b) {
        List<Integer> bin1 = new ArrayList<>(b);
        List<Integer> bin2 = new ArrayList<>(b);
        List<Integer> bin3 = new ArrayList<>(b);
        List<Integer> remainder = new ArrayList<>();

        // insert sorting here

        int[] remainderArray = new int[remainder.size()];
        for (int i = 0; i < remainder.size(); i++) {
            remainderArray[i] = remainder.get(i);
        }
        return remainderArray;
    }
}