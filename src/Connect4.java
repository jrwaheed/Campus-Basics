import java.lang.reflect.Array;
import java.util.*;

public class Connect4 {
    static char[][] Board = new char[6][7];
    // REMEMBER:  (row,column) is (x,y)

    static List<Character> Column0 = new LinkedList<>();
    static List<Character> Column1 = new LinkedList<>();
    static List<Character> Column2 = new LinkedList<>();
    static List<Character> Column3 = new LinkedList<>();
    static List<Character> Column4 = new LinkedList<>();
    static List<Character> Column5 = new LinkedList<>();
    static List<Character> Column6 = new LinkedList<>();




    public static int Player1drop() {
        System.out.println("Player 1, please enter drop column : ");
        Scanner Player1Obj = new Scanner(System.in);
        int Ycoordinate = Player1Obj.nextInt();

        return Ycoordinate;
    }

    public static int Player2drop() {
        System.out.println("Player 2, please enter drop column : ");
        Scanner Player2Obj = new Scanner(System.in);
        int Ycoordinate = Player2Obj.nextInt();

        return Ycoordinate;
    }

    public static void begin() {

    }

    public static void main(String[] args) {

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                Board[x][y] = '-';
                //System.out.print(Board[x][y] + " ");
            }
            //System.out.println();
        }
        Column0.add('X');
        Column0.add('X');



        for (int x = 0; x < 6; x++) {
            try {
                if (Column0.get(x) == 'X') {
                    Board[x][0] = 'X';
                }
            } catch (Exception e) {
                continue;
            }
        }

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                System.out.print(Board[x][y] + " ");
            }
            System.out.println();
        }
    }
}









