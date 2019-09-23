import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        System.out.print("\n");
        double pi = 3.14159265359;
        double radiusCalc = 2 * pi * radius;

        System.out.print("Circumference of the circle: " + radiusCalc);
    }
}
