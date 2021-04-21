
import java.sql.Time;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class Battleship {
    public static String boardHeader = "     A  B  C  D  E  F  G  H  I  J ";
    public static String[] alphabeticEntryCheckArray = {"A","B","C","D","E","F","G","H","I","J"};
    public static List<String> alphabeticEntryCheckList = Arrays.asList(alphabeticEntryCheckArray);

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

    public static List<int[]> player1MissilesHit = new ArrayList<>();
    public static List<int[]> player1MissilesMiss = new ArrayList<>();
    public static List<int[]> player2MissilesHit = new ArrayList<>();
    public static List<int[]> player2MissilesMiss = new ArrayList<>();


    public static List<int[]> player1LosesOnBigShip = new ArrayList<>();
    public static List<int[]> player1LosesOnMediumShip = new ArrayList<>();
    public static List<int[]> player1LosesOnSmallShip = new ArrayList<>();
    public static List<int[]> player1LosesOnTinyShip = new ArrayList<>();

    public static List<int[]> player2LosesOnBigShip = new ArrayList<>();
    public static List<int[]> player2LosesOnMediumShip = new ArrayList<>();
    public static List<int[]> player2LosesOnSmallShip = new ArrayList<>();
    public static List<int[]> player2LosesOnTinyShip = new ArrayList<>();


    public static HashMap<String, Integer> letterMap = new HashMap<>();


    public static void main(String[] args) throws InterruptedException {

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

        intro();
        //System.out.println("Player 1 Defending below");
        //printFleetRecorderPlayer1();
        //System.out.println("Player 2 Defending below");
        //printFleetRecorderPlayer2();
        player1Attack();
    }

    public static void intro() throws InterruptedException {
        System.out.println("\n\n\n             *******************************************************************");
        System.out.println("             ************************ LETS PLAY BATTLESHIP *********************");
        System.out.println("             *******************************************************************\n\n\n");

        TimeUnit.SECONDS.sleep(2);
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

    public static void player1Attack() throws InterruptedException {
        System.out.println("\n\n\n   ******************************");
        System.out.println("   ********** PLAYER 1 **********");
        System.out.println("   ******************************\n");

        for (int[] coordinate : player1MissilesHit) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = " X ";
        }

        for (int[] coordinate : player1MissilesMiss) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = "   ";
        }

        System.out.println(boardHeader);
        for (int k = 0; k < 10; k++) {
            System.out.print(yaxisLegend[k] + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(player2BattleshipBoardDefending[k][j]);
            }
            System.out.println();
        }

        String shipStatus = "#";
        String shipDamage = "-";
        System.out.println("\nSTATUS ");
        System.out.println("Your Large Ship:  " + shipStatus.repeat(player1BigShipRecorder.length - player1LosesOnBigShip.size()) + shipDamage.repeat(player1LosesOnBigShip.size()));
        System.out.println("Your Medium Ship: " + shipStatus.repeat(player1MediumShipRecorder.length - player1LosesOnMediumShip.size()) + shipDamage.repeat(player1LosesOnMediumShip.size()));
        System.out.println("Your Small Ship:  " + shipStatus.repeat(player1SmallShipRecorder.length - player1LosesOnSmallShip.size()) + shipDamage.repeat(player1LosesOnSmallShip.size()));
        System.out.println("Your Tiny Ship:   " + shipStatus.repeat(player1TinyShipRecorder.length - player1LosesOnTinyShip.size()) + shipDamage.repeat(player1LosesOnTinyShip.size()) + "\n");

        for (int[] coordinate : player1MissilesHit) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = " M ";
        }

        for (int[] coordinate : player1MissilesMiss) {
            player2BattleshipBoardDefending[coordinate[0]][coordinate[1]] = "   ";
        }


        boolean isOkNumberEntry = false;
        Scanner player1ObjRow = new Scanner(System.in);
        System.out.println("Player 1. Enter the row number of your target now!");
        Integer player1MissileRow = 0;

        while (!isOkNumberEntry) {
            player1MissileRow = player1ObjRow.nextInt();
            if(player1MissileRow > 9 || player1MissileRow < 0) {
                System.out.println("You must enter a number between 0 and 9");
            } else { isOkNumberEntry = true;
            }
        }

        boolean isOKAlphabetEntry = false;
        Scanner player1ObjCol = new Scanner(System.in);
        System.out.println("Player 1. Enter the column letter of your target now!");

        String player1MissileColumn = "";
        while(!isOKAlphabetEntry) {
            player1MissileColumn = player1ObjCol.nextLine();
            if (!alphabeticEntryCheckList.contains(player1MissileColumn)) {
                System.out.println("You must enter a letter from alphabetic axis above.");
            } else {
                isOKAlphabetEntry = true;
            }
        }


        int[] player1MissileCoordinates = {player1MissileRow, letterMap.get(player1MissileColumn)};

        boolean isHitPlayer1 = false;
        for (int[] coordinate : player2FleetRecorder) {
            if (Arrays.equals(player1MissileCoordinates, coordinate)) {
                player1MissilesHit.add(player1MissileCoordinates);
                isHitPlayer1 = true;
                System.out.println("\nThis is a hit!");
                break;
            }
        }
        if (isHitPlayer1 == false) {
            player1MissilesMiss.add(player1MissileCoordinates);
            System.out.println("\nA MISS!");
        }

        for (int[] bucket : player2BigShipRecorder) {
            if (Arrays.equals(player1MissileCoordinates, bucket)) {
                player2LosesOnBigShip.add(player1MissileCoordinates);
                System.out.println("Hit on oppenent's big ship!");
            }
        }
        for (int[] bucket : player2MediumShipRecorder) {
            if (Arrays.equals(player1MissileCoordinates, bucket)) {
                player2LosesOnMediumShip.add(player1MissileCoordinates);
                System.out.println("Hit on oppenent's medium ship!");
            }
        }
        for (int[] bucket : player2SmallShipRecorder) {
            if (Arrays.equals(player1MissileCoordinates, bucket)) {
                player2LosesOnSmallShip.add(player1MissileCoordinates);
                System.out.println("Hit on oppenent's small ship!");
            }
        }
        for (int[] bucket : player2TinyShipRecorder) {
            if (Arrays.equals(player1MissileCoordinates, bucket)) {
                player2LosesOnTinyShip.add(player1MissileCoordinates);
                System.out.println("Hit on oppenent's tiny ship!");
            }
        }
        player2DefendingShipStatus();
        TimeUnit.SECONDS.sleep(2);
        player2Attack();

    }

    public static void player2Attack() throws InterruptedException {
        System.out.println("\n\n\n   ******************************");
        System.out.println("   ********** PLAYER 2 **********");
        System.out.println("   ******************************\n");

        for (int[] coordinate : player2MissilesHit) {
            player1BattleshipBoardDefending[coordinate[0]][coordinate[1]] = " X ";
        }

        for (int[] coordinate : player2MissilesMiss) {
            player1BattleshipBoardDefending[coordinate[0]][coordinate[1]] = "   ";
        }

        System.out.println(boardHeader);
        for (int k = 0; k < 10; k++) {
            System.out.print(yaxisLegend[k] + " ");
            for (int j = 0; j < 10; j++) {
                System.out.print(player1BattleshipBoardDefending[k][j]);
            }
            System.out.println();
        }

        String shipStatus = "#";
        String shipDamage = "-";
        System.out.println("\nSTATUS ");
        System.out.println("Your Large Ship:  " + shipStatus.repeat(player2BigShipRecorder.length - player2LosesOnBigShip.size()) + shipDamage.repeat(player2LosesOnBigShip.size()));
        System.out.println("Your Medium Ship: " + shipStatus.repeat(player2MediumShipRecorder.length - player2LosesOnMediumShip.size()) + shipDamage.repeat(player2LosesOnMediumShip.size()));
        System.out.println("Your Small Ship:  " + shipStatus.repeat(player2SmallShipRecorder.length - player2LosesOnSmallShip.size()) + shipDamage.repeat(player2LosesOnSmallShip.size()));
        System.out.println("Your Tiny Ship:   " + shipStatus.repeat(player2TinyShipRecorder.length - player2LosesOnTinyShip.size()) + shipDamage.repeat(player2LosesOnTinyShip.size()) + "\n");


        boolean isOkNumberEntry = false;
        Scanner player2ObjRow = new Scanner(System.in);
        System.out.println("Player 2. Enter the row number of your target now!");
        Integer player2MissileRow = 0;

        while (!isOkNumberEntry) {
            player2MissileRow = player2ObjRow.nextInt();
            if(player2MissileRow > 9 || player2MissileRow < 0) {
                System.out.println("You must enter a number between 0 and 9");
            } else { isOkNumberEntry = true;
            }
        }

        boolean isOKAlphabetEntry = false;
        Scanner player2ObjCol = new Scanner(System.in);
        System.out.println("Player 2. Enter the column letter of your target now!");

        String player2MissileColumn = "";
        while(!isOKAlphabetEntry) {
            player2MissileColumn = player2ObjCol.nextLine();
            if (!alphabeticEntryCheckList.contains(player2MissileColumn)) {
                System.out.println("You must enter a letter from alphabetic axis above.");
            } else {
                isOKAlphabetEntry = true;
            }
        }


        int[] player2MissileCoordinates = {player2MissileRow, letterMap.get(player2MissileColumn)};

        boolean isHitPlayer2 = false;
        for (int[] coordinate : player1FleetRecorder) {
            if (Arrays.equals(player2MissileCoordinates, coordinate)) {
                player2MissilesHit.add(player2MissileCoordinates);
                isHitPlayer2 = true;
                System.out.println("\nThis is a hit!");
                break;
            }
        }
        if (isHitPlayer2 == false) {
            player2MissilesMiss.add(player2MissileCoordinates);
            System.out.println("\nA MISS!");
        }

        for (int[] bucket : player1BigShipRecorder) {
            if (Arrays.equals(player2MissileCoordinates, bucket)) {
                player1LosesOnBigShip.add(player2MissileCoordinates);
                System.out.println("Hit on oppenent's big ship!");
            }
        }
        for (int[] bucket : player1MediumShipRecorder) {
            if (Arrays.equals(player2MissileCoordinates, bucket)) {
                player1LosesOnMediumShip.add(player2MissileCoordinates);
                System.out.println("Hit on oppenent's medium ship!");
            }
        }
        for (int[] bucket : player1SmallShipRecorder) {
            if (Arrays.equals(player2MissileCoordinates, bucket)) {
                player1LosesOnSmallShip.add(player2MissileCoordinates);
                System.out.println("Hit on oppenent's small ship!");
            }
        }
        for (int[] bucket : player1TinyShipRecorder) {
            if (Arrays.equals(player2MissileCoordinates, bucket)) {
                player1LosesOnTinyShip.add(player2MissileCoordinates);
                System.out.println("Hit on oppenent's tiny ship!");
            }
        }
        TimeUnit.SECONDS.sleep(2);
        player1DefendingShipStatus();
        player1Attack();
    }

    public static void player1DefendingShipStatus() {
        if (player1LosesOnBigShip.size() == 5) {
            System.out.println("You sunk player1 big ship!");
        }

        if (player1LosesOnMediumShip.size() == 4) {
            System.out.println("You sunk player1 medium ship!");
        }

        if (player1LosesOnSmallShip.size() == 3) {
            System.out.println("You sunk player1 small ship!");
        }

        if (player1LosesOnTinyShip.size() == 2) {
            System.out.println("You sunk player1 tiny ship!");
        }

        if (player2MissilesHit.size() == 14) {
            System.out.println("You sunk all of your opponents ships!");
            System.out.println("YOU WON!");
            System.exit(0);
        }
    }

    public static void player2DefendingShipStatus() {
        if (player2LosesOnBigShip.size() == 5) {
            System.out.println("You sunk player2 big ship!");
        }

        if (player2LosesOnMediumShip.size() == 4) {
            System.out.println("You sunk player2 medium ship!");
        }

        if (player2LosesOnSmallShip.size() == 3) {
            System.out.println("You sunk player2 small ship!");
        }

        if (player2LosesOnTinyShip.size() == 2) {
            System.out.println("You sunk player2 tiny ship!");
        }

        if (player1MissilesHit.size() == 14) {
            System.out.println("You sunk all of your opponents ships!");
            System.out.println("YOU WON!");
            System.exit(0);

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
}

