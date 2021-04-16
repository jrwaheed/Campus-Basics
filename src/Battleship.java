

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
    public static  int [][] player1schlachtschiffRecorder = new int[5][2];
    public static  int [][] player1kreuzerRecorder = new int[4][2];
    public static  int [][] player1zerstorerRecorder = new int[3][2];
    public static  int [][] player1ubooteRecorder = new int[2][2];

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
        player1ShipBuilder();
        printFleetRecorder();
        updateBoardPlayer1();
        print();
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
        int max = 10;
        int min = 1;
        int shipNumericAddress = randomNumber.nextInt((max + 1 - min) + min);
        return shipNumericAddress;
    }

    public static char randomShipAlphabeticGenerator(){
        Random randomLetter = new Random();
        char shipAlphabeticAddress = randomLetterArray[randomLetter.nextInt(10 )];
        return shipAlphabeticAddress;
    }

    public static char randomShipOrientationGenerator(){
        Random randomOrientation = new Random();
        char shipOrientation = randomShipOrientation[randomOrientation.nextInt(2 )];
        return shipOrientation;
    }

    public static void player1ShipBuilder () {

//NullPointException

        int schlachtschiffLocationRow = randomShipNumericGenerator();
        int schlachtschiffLocationColumn = randomLetterMap.get(randomShipAlphabeticGenerator());
        char schlachtschiffOrientation = randomShipOrientationGenerator();




        int kreuzerLocationRow = randomShipNumericGenerator();
        int kreuzerLocationColumn = randomLetterMap.get(randomShipAlphabeticGenerator());
        char kreuzerOrientation = randomShipOrientationGenerator();

        switch (kreuzerOrientation) {

            case 'N':
                int nKreuzerCounter = 0;
                if (kreuzerLocationColumn < 5 ) {
                    for (int i = 5; i < 9; i++) {
                        int[] kreuzerCoordinates = {kreuzerLocationRow + nKreuzerCounter, kreuzerLocationColumn };
                        player1FleetRecorder[i] = kreuzerCoordinates;
                        nKreuzerCounter++;
                    }
                } else {
                    for (int i = 8; i >= 5; i--) {
                        int[] kreuzerCoordinates = {kreuzerLocationRow - nKreuzerCounter, kreuzerLocationColumn };
                        player1FleetRecorder[i] = kreuzerCoordinates;
                        nKreuzerCounter++;
                    }
                }
                break;


            case 'W':
                int wKreuzerCounter = 0;
                if (kreuzerLocationColumn < 5) {
                    for (int i = 5; i < 9; i++) {
                        int[] kreuzerCoordinates = {kreuzerLocationRow, kreuzerLocationColumn + wKreuzerCounter};
                        player1FleetRecorder[i] = kreuzerCoordinates;
                        wKreuzerCounter++;
                    }
                } else {
                    for (int i = 8; i >= 5; i--) {
                        int[] kreuzerCoordinates = {kreuzerLocationRow, kreuzerLocationColumn - wKreuzerCounter};
                        player1FleetRecorder[i] = kreuzerCoordinates;
                        wKreuzerCounter++;
                    }
                }
                break;
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


    public static void updateBoardPlayer1 () {
        for (int [] array : player1FleetRecorder) {
            battleshipBoard.get(array[0])[array[1]] = " X ";   //battleshipBoard.get(row)[column]
            }
        }







    }









