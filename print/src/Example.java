import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Pascal");
        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("C++");

        print(list);

        removeLast(list);

        System.out.println();

        print(list);

    }

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);
        }
    }
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);
    }
}