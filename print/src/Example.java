import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int result = 0;
        int count = 0;
        float avg = 0;
        int evenCounter = 0;
        int oddCounter = 0;
        System.out.println("Type a number: ");
        while (true) {

            number = Integer.parseInt(reader.nextLine());

            if (number != -1) {
                count = count + 1;
                result += number;
                avg = (float)result/count;
                if (number % 2 == 0) {
                    evenCounter = evenCounter + 1;
                } else {
                    oddCounter = oddCounter +1;
                }
            } else {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + result);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + avg);
                System.out.println("Even numbers: " + evenCounter);
                System.out.println("Odd numbers: " + oddCounter);
                break;
            }

        }
    }
}
