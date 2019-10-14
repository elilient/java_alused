import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + "does not appear more than once.");
        }
    }
    public static boolean moreThanOnce(ArrayList<Integer> list, int number) {
        int count = 0;
        for (int i : list) {
            if (i == number) {
                count++;
            }

        }
        if (count>1) {
            return true;
        } else {
            return false;
        }
    }
}