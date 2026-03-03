public class SavingAccount extends Account {
    public SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Savings: Insufficient funds!");
        }
    }
}