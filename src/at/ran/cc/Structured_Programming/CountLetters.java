package at.ran.cc.Structured_Programming;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class CountLetters {
    public static void main(String[] args) {
        printAmountOfLetters("mississippi");

        ReverseWord("butterfly");

        System.out.println(countLetter("Tennessee", 'e'));

        System.out.println(isPalindrom("rentner"));
    }

    public static void printAmountOfLetters(String word) {
        List<Character> charList = new ArrayList<>();
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < word.length() ; i++) {
            char wordLetter = word.charAt(i);
            charSet.add(wordLetter);
            charList.add(wordLetter);
        }

        for (char j : charSet) {
            int charFrequency = Collections.frequency(charList,j);
            System.out.println("Character: " + j + " and - frequency: " + charFrequency);
        }
    }


    public static Integer countLetter(String word, char specialChar) {
        List<Character> charList = new ArrayList<>();
        //Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < word.length() ; i++) {
            char wordLetter = word.charAt(i);
            charList.add(wordLetter);
        }

        int charFrequency = Collections.frequency(charList,specialChar);
        return charFrequency;
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

