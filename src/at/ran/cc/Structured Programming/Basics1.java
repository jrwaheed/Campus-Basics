package at.ran.cc.basics;

import org.w3c.dom.ls.LSOutput;

import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.ArrayList;





public class Basics1 {
    public static void main(String[] args) {
/*-------------------------------------------------------------------------
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
_______________________________________________________________________

        Hashtable<String,Integer> Calendar = new Hashtable<String,Integer>();
        Calendar.put("Jan",31);
        Calendar.put("Feb",28);
        Calendar.put("Mar",31);
        Calendar.put("Apr",30);
        Calendar.put("May",31);
        Calendar.put("Jun",31);
        Calendar.put("Jul",31);
        Calendar.put("Aug",31);
        Calendar.put("Sep",30);
        Calendar.put("Oct",31);
        Calendar.put("Nov",30);
        Calendar.put("Dec",31);
        Hashtable<String,String> Weekly = new Hashtable<String,String>();
        Weekly.put("Jan","Fri");
        Weekly.put("Feb","Mon");
        Weekly.put("Mar","Mon");
        Weekly.put("Apr","Thu");
        Weekly.put("May","Sat");
        Weekly.put("Jun","Tue");
        Weekly.put("Jul","Thu");
        Weekly.put("Aug","Sun");
        Weekly.put("Sep","Thu");
        Weekly.put("Oct","Fri");
        Weekly.put("Nov","Mon");
        Weekly.put("Dec","Wed");
        Hashtable<String,Integer> calPush = new Hashtable<String,Integer>();
        calPush.put("Mon", 0);
        calPush.put("Tue", 1);
        calPush.put("Wed", 2);
        calPush.put("Thu", 3);
        calPush.put("Fri", 4);
        calPush.put("Sat", 5);
        Scanner calendarScanner = new Scanner(System.in);
        System.out.println("Which month do you need (3 letter abbreviation please):" );
        String userCalendar = calendarScanner.nextLine();
        Scanner startDayScanner = new Scanner(System.in);
        System.out.println("What is the start day:" );
        String userStartDayString = startDayScanner.nextLine();
        int userStartDay = Integer.valueOf(userStartDayString);
        int userCalendarDays = Calendar.get(userCalendar);
        String userWeeklyDay = Weekly.get(userCalendar);
        int dayPush = calPush.get(userWeeklyDay);
        int numberOfRows = 5;
        int numberOfcolumns = 7;
        int calBuild [][] = new int[numberOfRows][numberOfcolumns];
//Rows come first, then columns
        System.out.println("| MO || DI || MI || DO || FR || SA || SO |");
        int counter = userStartDay;
        int i = 0;
        for (int j = 0; j <= 4; j++) {
            if (j == 0) {
                for (i =0; i < (dayPush + counter - 1); i++) {
                    calBuild[j][i] = 0;
                    System.out.print("| " + calBuild[j][i] + " |");
                }
                for (i = (dayPush + counter - 1); i <= 6; i++) {
                    calBuild[j][i] = counter;
                    counter += 1;
                    System.out.print("| " + calBuild[j][i] + " |");
                }
            } else {
                for (i = 0; i <= 6 && counter <=userCalendarDays; i++) {
                    calBuild[j][i] = counter;
                    counter += 1;
                    System.out.print("| " + calBuild[j][i] + " |");
                }
            }
            System.out.println();
        }
        _______________________________________________________________________*/
        Integer[] randomNumbers = {500, 96, 103, 77, 129, 54, 22, 75, 88, 113, 66, 59, 71, 104, 91, 43, 87, 73, 74};
        ArrayList<Integer> sortedList = new ArrayList<>();

        int j = 0;

        while (j < randomNumbers.length) {

            int minValue = 1000;
            int i = 0;


            for (int k = 0; k < randomNumbers.length; k++) {
                boolean isContained = sortedList.contains(randomNumbers[i]);
                if (randomNumbers[i] < minValue && isContained == false) {
                    minValue = randomNumbers[i];
                    i += 1;
                } else {
                    i += 1;
                }
            }
            j += 1;
            sortedList.add(minValue);

        }
        System.out.println(sortedList);


    }
}





