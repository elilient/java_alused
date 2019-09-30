import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 1;
        int result = 1;
        int counter = 0;
        while (i <= number) {

            result = result * i;
            i++;
            System.out.println("Iteration: " + i + " number: " + number + "result: " + result);
        }
        System.out.println("Factorial is " + result);
    }
}
