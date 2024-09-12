import java.util.ArrayList;
import java.util.List;

public class Bin {
    private int b;
    private ArrayList<Integer> bins;

    public Bin(int b) {
        this.b = b;
        this.bins = new ArrayList<>();
    }

    public int getB() {
        return b;
    }

    public void setBinValue(int value) {
        if (getCurrentSum() + value <= b) {
            bins.add(value);
        } else {
            throw new IllegalArgumentException("Adding this value exceeds the bin's maximum capacity");
        }
    }



    private int getCurrentSum() {
        int sum = 0;
        for (int value : bins) {
            sum += value;
        }
        return sum;
    }

    public List<Integer> getBins() {
        return bins;
    }

    // Method to get bin value at a specific index
    public int getBinValue(int index) {
        return bins.get(index);
    }

}