import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class tictactoe {
    static char[][] sampleBoard = {{'|', '1', '|', '2', '|', '3', '|'},
            {'|', '4', '|', '5', '|', '6', '|'},
            {'|', '7', '|', '8', '|', '9', '|'}};

    static char[][] Board = {{'|', '-', '|', '-', '|', '-', '|'},
            {'|', '-', '|', '-', '|', '-', '|'},
            {'|', '-', '|', '-', '|', '-', '|'}};

    static List<Integer> usedCoordinates = new ArrayList<>();

    public static void main(String[] args) {


        System.out.println("***************************");
        System.out.println("*** Lets Play TicTacToe ***");
        System.out.println("***************************");
        System.out.println("\n");

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 6; j++) {
                System.out.print(sampleBoard[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Using the coordinates above, make your selection. \n");
        playerOne();
    }

    public static void playerOne() {
        HashMap<Integer, List> Coordinates = new HashMap<>();
        Coordinates.put(1, List.of(0, 1));
        Coordinates.put(2, List.of(0, 3));
        Coordinates.put(3, List.of(0, 5));
        Coordinates.put(4, List.of(1, 1));
        Coordinates.put(5, List.of(1, 3));
        Coordinates.put(6, List.of(1, 5));
        Coordinates.put(7, List.of(2, 1));
        Coordinates.put(8, List.of(2, 3));
        Coordinates.put(9, List.of(2, 5));

        System.out.println("Player 1. Please make your selection: ");
        Scanner userObjRow = new Scanner(System.in);
        int userCoordinate = userObjRow.nextInt();

        int userMoveRow = (int) (Coordinates.get(userCoordinate)).get(0);
        int userMoveCol = (int) (Coordinates.get(userCoordinate)).get(1);


        if (usedCoordinates.contains(userCoordinate)) {
            System.out.println("This position has already been selected \n");
            playerOne();
        } else {
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 6; j++) {
                    Board[userMoveRow][userMoveCol] = 'X';
                    System.out.print(Board[i][j] + " ");
                }
                System.out.println();
            }
            usedCoordinates.add(userCoordinate);
            if (Board[0][1] == 'X' && Board[0][1] == Board[0][3] && Board[0][3] == Board[0][5]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[1][1] == 'X' && Board[1][1] == Board[1][3] && Board[1][3] == Board[1][5]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[2][1] == 'X' && Board[2][1] == Board[2][3] && Board[2][3] == Board[2][5]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[0][1] == 'X' && Board[0][1] == Board[1][1] && Board[1][1] == Board[2][1]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[0][3] == 'X' && Board[0][3] == Board[1][3] && Board[1][3] == Board[2][3]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[0][5] == 'X' && Board[0][5] == Board[1][5] && Board[1][5] == Board[2][5]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[0][1] == 'X' && Board[0][1] == Board[1][3] && Board[1][3] == Board[2][5]) {
                System.out.println("Player 1 is the Winner!");
            } else if (Board[0][5] == 'X' && Board[0][5] == Board[1][3] && Board[1][3] == Board[2][1]) {
                System.out.println("Player 1 is the Winner!");
            } else if (usedCoordinates.size() == 9) {
                System.out.println("Its a Draw!");
            } else {
                playerTwo();
            }
        }
    }

    public static void playerTwo() {
        HashMap<Integer, List> Coordinates = new HashMap<>();
        Coordinates.put(1, List.of(0, 1));
        Coordinates.put(2, List.of(0, 3));
        Coordinates.put(3, List.of(0, 5));
        Coordinates.put(4, List.of(1, 1));
        Coordinates.put(5, List.of(1, 3));
        Coordinates.put(6, List.of(1, 5));
        Coordinates.put(7, List.of(2, 1));
        Coordinates.put(8, List.of(2, 3));
        Coordinates.put(9, List.of(2, 5));

        System.out.println("Player 2. Please make your selection: ");
        Scanner userObjRow = new Scanner(System.in);
        int userCoordinate = userObjRow.nextInt();

        int userMoveRow = (int) (Coordinates.get(userCoordinate)).get(0);
        int userMoveCol = (int) (Coordinates.get(userCoordinate)).get(1);


        if (usedCoordinates.contains(userCoordinate)) {
            System.out.println("This position has already been selected \n");
            playerTwo();
        } else {
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 6; j++) {
                    Board[userMoveRow][userMoveCol] = 'O';
                    System.out.print(Board[i][j] + " ");
                }
                System.out.println();

            }
            usedCoordinates.add(userCoordinate);
            if (Board[0][1] == 'O' && Board[0][1] == Board[0][3] && Board[0][3] == Board[0][5]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[1][1] == 'O' && Board[1][1] == Board[1][3] && Board[1][3] == Board[1][5]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[2][1] == 'O' && Board[2][1] == Board[2][3] && Board[2][3] == Board[2][5]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[0][1] == 'O' && Board[0][1] == Board[1][1] && Board[1][1] == Board[2][1]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[0][3] == 'O' && Board[0][3] == Board[1][3] && Board[1][3] == Board[2][3]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[0][5] == 'O' && Board[0][5] == Board[1][5] && Board[1][5] == Board[2][5]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[0][1] == 'O' && Board[0][1] == Board[1][3] && Board[1][3] == Board[2][5]) {
                System.out.println("Player 2 is the Winner!");
            } else if (Board[0][5] == 'O' && Board[0][5] == Board[1][3] && Board[1][3] == Board[2][1]) {
                System.out.println("Player 2 is the Winner!");
            } else if (usedCoordinates.size() == 9) {
                System.out.println("Its a Draw!");
            } else {
                playerOne();
            }
        }

    }
}

