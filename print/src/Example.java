import java.util.Scanner;


public class Example {
    public static int greatest(int number1, int number2, int number3) {
       int first = Math.max(number1, number2);
       int second = Math.max(first, number3);

       return second;
    }

    public static void main(String[] args) {
        int answer =  greatest(7, 2, 3);
        System.out.println("Greatest: " + answer);
    }
}
