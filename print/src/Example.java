import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 0;
        int result = 0;
        while (i < number) {
            i++;
            result = result + i;
        }
        System.out.println("Sum is " + result);
    }
}
