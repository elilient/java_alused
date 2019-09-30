import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int number = Integer.parseInt(reader.nextLine());


        while (true) {
            if (number > 0) {
                printText();
                number--;
            } else {
                break;
            }
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

}
