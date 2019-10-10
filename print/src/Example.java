import java.util.Scanner;
import java.util.ArrayList;

public class Example {
        public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        int i = 0;
        String help = "";

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                System.out.println("You typed the following words:");
                System.out.print(help);
                i++;
                break;
                
            } else {
                words.add(word);
                help = help + "\n" + word;
            }

        }
    }
}
