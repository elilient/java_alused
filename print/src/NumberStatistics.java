public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    private int evenSum;
    private int oddSum;

    public NumberStatistics() {
        this.amountOfNumbers=0;
        this.sum=0;
        this.evenSum=0;
        this.oddSum=0;
    }

    public void addNumber(int number) {
        if(number != -1){
            if(number % 2 == 0) {
                this.evenSum = this.evenSum + number;
            } else {
                this.oddSum = this.oddSum + number;
            }
            this.sum = this.sum + number;
        }
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        return this.sum;

    }

    public double average() {
        double sum = 0.0;
        if(this.amountOfNumbers>0){
            sum = (double)this.sum / (double)this.amountOfNumbers;
            return sum;
        } else {
            return 0;
        }
    }

    public int evenSum() {
        return this.evenSum;
    }

    public int oddSum() {
        return this.oddSum;
    }

}
