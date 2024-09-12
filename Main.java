public class Main {
    public static void main (String[] args) {
        Bin bin = new Bin(5);
        bin.setBinValue(0, 10);
        bin.setBinValue(1, 20);
        bin.setBinValue(2, 30);
        bin.setBinValue(3, 40);
        bin.setBinValue(4, 50);
        System.out.println(bin.getBinValue(0));
        System.out.println(bin.getBinValue(1));
        System.out.println(bin.getBinValue(2));
        System.out.println(bin.getBinValue(3));
        System.out.println(bin.getBinValue(4));
    }
}
