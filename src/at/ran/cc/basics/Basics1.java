package at.ran.cc.basics;

import org.w3c.dom.ls.LSOutput;

import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;





public class Basics1 {

    public static void reLooper(int intUnderReview) {
        String strUnderReview = Integer.toString(intUnderReview);
        int intLength = Integer.toString(intUnderReview).length();

        char[] arrayUnderReview = strUnderReview.toCharArray();

        int crossSum = 0;
        while (intLength >= 1) {
            char charDigit = arrayUnderReview[intLength - 1];
            int arrayDigit = Character.getNumericValue(charDigit);
            crossSum = crossSum + arrayDigit;
            intLength -=1;
        }
        if (Integer.toString(crossSum).length() > 1) {
            intUnderReview = crossSum;
            reLooper(intUnderReview);
        } else {
            System.out.println("The final crossSum is: " + crossSum);
        }
    }

    public static void main(String[] args) {
        reLooper(1119);
    }

}




