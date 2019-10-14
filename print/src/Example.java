import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + variance(list));
    }

    public static int greatest(ArrayList<Integer> list) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int number : list) {
            numbers.add(number);
        }
        return Collections.max(numbers);
    }

    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public static double average(ArrayList<Integer> list) {
        double average = 0;
        int i = 0;
        for (int number : list) {
            i++;
        }
        average = (double)sum(list) / i;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double variance = 0;
        int i = 0;
        double answer = 0;
        for (int number : list) {
            variance += Math.pow(number-average(list),2);
            i++;
        }
        answer = variance/(i-1);
        return answer;
    }
}