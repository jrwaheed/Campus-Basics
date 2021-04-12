import java.util.HashMap;

public class Battleship {

    public static HashMap< Integer, char []> battleshipBoard = new HashMap<>();
    public static void main(String [] args){
        buildTheBoard();
        print();


    }


    public static void buildTheBoard() {
        //DON'T FUCK WITH THIS!! THIS IS THE BOARD CONSTRUCTOR!
        for (int i = 0; i < 10; i++) {                    //The number of Arrays
            battleshipBoard.put(i, new char [10]);
            for (int j = 0; j < 10; j++) {                //The number of elements in each Array
                battleshipBoard.get(i)[j] = 'X';
            }
        }

    }


        //-----------------------------------------------------------------------


    public static void print() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(battleshipBoard.get(i)[j]);
            }
            System.out.println();
        }
    }
}
