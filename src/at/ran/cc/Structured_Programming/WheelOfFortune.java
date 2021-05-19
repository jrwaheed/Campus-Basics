package at.ran.cc.Structured_Programming;

//updated
import java.util.Random;


public class WheelOfFortune {
    static String[] words = {"Volvo", "Mercedes", "Cadillac","Mustang"};
    static String randWord = randWordGenerator(words);

    public static String randWordGenerator (String[] words) {
        int numWords = words.length;
        Random rand = new Random();
        int randNum = rand.nextInt(words.length) + 1;
        return words[randNum - 1];
    }

    public static void blankGenerator() {
        int randWordLetterCount = randWord.length();
        System.out.println(randWordLetterCount);
        Random rand = new Random();
        int randNum = rand.nextInt(randWord.length()) + 1;

    }

    public static void main(String[] args) {

   }
}


