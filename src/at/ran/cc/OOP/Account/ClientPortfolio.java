package at.ran.cc.OOP.Account;

public class ClientPortfolio {
    private String firstName;
    private String lastName;
    private SavingsAccount savingsAccount;
    private CheckingAccount checkingAccount;
    private Mortgage mortgage;
    private CreditAccount creditAccount;

    public ClientPortfolio(String firstName, String lastName, SavingsAccount savingsAccount,
                           CheckingAccount checkingAccount, Mortgage mortgage, CreditAccount creditAccount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.savingsAccount = savingsAccount;
        this.checkingAccount = checkingAccount;
        this.mortgage = mortgage;
        this.creditAccount = creditAccount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SavingsAccount getSavingsAccount() {
        return savingsAccount;
    }

    public CheckingAccount getCheckingAccount() {
        return checkingAccount;
    }

    public Mortgage getMortgage() {
        return mortgage;
    }

    public CreditAccount getCreditAccount() {
        return creditAccount;
    }
}
