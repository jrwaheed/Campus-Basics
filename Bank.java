import org.w3c.dom.ls.LSOutput;

import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Bank {

        static int currentBalance = 0;

        static void addToBalance() {
            System.out.println("Enter your deposit amount");
            Scanner DepositObj = new Scanner(System.in);
            int depositAmount = DepositObj.nextInt();
            currentBalance = depositAmount + currentBalance;
            System.out.println("Your new balance:" + currentBalance);
        }

        static void withdrawFromBalance() {
            System.out.println("Enter your withdrawal amount");
            Scanner withdrawalObj = new Scanner(System.in);
            int withdrawalAmount = withdrawalObj.nextInt();
            currentBalance = -withdrawalAmount + currentBalance;
            System.out.println("Your new balance:" + currentBalance);
        }

        static void printBalance() {
            System.out.println("Your current balance is:" + currentBalance);
        }

        static void printError() {
            System.out.println("Incorrect entry. Try again");
        }

        static void Begin() {
            boolean isFinished = false;
            while (!isFinished) {
                System.out.print("Please make your selection: \n 1) Deposit\n 2) Withdrawal\n 3) Account Balance\n 4) Exit \n");
                Scanner InitialObj = new Scanner(System.in);
                String userInitialEntry = InitialObj.nextLine();
                switch (userInitialEntry) {
                    case "1" -> addToBalance();
                    case "2" -> withdrawFromBalance();
                    case "3" -> printBalance();
                    case "4" -> {
                        System.out.println("Thank you for your business. Goodbye.");
                        isFinished = true;
                    }
                    default -> printError();
                }
            }
        }

        public static void main(String[] args) {
            Begin();
        }
    }

