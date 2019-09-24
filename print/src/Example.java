import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number % 2 == 1) {
            System.out.println("Number " + number + " is odd.");
        }

        if  (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        }

    }
}
