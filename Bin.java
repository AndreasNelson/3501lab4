import java.util.ArrayList;
import java.util.List;

public class Bin {
    private int capacity;
    private int currentValue;
    private List<Integer> values;

    public Bin(int capacity) {
        this.capacity = capacity;
        this.currentValue = 0;
        this.values = new ArrayList<>();
    }

    public boolean setBinValue(int value) {
        if (currentValue + value <= capacity) {
            currentValue += value;
            values.add(value);
            return true;
        }
        return false;
    }

    public boolean removeBinValue(int value) {
        if (values.contains(value)) {
            currentValue -= value;
            values.remove(Integer.valueOf(value));
            return true;
        }
        return false;
    }

    public List<Integer> getBins() {
        return values;
    }
}