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
            if (words.contains(word)) {
                System.out.println("You gave the word " + word + " twice");
                break;
            }
            words.add(word);
        }
    }
}