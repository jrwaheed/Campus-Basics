package at.ran.cc.OOP.Account;

public class SavingsAccount {
    private float overDraftFee = 25;
    private float interestRate = .01f;
    private float accountBalance;
    private float accountDeposit;
    private float accountWithdrawal;
    private float minimumBalance = 100;

    public SavingsAccount(float overDraftFee, float interestRate, float accountBalance, float minimumBalance) {
        this.overDraftFee = overDraftFee;
        this.interestRate = interestRate;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
    }

    public float getOverDraftFee() {
        return overDraftFee;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public float getAccountDeposit() {
        return accountDeposit;
    }

    public float getAccountWithdrawal() {
        return accountWithdrawal;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }


    public void setAccountDeposit(float accountDeposit) {
        this.accountDeposit = accountDeposit;
    }

    public void setAccountWithdrawal(float accountWithdrawal) {
        this.accountWithdrawal = accountWithdrawal;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }
}