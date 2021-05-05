package at.ran.cc.OOP.Account;

public class CreditAccount {
    private float principleAmount = 2000;
    private float monthlyMinimum = 25;
    private float cardPayment;
    private float creditRate = .15f;

    public CreditAccount(float principleAmount, float monthlyMinimum, float creditRate) {
        this.principleAmount = principleAmount;
        this.monthlyMinimum = monthlyMinimum;
        this.cardPayment = cardPayment;
        this.creditRate = creditRate;
    }

    public float getPrincipleAmount() {
        return principleAmount;
    }

    public float getMonthlyMinimum() {
        return monthlyMinimum;
    }

    public float getCardPayment() {
        return cardPayment;
    }


    public float getCreditRate() {
        return creditRate;
    }

    public void setPrincipleAmount(float principleAmount) {
        this.principleAmount = principleAmount;
    }

    public void setCardPayment(float cardPayment) {
        this.cardPayment = cardPayment;
    }
}
