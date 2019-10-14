import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a text:");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static String reverse(String text) {
        String help = "";
        int i = 1;
        char character;
        while (i<text.length()+1) {
            int length = text.length()-i;
            i++;
            character = text.charAt(length);
            help = help + character;
        }
        return help;
    }

    public static boolean palindrome(String text) {
        if (reverse(text).equals(text)) {
            return true;
        } else {
            return false;
        }
    }

}