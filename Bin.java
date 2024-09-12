public class Bin {
    private int b;
    private int[] bins;

    public Bin(int b) {
        this.b = b;
        this.bins = new int[b];
    }

    public int getB() {
        return b;
    }

    public void setBinValue(int index, int value) {
        if (index >= 0 && index <b) {
            bins[index] = value;
        }
        else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    public int getBinValue(int index) {
        if (index >= 0 && index < b) {
            return bins[index];
        }
        else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }
}