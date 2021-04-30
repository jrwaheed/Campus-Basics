package at.ran.cc.Structured_Programming;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;


public class Basics1 {
    public static void main(String[] args) {
        printAmountOfLetters("check");

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
            char evaluatedChar = j;
            int charFrequency = Collections.frequency(charList,evaluatedChar);
            System.out.println("Character: " + evaluatedChar + " and - frequency: " + charFrequency);

        }
    }
}





