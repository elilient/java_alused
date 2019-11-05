import java.util.Random;

public class PasswordRandomizer {
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String randString = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        random = new Random();
        while (salt.length() < length) {
            int index = (int)(random.nextFloat() * randString.length());
            salt.append(randString.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
