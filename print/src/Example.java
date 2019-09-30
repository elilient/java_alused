import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        int result = 0;

        while (true) {
            System.out.print("Type a number: ");
            number = Integer.parseInt(reader.nextLine());

            if (number != -1) {
                result += number;
                System.out.println("Number is: " + number);

            } else {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + result);
                break;
            }

        }
    }
}
