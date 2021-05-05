package at.ran.cc.OOP.Account;

public class Main {
    public static void main(String [] args) {
        SavingsAccount savings1 = new SavingsAccount(25, .01f, 90000, 100);
        CheckingAccount checking1 = new CheckingAccount(25, .05f, 12745, 1000);
        Mortgage mortgage1 = new Mortgage(175000, 600,12745, .04f);
        CreditAccount credit1 = new CreditAccount(2000, 25, .15f);

        ClientPortfolio client1 = new ClientPortfolio("Richard", "Rich", savings1, checking1, mortgage1, credit1);

        client1.getCheckingAccount().getAccountBalance();
    }
}
