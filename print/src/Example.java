import java.util.Scanner;


public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int number = Integer.parseInt(reader.nextLine());

        int i = 0;
        System.out.print(word.substring(0,number));




    }
}
