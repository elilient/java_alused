import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 17) {
            System.out.println("You have reached the age of majority!");
        }

        if  (number < 18) {
            System.out.println("You have not reached the age of majority yet!");
        }

    }
}
