import java.util.ArrayList;

public class ReverseString {

    public static void main(String [] args) {

        ReverseWord("testing the game");
    }
    public static void ReverseWord(String phrase) {
        ArrayList<String> reverseCharList = new ArrayList<>();
        for (int i = (phrase.length() - 1); i >= 0 ; i--) {
            char phraseLetter = phrase.charAt(i);
            String stringLetter = Character.toString(phraseLetter);
            reverseCharList.add(stringLetter);
        }
        System.out.println(String.join("",reverseCharList));
    }
}
