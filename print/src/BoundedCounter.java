public class BoundedCounter {
    private int value;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (this.value >= this.upperLimit) {
            this.value = 0;
        } else {
            this.value++;
        }
    }

    public String toString() {
        String text;
        if (this.value < 10) {
            text = "0" + value;
        } else {
            text = "" + value;
        }

        return text;

    }

    public int getValue() {
        return this.value;
    }

    public int setValue(int index) {
        this.value = index;
        return this.value;
    }


}
