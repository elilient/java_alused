import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        printRectangle(17,3);
    }

    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSquare(int number) {
        int i = 0;
        while (i < number) {
            printStars(number);
            i++;
        }

    }

    public static void printRectangle(int number, int row) {
        int i = 0;
        while (i < row) {
            printStars(number);
            i++;
        }
    }
}
