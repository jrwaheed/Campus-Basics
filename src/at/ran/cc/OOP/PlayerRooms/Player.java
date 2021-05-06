package at.ran.cc.OOP.PlayerRooms;

public class Player {
    private Room myRoom;
    private String fullName;
    private int playerAge;
    private boolean goodStudent;


    public Player(Room myRoom, String fullName, int playerAge, boolean goodStudent) {
        this.myRoom = myRoom;
        this.fullName = fullName;
        this.playerAge = playerAge;
        this.goodStudent = goodStudent;
    }

    public Room getMyRoom() {
        return myRoom;
    }

    public void setMyRoom(Room myRoom) {
        this.myRoom = myRoom;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public boolean isGoodStudent() {
        return goodStudent;
    }

    public void setGoodStudent(boolean goodStudent) {
        this.goodStudent = goodStudent;
    }
}
