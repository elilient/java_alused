import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        System.out.println("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read;
        System.out.println("Type the Second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;
        System.out.println("Type the Third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = sum + read;

        System.out.println(sum);
    }
}
