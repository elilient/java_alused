import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int guesses = 0;

        Scanner reader = new Scanner(System.in);
        double randNumber = Math.random()*100;
        int intNumber = (int)randNumber;

        System.out.print("Guess a number: ");
        int number = Integer.parseInt(reader.nextLine());
        guesses++;

        while (true) {
            if (number > intNumber) {
                System.out.println("The number is greater, guesses made: " + guesses);
                System.out.print("Guess a number: ");
                number = Integer.parseInt(reader.nextLine());
                guesses++;
            } else if (number < intNumber) {
                System.out.println("The number is lesser, guesses made: " + guesses);
                System.out.print("Guess a number: ");
                number = Integer.parseInt(reader.nextLine());
                guesses++;
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

}
