package at.ran.cc.basics;


import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Basics1 {




    static int Deposit(int depositAmount) {
        int currentBalance = 1000;
        int newBalance = depositAmount + currentBalance;
        System.out.println("Your new balance:" + newBalance);
        return newBalance;
    }

    static int Withdrawal(int withdrawalAmount) {
        int currentBalance = 1000;
        int newBalance = -withdrawalAmount + currentBalance;
        System.out.println("Your new balance:" + newBalance);
        return newBalance;
    }

    public static void main(String[] args) {


        System.out.print("Please make your selection: \n 1) Deposit\n 2) Withdrawal\n 3) Account Balance\n 4) Exit \n");
        Scanner InitialObj = new Scanner(System.in);
        String userInitialEntry = InitialObj.nextLine();
        System.out.println("Here is the user entry: " + userInitialEntry);

        switch (userInitialEntry) {
            case "1":
                System.out.println("Enter your deposit amount");
                Scanner DepositObj = new Scanner(System.in);
                int depositAmount = DepositObj.nextInt();
                Deposit(depositAmount);
                break;

            case "2":
                System.out.println("Enter your withdrawal amount");
                Scanner withdrawalObj = new Scanner(System.in);
                int withdrawalAmount = withdrawalObj.nextInt();
                Withdrawal(withdrawalAmount);
                break;
            case "3":
                //System.out.println("Your current balance is:" + newBalance); break;
            case "4":
                System.out.println("Thank you for your business. Goodbye."); break;
            default: break;}

    }


}
