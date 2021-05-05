package at.ran.cc.OOP.Account;

public class CheckingAccount {
    private float overDraftFee = 25;
    private float transactionFee = .05f;
    private float accountBalance = 12745;
    private float accountDeposit;
    private float accountWithdrawal;
    private float minimumBalance = 1000;

    public CheckingAccount(float overDraftFee, float transactionFee, float accountBalance, float minimumBalance) {
        this.overDraftFee = overDraftFee;
        this.transactionFee = transactionFee;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
    }

    public float getOverDraftFee() {
        return overDraftFee;
    }

    public float getTransactionFee() {
        return transactionFee;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public float getAccountDeposit() {
        return accountDeposit;
    }

    public float getAccountWithdrawal() {
        return accountWithdrawal;
    }

    public void setAccountWithdrawal(float accountWithdrawal) {
        this.accountWithdrawal = accountWithdrawal;
    }

    public void setAccountDeposit(float accountDeposit) {
        this.accountDeposit = accountDeposit;
    }
}
