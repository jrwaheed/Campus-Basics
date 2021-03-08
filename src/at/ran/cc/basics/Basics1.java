package at.ran.cc.basics;


import java.awt.font.NumericShaper;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Basics1 {

    int x = 0;


    public static void main(String[] args) {
        //System.out.println("Hello Coding Campus");


        /*-----------------------------------------------------------------------
        int newVariable = 10;
        int size = newVariable;

        int result = newVariable + size;

        //System.out.println(result);

        String banana = "banane";

        //m System.out.println(banana);

        double bananaPricePerKilo = 2.14;
        double applePricePerKilo = 3.43;

        double appleWeight = .34;
        double bananaWeight = .22;

        double eightAppleCost = 8 * appleWeight * applePricePerKilo;
        double seventeenBananaCost = 17 * bananaWeight * bananaPricePerKilo;

        double tonApples = 1000 * applePricePerKilo;
        double tonBanana = 1000 * bananaPricePerKilo;

        //System.out.println(eightAppleCost);
        //System.out.println(seventeenBananaCost);
        //System.out.println(tonApples + tonBanana);

        double einDouble = 2D;
        //System.out.println(einDouble);
        float einFloat = 4.0000000F;
        //System.out.println(einFloat);


        int ergebnis2 = 5/2;
        double ergebnis3 = 5/2;
        double ergebnis4 = 5.0/2.0;

        //System.out.println(ergebnis4);

        int neueZahl = 7;
        //System.out.println(neueZahl++);
        //System.out.println(++neueZahl);

        //System.out.println(neueZahl += 1);

        boolean isFridgeFull = true;

        int bottlesOfBeer = 4;
        boolean goBuyBeer = bottlesOfBeer < 3;

        //System.out.println(goBuyBeer);

        int maxBottlesOfBeer = 20;
        boolean isCaseFull = bottlesOfBeer == maxBottlesOfBeer;

        //\System.out.println(isCaseFull);

        if (bottlesOfBeer != 2) {
            System.out.println("This the correct amount of beer");
        } else {
            System.out.println("We need more beer!");
        }
        boolean myBoolean = true;
        myBoolean =!myBoolean;
        //System.out.println(myBoolean);

        int bottlesOfbeer =20;
        boolean isCaseNearlyFull = bottlesOfbeer >= 14 && bottlesOfbeer <=19;
        //System.out.println(isCaseNearlyFull);

        boolean isButterEmpty = false;
        boolean isCheeseEmpty = false;
        boolean goShopping = isButterEmpty || isCheeseEmpty;
        //System.out.println(goShopping);

        String myString = "Hello";
        boolean isEqual = myString.equals("Hello");

        //System.out.println(isEqual);

        int chocolateAmount = 2;

        if (chocolateAmount == 2) {
            System.out.println("We are good to go");
        } else if (chocolateAmount < 2)  {
            System.out.println("We need to go to the store! Now!");}
        else {
            System.out.println("Oh great! Extra chocolate!");}

         -------------------------------------------------------------------------

        String theDay = "Sunday";

        if (theDay == "Holiday") {
            System.out.println("Awesome! Nothing better than a Holiday.");}
        else if (theDay == "Saturday" || theDay == "Sunday") {
            System.out.println("The weekend sucks.");}
        else {
            System.out.println("Oh fine. Just a normal weekday.");
        }
        -------------------------------------------------------------------------
        double myDouble = 3.4;
        int myInt = (int)myDouble;
        System.out.println(myDouble);

        --------------------------------------------------------------------------
        String myStringNumber = "5";
        System.out.println(myStringNumber);
        int myNumber =Integer.parseInt(myStringNumber);
        System.out.println(myNumber);

        ---------------------------------------------------------------------------
        int i = 0;
        while (i < 10) {
            System.out.println(i * 10);
            i = i + 1;
        }

        ----------------------------------------------------------------------------


        ****************************************************************************
        int i = 1;
        int j = 2;

        String str = "*";

        if (i <= 5) {
            while (i <= 5) {
                System.out.println(str.repeat(i));
                i += 1;
            }
        }
        if (i > 5) {
            while (i < 10) {
                System.out.println(str.repeat(i - j));
                i += 1;
                j += 2;
            }
        }
        //---------------------------------------------------------------------------------

        Integer ageOfJamal = Integer.valueOf("31");

        if(ageOfJamal <= Byte.MAX_VALUE) {
            System.out.println("Jamal is not that old!");
        }

        -----------------------------------------------------------------------------------

        int valueA = 17;
        int valueB = 18;
        int valueC = 11;

        int minValue = Integer.min(valueA,valueC);
        System.out.println(minValue);

        ------------------------------------------------------------------------------------

        String stringValue = "4776";
        int testValueDigits = stringValue.length();

        System.out.println(stringValue);
        System.out.println(stringValue.length());

        if (testValueDigits <= 3) {
            System.out.println("This value is a byte.");
        } else if (testValueDigits > 3 && testValueDigits < 6) {
            System.out.println("This value is a short.");
        } else if (testValueDigits >= 6 && testValueDigits < 11) {
            System.out.println("This value is an integer.");
        } else {
            System.out.println("This value is a long.");}

        ------------------------------------------------------------------------------------
        int ageOfJamal = 42;

        String output1 = "";
        if (ageOfJamal > 50) {
            output1 = "he is old";
        } else {
            output1 = "he is not so old";
        }
        System.out.println(output1);

        String output2 = (ageOfJamal > 50) ? "he is old" : "he is not so old";
        System.out.println(output2);


        Boolean output = ageOfJamal > 50;
        System.out.println(output);

        ------------------------------------------------------------------------------------
        String operator = "*";
        float num1 = 4;
        float num2 = 20;

        switch (operator){
            case "+": System.out.println(num1 + num2); break;
            case "-": System.out.println(num1 - num2);break;
            case "*": System.out.println(num1 * num2);break;
            case "/": System.out.println(num1 / num2);break;
            default:
                System.out.println("I dont know the operator.");break;}
        ------------------------------------------------------------------------------------
        int grade = 5;

        switch (grade){
            case 1: System.out.println("Very good"); break;
            case 2: System.out.println("Good");break;
            case 3: System.out.println("Acceptable");break;
            case 4: System.out.println("You are stupid");break;
            default:
                System.out.println("You did not attend class");break;}

        ------------------------------------------------------------------------------------
        int kegel = 10;
        int bowl = 0;
        if (kegel < 4) {bowl = 1;}
        else if (kegel >= 4 && kegel < 7) {bowl = 2;}
        else if (kegel >= 7 && kegel < 9) {bowl = 3;}
        else if (kegel == 9) {bowl = 4;}
        else {
            System.out.println("You did not bowl!");
        }


        switch (bowl){
            case 1: System.out.println("okay"); break;
            case 2: System.out.println("guter Wurf");break;
            case 3: System.out.println("sehr guter Wurf");break;
            case 4: System.out.println("Perfekt!");break;
            default:
                System.out.println("");break;}

        ------------------------------------------------------------------------------------

        char myChar = 'z';
        String myStr = "testing";
        System.out.println(myChar);

        char newChar = '\'';
        System.out.println(newChar);

        char newerChar = '\t';
        ------------------------------------------------------------------------------------

        char myChar = '\n';
        System.out.println("monkey" + myChar + "business");

        ------------------------------------------------------------------------------------

        System.out.println("O\nK");

        ------------------------------------------------------------------------------------

        String myString = "Hello";
        String newString = myString + "O";
        System.out.println(newString);

        ------------------------------------------------------------------------------------

        char myChar = 'A';
        System.out.println(myChar);

        myChar = 66;
        System.out.println(myChar);

        myChar += 2;
        System.out.println(myChar);

        myChar = (char)(myChar + 1);
        System.out.println(myChar);

           ------------------------------------------------------------------------------------
        Random random1 = new Random();
        int randomNumber = random1.nextInt(100);
        System.out.println(randomNumber);

        if (randomNumber < 20) {
            System.out.println("Mini");}
        else if (randomNumber >= 20 && randomNumber <50) {
            System.out.println("Medium");
        } else {
            System.out.println("Large");
        }
        ------------------------------------------------------------------------------------

        Random random1 = new Random();
        int randomNumber1 = random1.nextInt(100);
        System.out.println(randomNumber1);

        Random random2 = new Random();
        int randomNumber2 = random2.nextInt(100);
        System.out.println(randomNumber2);

        if (randomNumber1 < randomNumber2 && randomNumber1 < 50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");}
        else if (randomNumber2 < 30 || randomNumber1 < 30) {
            System.out.println("Eine der beiden ist kleiner als 30");}
        else if (randomNumber1 < 50 && randomNumber2 != 50) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");}

        ------------------------------------------------------------------------------------
        int kidAge = 13;
        Boolean parentPresent = true;

        String seeMovies = kidAge > 18 || parentPresent ?"OK to go" :"Nope. Stay home";
        System.out.println(seeMovies);

        ------------------------------------------------------------------------------------

        int driverAge = 26;
        boolean learnerPermit = false;

        String canRent = driverAge > 24 && learnerPermit == false?"OK to rumble!" :"Not permitted";
        System.out.println(canRent);

        ------------------------------------------------------------------------------------

        boolean codingCampus = false;
        int Erfahrung = 1;

        String softwareArchiteckturen = codingCampus == true || Erfahrung > 5 ? "You may take the class":"You cannot take the class";
        System.out.println(softwareArchiteckturen);

        ------------------------------------------------------------------------------------
        int i = 0;
        int j = 2;
        int k = 3;


        while (i < 4) {
            if (k % j == 1) {
                System.out.println("XXXX");
                i++;
                k++;

            }
            else {
                System.out.println("OOOO");
                i++;
                j++;}
        }
        ------------------------------------------------------------------------------------
        int j = 0;
        for (int i = 0; i <= 100; i = i + 2) {
            j = j + i;
            System.out.println(i);
            System.out.println(j);

        }
        ------------------------------------------------------------------------------------


        for (int i = 0; i <= 6; i++) {
            if (i == 0) {
                System.out.println("XXXXXXX");
            } else if (i > 0 && i < 5) {
                System.out.println("   X   ");
            } else if (i >= 5 && i < 6) {
                System.out.println("X  X   ");
            } else if (i >= 6) {
                System.out.println("XXXX   ");
            }
        }
        ------------------------------------------------------------------------------------
        String ranNum = "2";

        switch (ranNum){
            case "+": System.out.println(); break;
        }
        ------------------------------------------------------------------------------------
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            j = j + i;
            System.out.println("Here is your i: " + i);
            System.out.println("And here is the j: " + j);

        }
        ------------------------------------------------------------------------------------
        //AUFGABE -WHILE LOOP

        int i = 0;
        int j = 0;
        while(j != 15 && j != 25) {
            Random rand = new Random();
            int randNumber = rand.nextInt(30-10) + 10;
            j = randNumber;

            i = i + randNumber;
            System.out.println("Your random number is: " + randNumber);
            System.out.println("Your current sum is: " + i);
        }
        ------------------------------------------------------------------------------------*/


        System.out.print("Please make your selection: \n 1) Deposit\n 2) Withdrawal\n 3) Account Balance\n 4) Exit \n");
        Scanner InitialObj = new Scanner(System.in);
        String userInitialEntry = InitialObj.nextLine();
        System.out.println("Here is the user entry: " + userInitialEntry);

        switch (userInitialEntry) {
            case "1":
                System.out.println("Enter your deposit amount");
                Scanner DepositObj = new Scanner(System.in);
                String customerDepositAmount = DepositObj.nextLine();
                break;
            case "2":
                System.out.println("Enter your deposit amount");
                Scanner WithdrawalObj = new Scanner(System.in);
                String customerWithdrawalAmount = WithdrawalObj.nextLine();
                break;
            case "3":
                System.out.println("Your current balance is:"); break;
            case "4":
                System.out.println("Thank you for your business. Goodbye."); break;
            default: break;}


            int result = addTwoNumbers(1,2);
            System.out.println(result);
    }
     static int addTwoNumbers(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

}
