public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        String text = "The card has " + balance + " euros";
        return text;
    }

    public void payEconomical() {
        if (balance >= 2.5) {
            balance = balance - 2.5;
        }
    }

    public void payGourmet() {
        if (balance >= 4.00) {
            balance = balance - 4.00;
        }

    }

    public void loadMoney(double amount) {
        if (balance < 150 && amount > 0) {
            balance = balance + amount;
            if (balance > 150) {
                balance = 150;
            }
        }

    }
}
