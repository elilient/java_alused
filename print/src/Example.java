import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());


        int result = 0;
        while (first < second+1) {
            result += first;
            first++;
        }
        System.out.println("Sum is " + result);
    }
}
