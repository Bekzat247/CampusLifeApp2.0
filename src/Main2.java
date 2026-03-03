public class Main2 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(100);
        CheckingAccount ca = new CheckingAccount(100);

        sa.withdraw(150);
        ca.withdraw(150);

        System.out.println(sa);
        System.out.println(ca);
    }
}