import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String firstName = reader.nextLine();
        System.out.print("Type your age: ");
        int firstAge = Integer.parseInt(reader.nextLine());

        System.out.print("\n");

        System.out.print("Type your name: ");
        String secondtName = reader.nextLine();
        System.out.print("Type your age: ");
        int secondAge = Integer.parseInt(reader.nextLine());

        System.out.print("\n");
        int sum = firstAge + secondAge;

        System.out.print(firstName + " and " + secondtName + " are " + sum + " years old in total." );
    }
}
