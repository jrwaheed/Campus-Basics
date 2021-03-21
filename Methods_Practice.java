

import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.standard.MediaSize;
import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Random;




public class Java_Practice {
    /*-------------------------------------------------------------------------------------------
    public static void main(String[] args) {
/*-------------------------------------------------------------------------------------------
        Hashtable<String, Integer> calendar = new Hashtable<String, Integer>();
        calendar.put("Jan", 31);
        calendar.put("Feb", 28);
        calendar.put("Mar", 31);
        calendar.put("Apr", 30);
        calendar.put("May", 31);
        calendar.put("Jun", 31);
        calendar.put("Jul", 31);
        calendar.put("Aug", 31);
        calendar.put("Sep", 30);
        calendar.put("Oct", 31);
        calendar.put("Nov", 30);
        calendar.put("Dec", 31);

        Hashtable<String, String> weekly = new Hashtable<String, String>();
        weekly.put("Jan", "Fri");
        weekly.put("Feb", "Mon");
        weekly.put("Mar", "Mon");
        weekly.put("Apr", "Thu");
        weekly.put("May", "Sat");
        weekly.put("Jun", "Tue");
        weekly.put("Jul", "Thu");
        weekly.put("Aug", "Sun");
        weekly.put("Sep", "Thu");
        weekly.put("Oct", "Fri");
        weekly.put("Nov", "Mon");
        weekly.put("Dec", "Wed");

        Hashtable<String, Integer> calPush = new Hashtable<String, Integer>();
        calPush.put("Mon", 0);
        calPush.put("Tue", 1);
        calPush.put("Wed", 2);
        calPush.put("Thu", 3);
        calPush.put("Fri", 4);
        calPush.put("Sat", 5);

        Scanner calendarScanner = new Scanner(System.in);
        System.out.println("Which month do you need (3 letter abbreviation please):");
        String userCalendar = calendarScanner.nextLine();
        Scanner startDayScanner = new Scanner(System.in);
        System.out.println("What is the start day:");

        int userStartDay = startDayScanner.nextInt();
        int userCalendarDays = calendar.get(userCalendar);
        String userWeeklyDay = weekly.get(userCalendar);
        int dayPush = calPush.get(userWeeklyDay);
        int numberOfRows = 5;
        int numberOfcolumns = 7;

        int[][] calBuild = new int[numberOfRows][numberOfcolumns];

        System.out.println("| MO || DI || MI || DO || FR || SA || SO |");

        int counter = userStartDay;
        int i = 0;
        for (int j = 0; j <= 4; j++) {
            if (j == 0) {
                for (i = 0; i < (dayPush + counter - 1); i++) {
                    calBuild[j][i] = 0;
                    if (calBuild[j][i] == 0) {
                        System.out.print("|    |");
                    }
                }
                for (i = (dayPush + counter - 1); i <= 6; i++) {
                    calBuild[j][i] = counter;
                    if (calBuild[j][i] < 10 && calBuild[j][i] > 0) {
                        System.out.print("| 0" + calBuild[j][i] + " |");
                        counter += 1;
                    } else {
                        System.out.print("| " + calBuild[j][i] + " |");
                        counter += 1;
                    }
                }
            } else {
                for (i = 0; i <= 6 && counter <= userCalendarDays; i++) {
                    calBuild[j][i] = counter;
                    if (calBuild[j][i] < 10 && calBuild[j][i] > 0) {
                        System.out.print("| 0" + calBuild[j][i] + " |");
                        counter += 1;
                    } else {
                        calBuild[j][i] = counter;
                        System.out.print("| " + calBuild[j][i] + " |");
                        counter += 1;
                    }
                }
            }
            System.out.println();
        }
 ------------------------------------------------------------------------------
    public static void main(String[] args) {
        Greeting("Franz", "Mueller", true);
    }


    public static void Greeting(String firstName, String lastName, Boolean isMale) {
        if (isMale) {
        System.out.println("Hello Mr. " + firstName + " " + lastName);
    } else {
            System.out.println("Hello Ms. " + firstName + " " + lastName);
        }
    }
 ------------------------------------------------------------------------------*/
    public static void main(String[] args) {
        System.out.println(randomNumber(100, 500));
    }
    public static void testPrime(int primeNumber) {
        int switchPrime = 0;

        for (int i = 2; i < primeNumber; i++) {
            if (primeNumber % i != 0) {
                switchPrime = 0;
            } else {
                switchPrime = 1;
                break;
            }
        }
        switch (switchPrime) {
            case 0:
                System.out.println("This is a prime number");
                break;
            case 1:
                System.out.println("This is not a prime number");
                break;
        }
    }

    public static void divisibleByThree(int testNumber) {
        if (testNumber % 3 != 0) {
            System.out.println("This number is not divisible by 3");
        } else {
            System.out.println("This number is divisible by 3");

        }
    }

    public static int countTheMiddle(int lowerNum, int higherNum) {
        int numSum = 0;
        for (int j = lowerNum; j <= higherNum ; j++) {
            numSum = numSum + j;
        }
        return numSum;
    }
// WHAT IS THE DIFFERENCE BETWEEN .NEXTINT() AND .NEXTINT()BOUND?
    public static int randomNumber(int lowNum, int highNum) {
        Random rand = new Random();
        int result = rand.nextInt(highNum - lowNum) + lowNum;
        return result;
    }
}





