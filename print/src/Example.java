import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        //printTriangle(4);
        //printWhitespaces(4);
        xmasTree(20);
    }

    public static void printStars(int number) {
        int i = 0;

        while (i < number) {
            System.out.print("*");
            i++;
            if (i>1) {
                System.out.print("*");
            }
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
        int j = 0;
        while (i >= 0) {
            printWhitespaces(size-j);
            printStars(size-i);
            i--;
            j++;
        }
    }

    public static void printWhitespaces(int size) {
        int i = 0;

        while (i < size) {
            System.out.print(" ");
            i++;
        }
        //System.out.println("");
    }

    public static void xmasTree(int height) {
        int i = height;
        int j = 0;
        while (i >= 0) {
            printWhitespaces(height-j);
            printStars(height-i);
            i--;
            j++;
        }
        printWhitespaces(height - 2);
        printStars(2);
        printWhitespaces(height -2);
        printStars(2);
    }

}
