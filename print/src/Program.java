
public class Program {
    public static void main(String[] args) {
        Counter count = new Counter(10, true);
        System.out.println(count.value());
        count.decrease();
        System.out.println(count.value());
        count.increase();
        System.out.println(count.value());


    }
}
