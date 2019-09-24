import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you?");
        int age = Integer.parseInt(reader.nextLine());

        if (age > -1 && age < 121) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }

    }
}
