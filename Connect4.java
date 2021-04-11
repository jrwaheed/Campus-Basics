import java.io.InputStream;
import java.util.*;
import java.util.Scanner;

public class Connect4 {

    public static HashMap< Integer, List<Character>> boardMatrix = new HashMap<>();


    public static void print() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(boardMatrix.get(j).get(i));
            }
            System.out.println();
        }
    }

    public static void begin() {
        //DON'T FUCK WITH THIS!! THIS IS THE BOARD CONSTRUCTOR!
        for (int i = 0; i < 7; i++) {
            boardMatrix.put(i, new ArrayList<>());
            for (int j = 0; j < 6; j++) {
                boardMatrix.get(i).add('-');
            }
        }
        //-----------------------------------------------------------------------
        print();
        System.out.println("\n");
        Player1Engine();
    }

    public static int Player1Selection() {
        System.out.println("Player 1, please enter drop column : ");
        Scanner Player1Obj = new Scanner(System.in);
        int Player1Ycoordinate = Player1Obj.nextInt();


        if(Player1Ycoordinate > 6 || Player1Ycoordinate < 0) {
            System.out.println("Your selection must an integer be between 0 and 6");

            Player1Selection();
        }

        return Player1Ycoordinate;
    }

    public static void Player1Engine() {
        int Player1drop = Player1Selection();

        for (int i = 5; i >= 0; i--) {
            if (boardMatrix.get(Player1drop).get(i) == '-') {
                boardMatrix.get(Player1drop).remove(i);
                boardMatrix.get(Player1drop).add(i, 'X');
                break;
            }
        }
        print();
        connectEngine();
        Player2Engine();
    }


    public static int Player2Selection() {
        System.out.println("Player 2, please enter drop column : ");
        Scanner Player2Obj = new Scanner(System.in);
        int Player2Ycoordinate = Player2Obj.nextInt();

        if(Player2Ycoordinate > 6 || Player2Ycoordinate < 0) {
            System.out.println("Your selection must an integer be between 0 and 6");
            Player2Selection();
        }

        return Player2Ycoordinate;
    }
    public static void Player2Engine() {
        int Player2drop = Player2Selection();

        for (int i = 5; i >= 0; i--) {
            if (boardMatrix.get(Player2drop).get(i) == '-') {
                boardMatrix.get(Player2drop).remove(i);
                boardMatrix.get(Player2drop).add(i, 'O');
                break;
            }
        }
        print();
        connectEngine();
        Player1Engine();
    }


    public static void connectEngine() {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (boardMatrix.get(j).get(i) != '-') {
                    //Connect Horizontal
                    try {
                        if (boardMatrix.get(j).get(i) == boardMatrix.get(j + 1).get(i) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j + 2).get(i) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j + 3).get(i)) {
                            if (boardMatrix.get(j).get(i) == 'X') {
                                System.out.println("Player 1 is the WINNER!");
                                System.exit(0);
                            } else {
                                System.out.println("Player 2 is the WINNER!");
                                System.exit(0);
                            }
                        }
                        //Connect Vertical
                        if (boardMatrix.get(j).get(i) == boardMatrix.get(j).get(i + 1) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j).get(i + 2) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j).get(i + 3)) {
                            if(boardMatrix.get(j).get(i) == 'X') {
                                System.out.println("Player 1 is the WINNER!");
                                System.exit(0);
                            } else {
                                System.out.println("Player 2 is the WINNER!");
                                System.exit(0);
                            }
                        }
                        //Connect Diagonal /
                        if (boardMatrix.get(j).get(i) == boardMatrix.get(j + 1).get(i + 1) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j + 2).get(i + 2) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j + 3).get(i + 3)) {
                            if (boardMatrix.get(j).get(i) == 'X') {
                                System.out.println("Player 1 is the WINNER!");
                                System.exit(0);
                            } else {
                                System.out.println("Player 2 is the WINNER!");
                                System.exit(0);
                            }
                        }
                        //Connect Diagonal \
                        if (boardMatrix.get(j).get(i) == boardMatrix.get(j - 1).get(i + 1) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j - 2).get(i + 2) &&
                                boardMatrix.get(j).get(i) == boardMatrix.get(j - 3).get(i + 3)) {
                            if (boardMatrix.get(j).get(i) == 'X') {
                                System.out.println("Player 1 is the WINNER!");
                                System.exit(0);
                            } else {
                                System.out.println("Player 2 is the WINNER!");
                                System.exit(0);
                            }
                        }
                    } catch (Exception IndexOutOfBoundsException) {}
                }
            }
        }
    }

    public static void main(String[] args) {


        System.out.println("***************************");
        System.out.println("*** Lets Play Connect 4 ***");
        System.out.println("***************************");
        System.out.println("\n");

        begin();
    }
}

