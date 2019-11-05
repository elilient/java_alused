import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        random = new Random();

    }

    public int roll() {
        int randomNumber = random.nextInt(this.numberOfSides);
        return randomNumber + 1;
    }
}
