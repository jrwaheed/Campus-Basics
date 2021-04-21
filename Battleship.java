import java.lang.reflect.Array;
import java.util.*;


public class Battleship {
    public static String boardHeader = "     A  B  C  D  E  F  G  H  I  J ";

    public static String[][] battleshipBoard = new String[10][10];
    public static HashMap<Character, Integer> randomLetterMap = new HashMap<>();
    public static String[] xaxisLegend = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
    public static String[] yaxisLegend = {" 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", "10 "};
    public static char[] randomShipOrientation = {'R', 'C'};

    public static HashMap<Integer, String> shipOrientationMap = new HashMap<>();



    //Recorded as Row/Column
    //public static ArrayList<int []> fleetRecorder = new ArrayList<>();
    public static int[][] fleetRecorder = new int[14][2];
    public static int[][] player1BigShipRecorder = new int[5][2];
    public static int[][] player1MediumShipRecorder = new int[4][2];
    public static int[][] player1SmallShipRecorder = new int[3][2];
    public static int[][] player1TinyShipRecorder = new int[2][2];

    public static void main(String[] args) {
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
        shipBuilder(5, player1BigShipRecorder);
        shipBuilder(4, player1MediumShipRecorder);
        shipBuilder(3, player1SmallShipRecorder);
        shipBuilder(2, player1TinyShipRecorder);
        printFleetRecorder();
        updateBoardPlayer1();
        print();

    }


    public static void print() {
        System.out.println(boardHeader);
        for (int i = 0; i < 10; i++) {
            System.out.print(yaxisLegend[i] + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(battleshipBoard[i][j]);
            }
            System.out.println();
        }
    }

    public static void buildTheBoard() {
        //DON'T FUCK WITH THIS!! THIS IS THE BOARD CONSTRUCTOR!

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                battleshipBoard[i][j] = " - ";
            }
        }
    }

    public static int randomShipNumericGenerator() {
        Random randomNumber = new Random();
        int max = 9;
        int min = 0;
        int shipNumericAddress = randomNumber.nextInt((max + 1 - min) + min);
        return shipNumericAddress;
    }

    public static int randomShipAlphabeticGenerator() {
        Random randomLetter = new Random();
        int max = 9;
        int min = 0;
        int shipAlphabeticAddress = randomLetter.nextInt((max + 1 - min) + min);
        return shipAlphabeticAddress;
    }

    public static char randomShipOrientationGenerator() {
        Random randomOrientation = new Random();
        char shipOrientation = randomShipOrientation[randomOrientation.nextInt(2)];
        return shipOrientation;
    }


    public static void shipBuilder(int shipSize, int[][] shipType) {

        int isDuplicate;
        do {
            isDuplicate = 0;
            int player1ShipRandomRows = randomShipAlphabeticGenerator();
            int player1ShipRandomColumns = randomShipNumericGenerator();
            int shipOrientation = randomShipOrientationGenerator();


            switch (shipOrientation) {
                case 'R':
                    if (player1ShipRandomRows < 5) {
                        for (int i = 0; i < shipSize; i++) {
                            shipType[i][0] = player1ShipRandomRows + i;
                            shipType[i][1] = player1ShipRandomColumns;
                        }
                    } else {
                        for (int i = shipSize - 1; i >= 0; i--) {
                            shipType[i][0] = player1ShipRandomRows - i;
                            shipType[i][1] = player1ShipRandomColumns;
                        }
                    }
                    break;


                case 'C':
                    if (player1ShipRandomColumns < 5) {
                        for (int i = 0; i < shipSize; i++) {
                            shipType[i][0] = player1ShipRandomRows;
                            shipType[i][1] = player1ShipRandomColumns + i;
                        }
                    } else {
                        for (int i = shipSize - 1; i >= 0; i--) {
                            shipType[i][0] = player1ShipRandomRows;
                            shipType[i][1] = player1ShipRandomColumns - i;
                        }
                    }
                    break;
            }

            for (int[] ship : shipType) {
                for (int[] fleet : fleetRecorder) {
                    if (Arrays.equals(ship,fleet)) {
                        isDuplicate++;
                    }
                }
            }
        }while (isDuplicate != 0);


        // Adding the newly created ships to the fleet.
        int fleetcounter = 0;
        for (int[] ship : shipType) {
            boolean isEmptySlot = false;

            while (!isEmptySlot) {
                if (fleetRecorder[fleetcounter][0] == 0 && fleetRecorder[fleetcounter][1] == 0) {
                    fleetRecorder[fleetcounter] = ship;
                    fleetcounter++;
                    isEmptySlot = true;
                } else {
                    fleetcounter++;
                    isEmptySlot = false;
                }
            }
        }
    }


    public static void printFleetRecorder() {
        for (int i = 0; i < fleetRecorder.length; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(fleetRecorder[i][j]);
            }
            System.out.println();
        }
    }

    public static void updateBoardPlayer1 () {
        for (int[] array : fleetRecorder) {
            battleshipBoard[array[0]][array[1]] = " X ";   //battleshipBoard.get(row)[column]
        }
    }
}












