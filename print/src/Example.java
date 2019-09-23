import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int second = Integer.parseInt(reader.nextLine());
        System.out.print("\n");
        double div = (double)first/(double)second;

        System.out.print("Division: " + first + " / " + second + " = " + div);
    }
}
