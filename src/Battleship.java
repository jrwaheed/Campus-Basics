

import java.util.HashMap;
import java.util.Random;



public class Battleship {

    public static HashMap<Integer, String []> battleshipBoard = new HashMap<>();
    public static HashMap< Character, Integer > randomLetterMap = new HashMap<>();
    public static char[] randomLetterArray = {'A','B','C','D','E','F','G','H','I','J'};
    public static char[] randomShipOrientation = {'N','W'};

    public static HashMap<Integer, String> shipOrientationMap = new HashMap<>();

    //Recorded as Row/Column
    public static  int [][] player1FleetRecorder = new int[14][2];

    public static void main(String [] args){
        randomLetterMap.put('A', 1);
        randomLetterMap.put('B', 2);
        randomLetterMap.put('C', 3);
        randomLetterMap.put('D', 4);
        randomLetterMap.put('E', 5);
        randomLetterMap.put('F', 6);
        randomLetterMap.put('G', 7);
        randomLetterMap.put('H', 8);
        randomLetterMap.put('I', 9);
        randomLetterMap.put('J', 10);

        buildTheBoard();
        print();
        randomShipNumericGenerator();
        randomShipAlphabeticGenerator();
        player1ShipBuilder();
        printFleetRecorder();
    }



    public static void print() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.print(battleshipBoard.get(i)[j]);
            }
            System.out.println();
        }
    }

    public static void buildTheBoard() {
        //DON'T FUCK WITH THIS!! THIS IS THE BOARD CONSTRUCTOR!
        String [] boardHeader = {"  "," A "," B "," C "," D "," E "," F "," G "," H "," I "," J "};
        battleshipBoard.put(0,boardHeader);
        for (int i = 1; i <= 10; i++) {                    //The number of Arrays
            battleshipBoard.put(i, new String [11]);
            for (int j = 0; j <= 10; j++) {                //The number of elements in each Array
                battleshipBoard.get(i)[j] = " - ";
            }
        }
        for (int k = 1; k <= 9; k++) {
            String makeRowNumber = Integer.toString(k);
            battleshipBoard.get(k)[0] = makeRowNumber + " ";
        }

        for (int k = 10; k < 11; k++) {
            String makeRowNumber = Integer.toString(k);
            battleshipBoard.get(k)[0] = makeRowNumber;
        }

    }

    public static int randomShipNumericGenerator() {
        Random randomNumber = new Random();
        int shipNumericAddress = randomNumber.nextInt((10 - 1) + 1) + 1;
        return shipNumericAddress;
    }

    public static char randomShipAlphabeticGenerator(){
        Random randomLetter = new Random();
        char shipAlphabeticAddress = randomLetterArray[randomLetter.nextInt(9 )];
        return shipAlphabeticAddress;
    }

    public static char randomShipOrientationGenerator(){
        Random randomOrientation = new Random();
        char shipOrientation = randomShipOrientation[randomOrientation.nextInt(2 )];
        return shipOrientation;
    }

    public static void player1ShipBuilder (){

        int schlachtschiffLocationRow = randomShipNumericGenerator();
        int schlachtschiffLocationColumn = randomLetterMap.get(randomShipAlphabeticGenerator());
        char schlachtschiffOrientation = randomShipOrientationGenerator();

        switch(schlachtschiffOrientation) {
            case 'N':
                for (int i = 0; i < 5; i++) {
                    int [] schlachtschiffCoordinates = {schlachtschiffLocationRow , schlachtschiffLocationColumn + i};
                    player1FleetRecorder[i] = schlachtschiffCoordinates;
                }
                break;
            case 'W':
                for (int i = 0; i < 5; i++) {
                    int [] schlachtschiffCoordinates = {schlachtschiffLocationRow + i , schlachtschiffLocationColumn};
                    player1FleetRecorder[i] = schlachtschiffCoordinates;
                }
                break;
        }
    }

    public static void updateBoardPlayer1 () {
        for (int i = 1; i <= 10; i++) {                    //The number of Arrays
            for (int j = 0; j <= 10; j++) {                //The number of elements in each Array
                battleshipBoard.get(i)[j] = " - ";
            }
        }
    }
    public static void printFleetRecorder() {
        for (int i = 0; i <= 13; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(player1FleetRecorder[i][j]);
            }
            System.out.println();
        }
    }





    }









