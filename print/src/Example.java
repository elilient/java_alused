import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int result = 0;
        int count = 0;
        float avg = 0;
        System.out.println("Type a number: ");
        while (true) {

            number = Integer.parseInt(reader.nextLine());

            if (number != -1) {
                count = count + 1;
                result += number;
                avg = (float)result/count;
            } else {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + result);
                System.out.println("How many numbers: " + count);
                System.out.println("Average: " + avg);
                break;
            }

        }
    }
}
