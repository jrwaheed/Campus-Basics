import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hangman {

    static String word = "Python";
    static String blankField = "";
    static List<Character> incorrectGuess = new ArrayList<>();
    static int incorrect = 0;

    public static char[] begin() {
        int i = 1;
        while (i <= word.length()) {
            blankField = blankField + "-";
            i += 1;
        }
        char [] blankFieldArray = blankField.toCharArray();
        System.out.println("Hint: What slithers and codes?");
        System.out.println("Here is your word: " + Arrays.toString(blankFieldArray));

        return blankFieldArray;
    }

    public static String guessMachine() {
        System.out.println("Guess a letter.");
        Scanner guessObj = new Scanner(System.in);
        String stringGuess = guessObj.nextLine();

        return stringGuess;
    }

    public static void gallows() {
        switch(incorrect) {
            case 0:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 1:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 2:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println("  |          |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 3:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println(" -|          |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 4:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println(" -|-         |");
                System.out.println("             |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 5:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println(" -|-         |");
                System.out.println(" /           |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            case 6:
                System.out.println("  ------------");
                System.out.println("  |          |");
                System.out.println("  O          |");
                System.out.println(" -|-         |");
                System.out.println(" / \\         |");
                System.out.println("             |");
                System.out.println("      --------------");
                System.out.println("\n");
                break;

            default:
        }
    }

    public static void main(String[] args) {
        System.out.println("***************************");
        System.out.println("**** Lets Play Hangman ****");
        System.out.println("***************************");

        gallows();
        char [] blankFieldArray = begin();


        while(incorrectGuess.size() < 7) {
            String stringGuess = guessMachine();
            char guess = stringGuess.charAt(0);

            if (incorrectGuess.contains(guess)) {
                System.out.println("You have already made this guess.");
                System.out.println("Try something else");
            } else {

                if (word.contains(stringGuess)) {
                    gallows();
                    System.out.println("Good guess");
                    int letterLocation = word.indexOf(guess);

                    blankFieldArray[letterLocation] = guess;
                    System.out.println("Here is your word currently: " + Arrays.toString(blankFieldArray));
                    String updateBlankField = Arrays.toString(blankFieldArray);

                    if (!updateBlankField.contains("-")) {
                        System.out.println("YOU WON!");
                        System.exit(0);
                    }
                } else if (!word.contains(stringGuess)) {
                    System.out.println("Nope!");
                    System.out.println("Here is your word currently: " + Arrays.toString(blankFieldArray));
                    incorrectGuess.add(guess);
                    incorrect += 1;
                    if (incorrectGuess.size() == 6) {
                        gallows();
                        System.out.println("Game over. You suck.");
                        System.exit(0);
                    } else {
                        gallows();
                    }
                }
            }
        }
    }
}
