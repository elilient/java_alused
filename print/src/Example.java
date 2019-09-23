import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.print("\n");
        int sum = first + second;

        System.out.print("Sum of the numbers: " + sum);
    }
}
