import java.util.*;

public class WheelOfFortune {

    static String [] words = {"Volvo", "Mercedes", "Cadillac", "Mustang"};
    static String randWord = randWordGenerator(words);
    static HashMap<Character, Integer> starKey= new HashMap<>(); //HashMap<key, value>
    static char [] blankFilledWordArray = blankGenerator();





    public static String randWordGenerator(String[] words) {
        //String[] words = {"Volvo", "Mercedes", "Cadillac", "Mustang"};
        System.out.println("****** Lets play Wheel of Fortune ****** \n\n");
        System.out.println("Here is your first word. \n");
        int numWords = words.length;
        Random rand = new Random();
        int randNum = rand.nextInt(words.length) + 1;
        return words[randNum - 1];
    }

    public static char[] blankGenerator() {
        int randWordLetterCount = randWord.length();
        String blankFilledWord ="";


        for (int i = 0; i < randWordLetterCount; i++) {
            Random rand = new Random();
            int randBlank = rand.nextInt(2);


            if (randBlank == 0) {
                blankFilledWord = blankFilledWord.concat("*");
            } else {
                char charOfWord = randWord.charAt(i);
                blankFilledWord = blankFilledWord.concat(Character.toString(charOfWord));
            }
        }
        for (int j = 0; j < randWordLetterCount; j++) {
            ;
            if (blankFilledWord.charAt(j) == '*') {
                starKey.put(randWord.charAt(j), j);
            } else { continue;}
        }
        //System.out.println(blankFilledWord);
        //System.out.println(starKey);
        char [] blankFilledWordArray = new char[blankFilledWord.length()];
        for (int k = 0; k < blankFilledWord.length(); k++) {
            blankFilledWordArray[k] = blankFilledWord.charAt(k);
        }
        return blankFilledWordArray;
    }

    public static void GuessAnalyzer() {

        System.out.println("\n" + Arrays.toString(blankFilledWordArray));

        if (Arrays.toString(blankFilledWordArray).contains("*")) {
            System.out.println("Please guess a letter: ");
            Scanner scanner = new Scanner(System.in);
            String userGuess = scanner.nextLine();
            Character charGuess = userGuess.charAt(0);

            if (randWord.contains(userGuess) && (Arrays.toString(blankFilledWordArray).contains("*"))) {
                System.out.println("Nice guess!");
                Integer replaceStarIndex = starKey.get(charGuess);

                for (int i = 0; i < randWord.length(); i++) {
                    if (blankFilledWordArray[i] == '*' && randWord.charAt(i) == charGuess) {
                        blankFilledWordArray[i] = charGuess;
                        GuessAnalyzer();
                    } else {
                        continue;
                    }
                }
            } else {
                System.out.println("Incorrect. Please try again");
                GuessAnalyzer();
            }
        } else {

            System.out.println("Well done! " + Arrays.toString(blankFilledWordArray) + " is the correct answer");
        }
    }
    public static void main(String[] args) {

        GuessAnalyzer();
        
    }
}

