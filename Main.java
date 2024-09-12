public class Main {
    public static void main(String[] args) {
        Bin bin = new Bin(10);
        bin.setBinValue(3);
        bin.setBinValue(4);
        bin.setBinValue(2);

        System.out.println("Current bin values: " + bin.getBins());

    }
}
