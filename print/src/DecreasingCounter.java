public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter
    private int initValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initValue = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public void reset() {
        while (value > 0) {
            value--;
        }
    }

    public void setInitial() {
        value = initValue;
    }

}