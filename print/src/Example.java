import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));

    }

    public static int countItems(ArrayList<String> list) {
        int i = 0;
        while (i < list.size()) {
            i++;
        }
        return i;
    }
}