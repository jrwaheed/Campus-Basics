package at.ran.cc.OOP.Account;

public class Mortgage {
    private float principleAmount = 175000;
    private float monthlyNote = 600;
    private float accountBalance = 12745;
    private float recentPayment;
    private float mortgageRate = .04f;

    public Mortgage(float principleAmount, float monthlyNote, float accountBalance, float mortgageRate) {
        this.principleAmount = principleAmount;
        this.monthlyNote = monthlyNote;
        this.accountBalance = accountBalance;
        this.recentPayment = recentPayment;
        this.mortgageRate = mortgageRate;
    }

    public float getPrincipleAmount() {
        return principleAmount;
    }

    public float getMonthlyNote() {
        return monthlyNote;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public float getRecentPayment() {
        return recentPayment;
    }

    public float getMortgageRate() {
        return mortgageRate;
    }

    public void setRecentPayment(float recentPayment) {
        this.recentPayment = recentPayment;
    }
}
