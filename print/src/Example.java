import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        String help = "";

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                System.out.println("You typed the following words: ");
                break;
            }
            words.add(word);
        }
        Collections.reverse(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}