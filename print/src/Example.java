import java.util.Scanner;

public class Example {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the points: ");
        int points = Integer.parseInt(reader.nextLine());


        if (points < 30) {
            System.out.println("Grade: failed");
        } else if (points < 35) {
            System.out.println("Grade: 1");
        } else if (points < 40) {
            System.out.println("Grade: 2");
        } else if (points < 45) {
            System.out.println("Grade: 3");
        } else if (points < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }

    }
}
