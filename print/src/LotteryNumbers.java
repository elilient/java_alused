import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.numbers = new ArrayList<>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<>();

        int randNumber;

        while(this.numbers.size()<7) {
            randNumber = this.random.nextInt(39) + 1;

            if(!this.containsNumber(randNumber)){
                this.numbers.add(randNumber);
            }
        }
    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number)){
            return true;
        } else {
            return false;
        }
    }
}
