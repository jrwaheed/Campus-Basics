package at.ran.cc.OOP.PlayerRooms;

public class TestRaumPlayer {
    public static void main(String[] args) {
        Room mRoom = new Room("CodeCapmus");
        Room nRoom = new Room("Bathroom");
        Room oRoom = new Room("kitchen");

        Player player1 = new Player(nRoom, "Johnnie", 23, false);
        Player player2 = new Player(oRoom, "Beth", 21, true);
        Player player3 = new Player(mRoom, "Karen", 27, false);
        Player player4 = new Player(mRoom, "Tim", 25, false);

        mRoom.addPlayerList(player3);
        mRoom.addPlayerList(player4);
        nRoom.addPlayerList(player1);
        oRoom.addPlayerList(player2);






    }

}


