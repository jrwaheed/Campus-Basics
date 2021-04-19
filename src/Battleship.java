
import java.util.*;
import java.util.List;


public class Battleship {
    public static String boardHeader = "     A  B  C  D  E  F  G  H  I  J ";

    public static String[][] player1BattleshipBoardDefending = new String[10][10];
    public static String[][] player2BattleshipBoardDefending = new String[10][10];

    public static String[] yaxisLegend = {" 0 ", " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 "};
    public static char[] randomShipOrientation = {'R', 'C'};

    public static int[][] player1FleetRecorder = new int[14][2];
    public static int[][] player1BigShipRecorder = new int[5][2];
    public static int[][] player1MediumShipRecorder = new int[4][2];
    public static int[][] player1SmallShipRecorder = new int[3][2];
    public static int[][] player1TinyShipRecorder = new int[2][2];

    public static int[][] player2FleetRecorder = new int[14][2];
    public static int[][] player2BigShipRecorder = new int[5][2];
    public static int[][] player2MediumShipRecorder = new int[4][2];
    public static int[][] player2SmallShipRecorder = new int[3][2];
    public static int[][] player2TinyShipRecorder = new int[2][2];

    public static List<int []> player1MissilesHit = new ArrayList<>();
    public static List<int []> player1MissilesMiss = new ArrayList<>();
    public static List<int []> player2MissilesHit = new ArrayList<>();
    public static List<int []> player2MissilesMiss = new ArrayList<>();


    public static List<int []> player1LosesOnBigShip = new ArrayList<>();
    public static List<int []> player1LosesOnMediumShip = new ArrayList<>();
    public static List<int []> player1LosesOnSmallShip = new ArrayList<>();
    public static List<int []> player1LosesOnTinyShip = new ArrayList<>();

    public static List<int []> player2LosesOnBigShip = new ArrayList<>();
    public static List<int []> player2LosesOnMediumShip = new ArrayList<>();
    public static List<int []> player2LosesOnSmallShip = new ArrayList<>();
    public static List<int []> player2LosesOnTinyShip = new ArrayList<>();


    public static HashMap<String, Integer> letterMap = new HashMap<>();



    public static void main(String[] args) {

        letterMap.put("A", 0);
        letterMap.put("B", 1);
        letterMap.put("C", 2);
        letterMap.put("D", 3);
        letterMap.put("E", 4);
        letterMap.put("F", 5);
        letterMap.put("G", 6);
        letterMap.put("H", 7);
        letterMap.put("I", 8);
        letterMap.put("J", 9);


        buildTheDefensiveBoards();
        shipBuilder(5, player1BigShipRecorder, player1FleetRecorder);
        shipBuilder(4, player1MediumShipRecorder, player1FleetRecorder);
        shipBuilder(3, player1SmallShipRecorder, player1FleetRecorder);
        shipBuilder(2, player1TinyShipRecorder, player1FleetRecorder);

        shipBuilder(5, player2BigShipRecorder, player2FleetRecorder);
        shipBuilder(4, player2MediumShipRecorder, player2FleetRecorder);
        shipBuilder(3, player2SmallShipRecorder, player2FleetRecorder);
        shipBuilder(2, player2TinyShipRecorder, player2FleetRecorder);



        printFleetRecorderPlayer2();
        player1Attack();
        player1ViewOfPlayer2();






    }

    public static void buildTheDefensiveBoards() {
        //DON'T FUCK WITH THIS!! THIS IS THE BOARD CONSTRUCTOR!

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                player1BattleshipBoardDefending[i][j] = " - ";
                player2BattleshipBoardDefending[i][j] = " - ";
            }
        }
    }

    public static void player1Attack() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                player2BattleshipBoardDefending[i][j] = " - ";
            }
        }

        System.out.println(boardHeader);
        for (int k = 0; k < 10; k++) {
            System.out.print(yaxisLegend[k] + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(player2BattleshipBoardDefending[k][j]);
            }
            System.out.println();
        }

        Scanner player1ObjRow = new Scanner(System.in);
        System.out.println("Player 1. Enter the row number of your target now!");
        Integer player1MissileRow = player1ObjRow.nextInt();

        Scanner player1ObjCol = new Scanner(System.in);
        System.out.println("Player 1. Enter the column letter of your target now!");
        String player1MissileColumn = player1ObjCol.nextLine();



        int[] player1MissileCoordinates = {player1MissileRow, letterMap.get(player1MissileColumn)};




        boolean isHitPlayer1 = false;
        for (int [] coordinate : player2FleetRecorder) {
            if (Arrays.equals(player1MissileCoordinates, coordinate)) {
                player1MissilesHit.add(player1MissileCoordinates);
                isHitPlayer1 = true;
                System.out.println("This is a hit!");
                break;
            }
        }
        if (isHitPlayer1 == false) {
            player1MissilesMiss.add(player1MissileCoordinates);
            System.out.println("A MISS!");
        }
    }

    public static void player1ViewOfPlayer2() {
        String shipStatus = "#";
        System.out.println("\nSTATUS ");
        System.out.println("Opponent Large Ship:  " + shipStatus.repeat(player2BigShipRecorder.length) );
        System.out.println("Opponent Medium Ship: " + shipStatus.repeat(player2MediumShipRecorder.length) );
        System.out.println("Opponent Small Ship:  " + shipStatus.repeat(player2SmallShipRecorder.length) );
        System.out.println("Opponent Tiny Ship:   " + shipStatus.repeat(player2TinyShipRecorder.length) );

        for (int [] coordinate : player1MissilesHit) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = " M ";
        }

        for (int [] coordinate : player1MissilesMiss) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = "   ";
        }

        System.out.println(boardHeader);
        for (int i = 0; i < 10; i++) {
            System.out.print(yaxisLegend[i] + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(player2BattleshipBoardDefending[i][j]);
            }
            System.out.println();
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

    public static void shipBuilder(int shipSize, int[][] shipType, int[][] FleetRecorder) {

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
                for (int[] fleet : FleetRecorder) {
                    if (Arrays.equals(ship, fleet)) {
                        isDuplicate++;
                    }
                }
            }
        } while (isDuplicate != 0);


        // Adding the newly created ships to the fleet.
        int fleetcounter = 0;
        for (int[] ship : shipType) {
            boolean isEmptySlot = false;

            while (!isEmptySlot) {
                if (FleetRecorder[fleetcounter][0] == 0 && FleetRecorder[fleetcounter][1] == 0) {
                    FleetRecorder[fleetcounter] = ship;
                    fleetcounter++;
                    isEmptySlot = true;
                } else {
                    fleetcounter++;
                    isEmptySlot = false;
                }
            }
        }
    }







    public static void printFleetRecorderPlayer1() {
        for (int i = 0; i < player1FleetRecorder.length; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(player1FleetRecorder[i][j]);
            }
            System.out.println();
        }
    }

    public static void printFleetRecorderPlayer2() {
        for (int i = 0; i < player2FleetRecorder.length; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(player2FleetRecorder[i][j]);
            }
            System.out.println();
        }
    }

    public static void addShipsToBothDefensiveBoards() {
        for (int[] array : player1FleetRecorder) {
            player1BattleshipBoardDefending[array[0]][array[1]] = " X ";   //battleshipBoard.get(row)[column]
        }

        for (int[] array : player2FleetRecorder) {
            player2BattleshipBoardDefending[array[0]][array[1]] = " O ";   //battleshipBoard.get(row)[column]
        }
    }
}