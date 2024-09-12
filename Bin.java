import java.util.ArrayList;

public class Bin {
    private int b;
    private ArrayList<Integer> bins;

    public Bin(int b) {
        this.b = b;
        this.bins = new ArrayList<>(b);
        for (int i = 0; i < b; i++) {
            bins.add(0); // Initialize with default values
        }
    }

    public int getB() {
        return b;
    }

    public void setBinValue(int index, int value) {
        if (index >= 0 && index < b) {
            bins.set(index, value);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getBinValue(int index) {
        if (index >= 0 && index < b) {
            return bins.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
    
}