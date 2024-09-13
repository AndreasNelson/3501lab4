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

    public boolean setBinValue(int value) {
        if (getCurrentSum() + value <= b) {
            bins.add(value);
            return true;
        } else {
            return false;
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

    public int getBinValue(int index) {
        return bins.get(index);
    }
}