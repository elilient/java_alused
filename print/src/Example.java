import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number;
        number = Integer.parseInt(reader.nextLine());

        while (true) {


            if (number != -1) {
                number = Integer.parseInt(reader.nextLine());
            } else {
                System.out.println("Thank you and see you later!");
                break;
            }

        }
    }
}
