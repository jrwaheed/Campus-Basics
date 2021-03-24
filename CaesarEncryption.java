import java.util.ArrayList;

public class CaesarEncryption {

    public static void main(String [] args) {
       Caesar("test good");
    }

    public static void Caesar(String phrase) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz   ";

        ArrayList<String> caesarString = new ArrayList<>();
        for (int i = 0; i < phrase.length(); i++) {
            char originalLetter = phrase.charAt(i);
            int alphabetIndex = alphabet.indexOf(originalLetter);
            String caesarLetter = alphabet.substring((alphabetIndex + 2),(alphabetIndex + 3));
            caesarString.add(caesarLetter);
        }
        System.out.println(String.join("",caesarString));
    }
}
