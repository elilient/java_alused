import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        printSquare(4);
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



}
