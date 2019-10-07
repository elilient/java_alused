import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        char character = name.charAt(name.length()-1);
        System.out.print("First character: " + character);
    }
}
