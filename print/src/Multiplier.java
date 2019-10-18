public class Multiplier {
    private int multiNumber;
    public Multiplier(int number) {
        this.multiNumber = number;

    }

    public int multiply(int otherNumber) {
        int calc = otherNumber*multiNumber;
        return calc;
    }
}
