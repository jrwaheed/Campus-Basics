package at.ran.cc.basics;

import org.w3c.dom.ls.LSOutput;

import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;





public class Basics1 {

    public static void main(String[] args) {
        /*---------------------------------------------------------------------------
           PROBLEM!!!!!! SOMETHING WRONG!!!!!!!!!
        for (int i = 0; i <= 1000; i++) {
            int intLength = Integer.toString(i).length();
            String numberString = Integer.toString(i);


            int stringSum = 0;
            for (int j = 0; j <= (intLength - 1) ; j++) {
                char strDigit = numberString.charAt(j);
                int intDigit = Character.getNumericValue(strDigit);
                stringSum = stringSum + intDigit;
            }
            System.out.println(stringSum);
        }
----------------------------------------------------------------------------------------
        for (int i = 40; i <= 1000; i++) {
            int intLength = Integer.toString(i).length();
            String numberString = Integer.toString(i);

            int crossSum = 0;
            for (int j = 0; j <= (intLength - 1) ; j++) {
                char strDigit = numberString.charAt(j);
                int intDigit = Character.getNumericValue(strDigit);
                crossSum = crossSum + intDigit;
            if(j == (intLength - 1 ) && (crossSum % 7 == 0)) {
                System.out.println(i);
            }
            }

        }
        ----------------------------------------------------------------------------------------*/
        ArrayList<Integer> stringSumList = new ArrayList<Integer>();
        ArrayList<Integer> counterList = new ArrayList<Integer>();

        for (int i = 0; i <= 50; i++) {
            int intLength = Integer.toString(i).length();
            String numberString = Integer.toString(i);


            int crossSum = 0;
            for (int j = 0; j <= (intLength - 1) ; j++) {
                char strDigit = numberString.charAt(j);
                int intDigit = Character.getNumericValue(strDigit);
                crossSum = crossSum + intDigit;
                if (j == (intLength - 1)) {
                    stringSumList.add(crossSum);
                }
            }
        }
        System.out.println(stringSumList);
        for (int i = 0; i <= 50; i++) {
            counterList.add(Collections.frequency(stringSumList,stringSumList.get(i)));
        }
        int maxCount = counterList.stream().max(Integer::compare).get();
        System.out.println(counterList);
        System.out.println(maxCount);

    }
}




