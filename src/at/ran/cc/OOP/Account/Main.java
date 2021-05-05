package at.ran.cc.OOP.Account;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {


    public static SavingsAccount savings1 = new SavingsAccount(25, .01f, 90000, 100);
    public static CheckingAccount checking1 = new CheckingAccount(25, .05f, 12745, 1000);
    public static Mortgage mortgage1 = new Mortgage(175000, 600, 90000, .04f);
    public static CreditAccount credit1 = new CreditAccount(2000, 25, .15f);

    public static ClientPortfolio client1 = new ClientPortfolio("Richard", "Rich", savings1, checking1, mortgage1, credit1);


    public static void main(String[] args) throws InterruptedException {
        begin();
        firstUserRequest();
    }

    public static void begin() throws InterruptedException {
        System.out.println("***********************************************");
        System.out.println("************  Welcome to JRW Bank  ************");
        System.out.println("***********************************************\n");

        TimeUnit.SECONDS.sleep(2);
    }

    public static void pivot(int userAccountSelectionToMethod){
        switch (userAccountSelectionToMethod) {
            case 1:
                checkingAccountUpdate();
                break;
            case 2:
                creditAccountUpdate();
                break;
            case 3:
                mortgageAccountUpdate();
                break;
             case 4:
                savingsAccountUpdate();
                break;
            case 5:
                System.out.println("Thank you for your business at JRW Bank. Have a good day!");
                System.exit(0);

        }
    }

    public static void firstUserRequest() {
        System.out.println("Which account would you like to use today? Please enter the number of your selection.");
        System.out.println("1 - Checking\n2 - Credit Card\n3 - Mortgage \n4 - Savings Account\n5 - Exit");
        Scanner userAccountSelectionObj = new Scanner(System.in);
        int userAccountSelectionToMethod = userAccountSelectionObj.nextInt();
        pivot(userAccountSelectionToMethod);
    }

    public static void nextUserRequest() {
        System.out.println("\n\nWould you like to make another transaction? Please enter the number of your selection.");
        System.out.println("1 - Checking\n2 - Credit Card\n3 - Mortgage \n4 - Savings Account\n5 - Exit");
        Scanner userAccountSelectionObj = new Scanner(System.in);
        int userAccountSelectionToMethod = userAccountSelectionObj.nextInt();
        pivot(userAccountSelectionToMethod);
    }

    public static void checkingAccountUpdate() {
        System.out.println("You have chosen Checking Account. What would you like to do?");
        System.out.println("1 - Make a deposit\n2 - Make a withdrawal\n3 - Check Account Balance\n4 - Check Fees");
        Scanner checkingAccountSelectionObj = new Scanner(System.in);
        int checkingAccountSelectionToMethod = checkingAccountSelectionObj.nextInt();

        switch (checkingAccountSelectionToMethod) {
            case 1:
                System.out.println("Enter the deposit amount.");
                Scanner checkingDepositObj = new Scanner(System.in);
                int checkingAccountDeposit = checkingDepositObj.nextInt();
                client1.getCheckingAccount().setAccountDeposit(checkingAccountDeposit);
                client1.getCheckingAccount().setAccountBalance(client1.getCheckingAccount().getAccountDeposit() +
                        client1.getCheckingAccount().getAccountBalance());

                System.out.println("You have deposited: $" + client1.getCheckingAccount().getAccountDeposit());
                System.out.println("Your new balance is: $" + client1.getCheckingAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 2:
                System.out.println("Enter the withdrawal amount.");
                Scanner checkingWithdrawalObj = new Scanner(System.in);
                int checkingAccountWithdrawal = checkingWithdrawalObj.nextInt();
                client1.getCheckingAccount().setAccountWithdrawal(checkingAccountWithdrawal);
                client1.getCheckingAccount().setAccountBalance(client1.getCheckingAccount().getAccountBalance() -
                        client1.getCheckingAccount().getAccountWithdrawal());

                System.out.println("You have withdrawn: $" + client1.getCheckingAccount().getAccountWithdrawal());
                System.out.println("Your new balance is: $" + client1.getCheckingAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 3:
                System.out.println("Your account balance is : $" + client1.getCheckingAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 4:
                System.out.println("Your checking account fees are as follows:");
                System.out.println("Overdraft fees: " + client1.getCheckingAccount().getOverDraftFee());
                System.out.println("Transaction fees: " + client1.getCheckingAccount().getTransactionFee());
                nextUserRequest();
                break;
        }
    }

    public static void creditAccountUpdate() {
        System.out.println("You have chosen Credit Card Account. What would you like to do?");
        System.out.println("1 - Make a payment\n2 - Check principle \n3 - Check Credit Rate");
        Scanner creditAccountSelectionObj = new Scanner(System.in);
        int creditAccountSelectionToMethod = creditAccountSelectionObj.nextInt();

        switch (creditAccountSelectionToMethod) {
            case 1:
                System.out.println("Enter the payment amount.");
                Scanner creditPaymentObj = new Scanner(System.in);
                int creditAccountPayment = creditPaymentObj.nextInt();
                client1.getCreditAccount().setCardPayment(creditAccountPayment);
                client1.getCreditAccount().setPrincipleAmount(client1.getCreditAccount().getPrincipleAmount() -
                        client1.getCreditAccount().getCardPayment());

                System.out.println("You have paid: $" + client1.getCreditAccount().getCardPayment());
                System.out.println("Your new balance is: $" + client1.getCreditAccount().getPrincipleAmount());
                nextUserRequest();
                break;

            case 2:
                System.out.println("Your principle is : $" + client1.getCreditAccount().getPrincipleAmount());
                nextUserRequest();
                break;

            case 3:
                System.out.println("Your credit card interest rate is: " + client1.getCreditAccount().getCreditRate());
                nextUserRequest();
                break;
        }
    }

    public static void mortgageAccountUpdate() {
        System.out.println("You have chosen your Mortgage. What would you like to do?");
        System.out.println("1 - Make a payment\n2 - Check loan amount\n3 - Check Principle Balance\n4 - Check Mortgage Rate");
        Scanner mortgageAccountSelectionObj = new Scanner(System.in);
        int mortgageAccountSelectionToMethod = mortgageAccountSelectionObj.nextInt();

        switch (mortgageAccountSelectionToMethod) {
            case 1:
                System.out.println("Enter the payment amount.");
                Scanner mortgagePaymentObj = new Scanner(System.in);
                int mortgagePaymentAmount = mortgagePaymentObj.nextInt();
                client1.getMortgage().setMakePayment(mortgagePaymentAmount);
                client1.getMortgage().setMortgagePrincipleBalance(client1.getMortgage().getMortgagePrincipleBalance() -
                        client1.getMortgage().getMakePayment());

                System.out.println("You have made a payment of: $" + client1.getMortgage().getMakePayment());
                System.out.println("Your new principle is: $" + client1.getMortgage().getMortgagePrincipleBalance());
                nextUserRequest();
                break;

            case 2:
                System.out.println("Your loan amount is: $" + client1.getMortgage().getloanAmount());
                nextUserRequest();
                break;

            case 3:
                System.out.println("Your principle is: $" + client1.getMortgage().getMortgagePrincipleBalance());
                nextUserRequest();
                break;

            case 4:
                System.out.println("Your mortgage rate is: " + client1.getMortgage().getMortgageRate());
                nextUserRequest();
                break;
        }
    }

    public static void savingsAccountUpdate() {
        System.out.println("You have chosen Savings Account. What would you like to do?");
        System.out.println("1 - Make a deposit\n2 - Make a withdrawal\n3 - Check Savings Account Balance\n4 - Check Account Details");
        Scanner savingsAccountSelectionObj = new Scanner(System.in);
        int savingsAccountSelectionToMethod = savingsAccountSelectionObj.nextInt();

        switch (savingsAccountSelectionToMethod ) {
            case 1:
                System.out.println("Enter the deposit amount.");
                Scanner savingsDepositObj = new Scanner(System.in);
                int savingsAccountDeposit = savingsDepositObj.nextInt();
                client1.getSavingsAccount().setAccountDeposit(savingsAccountDeposit);
                client1.getSavingsAccount().setAccountBalance(client1.getSavingsAccount().getAccountBalance() +
                        client1.getSavingsAccount().getAccountDeposit());

                System.out.println("You have deposited: $" + client1.getSavingsAccount().getAccountDeposit());
                System.out.println("Your new balance is: $" + client1.getSavingsAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 2:
                System.out.println("Enter the withdrawal amount.");
                Scanner savingsWithdrawalObj = new Scanner(System.in);
                int savingsAccountWithdrawal = savingsWithdrawalObj.nextInt();
                client1.getSavingsAccount().setAccountWithdrawal(savingsAccountWithdrawal);
                client1.getSavingsAccount().setAccountBalance(client1.getSavingsAccount().getAccountBalance() -
                        client1.getSavingsAccount().getAccountWithdrawal());

                System.out.println("You have withdrawn: $" + client1.getSavingsAccount().getAccountWithdrawal());
                System.out.println("Your new balance is: $" + client1.getSavingsAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 3:
                System.out.println("Your account balance is : $" + client1.getSavingsAccount().getAccountBalance());
                nextUserRequest();
                break;

            case 4:
                System.out.println("Your savings account details are as follows:");
                System.out.println("Overdraft fees: " + client1.getSavingsAccount().getOverDraftFee());
                System.out.println("Current Interest rate: " + client1.getSavingsAccount().getInterestRate());
                System.out.println("Minimum Balance: " + client1.getSavingsAccount().getMinimumBalance());
                nextUserRequest();
                break;
        }

    }

}


