import java.util.ArrayList;

public class Palindrom {
    public static void main(String [] args) {

        System.out.println(isPalindrom("peter"));
}
    public static boolean isPalindrom(String word) {
        ArrayList<String> reverseCharList = new ArrayList<>();
        for (int i = (word.length() - 1); i >= 0; i--) {
            char phraseLetter = word.charAt(i);
            String stringLetter = Character.toString(phraseLetter);
            reverseCharList.add(stringLetter);
        }
        String palindromString = String.join("", reverseCharList);

        return word.equalsIgnoreCase(palindromString);
    }
}


