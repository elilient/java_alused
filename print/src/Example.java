import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.print("Up to what number? ");
        Scanner reader = new Scanner(System.in);
        int target = Integer.parseInt(reader.nextLine());
        int number = 1;
        while (number < target+1) {
            System.out.println(number);
            number++;
        }
    }
}
