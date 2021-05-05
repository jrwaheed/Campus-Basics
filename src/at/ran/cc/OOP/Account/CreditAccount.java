package at.ran.cc.OOP.Account;

public class CreditAccount {
    private float principleAmount = 2000;
    private float monthlyMinimum = 25;
    private float recentPayment;
    private float mortgageRate = .15f;

    public CreditAccount(float principleAmount, float monthlyMinimum, float mortgageRate) {
        this.principleAmount = principleAmount;
        this.monthlyMinimum = monthlyMinimum;
        this.recentPayment = recentPayment;
        this.mortgageRate = mortgageRate;
    }

    public float getPrincipleAmount() {
        return principleAmount;
    }

    public float getMonthlyMinimum() {
        return monthlyMinimum;
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
