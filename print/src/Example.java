import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        int i = 0;
        while (i>=0) {
            System.out.println("Type a number:");
            int s = Integer.parseInt(reader.nextLine());
            stats.addNumber(s);
            i=s;
        }


        System.out.println("Sum: " + stats.sum());
        System.out.println("Sum of even: " + stats.evenSum());
        System.out.println("Sum of odd: " + stats.oddSum());
    }

}