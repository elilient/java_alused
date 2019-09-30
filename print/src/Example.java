import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        printTriangle(4);
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

    public static void printTriangle(int size) {
        int i = size;
        while (i >= 0) {
            printStars(size-i);
            i--;
        }
    }
}
