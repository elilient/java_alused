import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 0;

        while (i<name.length()) {
            i++;
            System.out.print(name.charAt(name.length()-i));
        }

    }
}
