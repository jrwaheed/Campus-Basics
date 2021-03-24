import java.util.Random;
import java.util.Scanner;

public class Dice {
    public static void main(String [] args) {
        DiceGameIntro();
    }

    public static void DiceGameIntro () {
        System.out.println("\n\n******  DICE!  ******\n\n");
        System.out.println("Ready to play (Yes/No)?: ");
        Scanner playerScan = new Scanner(System.in);
        String playerChoice = playerScan.nextLine();

        switch (playerChoice) {
            case ("Yes"):
                DiceGame();
                break;
            case("No"):
                System.out.println("Maybe next time.");
                break;
            default:
                System.out.println("Invalid selection");
                DiceGameIntro();
                break;
        }
    }

    public static void DiceGame() {
        int userRollTotal = 0;
        int computerRollTotal = 0;

        System.out.println("\n");

        for (int i = 0; i < 6; i++) {
            Random userRand = new Random();
            int userDiceRoll = userRand.nextInt(6) + 1;
            userRollTotal += userDiceRoll;
            System.out.println("You rolled a " + userDiceRoll);

            Random computerRand = new Random();
            int computerDiceRoll = computerRand.nextInt(6) + 1;
            computerRollTotal += computerDiceRoll;
            System.out.println("The computer rolled a " + computerDiceRoll);
        }

        if (userRollTotal > computerRollTotal) {
            System.out.println("\n\nYou won! " + userRollTotal + " to " + computerRollTotal);
        } else if (userRollTotal < computerRollTotal) {
            System.out.println("\n\nYou lost. " + userRollTotal + " to " + computerRollTotal);
        } else {
            System.out.println("\n\nIts a tie. Computer still wins. " + userRollTotal + " to " + computerRollTotal);
        }
    }

}


