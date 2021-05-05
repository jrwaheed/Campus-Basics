package at.ran.cc.OOP.Account;

public class Mortgage {
    private float loanAmount = 175000;
    private float monthlyNote = 600;
    private float mortgagePrincipleBalance = 90000;
    private float makePayment;
    private float mortgageRate = .04f;

    public Mortgage(float loanAmount, float monthlyNote, float accountBalance, float mortgageRate) {
        this.loanAmount = loanAmount;
        this.monthlyNote = monthlyNote;
        this.mortgagePrincipleBalance = mortgagePrincipleBalance;
        this.makePayment = makePayment;
        this.mortgageRate = mortgageRate;
    }

    public float getloanAmount() {
        return loanAmount;
    }

    public float getMonthlyNote() {
        return monthlyNote;
    }

    public float getMortgagePrincipleBalance() {
        return mortgagePrincipleBalance;
    }

    public float getMakePayment() {
        return makePayment;
    }

    public float getMortgageRate() {
        return mortgageRate;
    }

    public void setMortgagePrincipleBalance(float mortgagePrincipleBalance) {
        this.mortgagePrincipleBalance = mortgagePrincipleBalance;
    }

    public void setMakePayment(float makePayment) {
        this.makePayment = makePayment;
    }
}
