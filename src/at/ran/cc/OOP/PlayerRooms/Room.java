package at.ran.cc.OOP.PlayerRooms;

import java.util.ArrayList;

public class Room {
    private String bezeichnung;
    private ArrayList<Player> mPlayerList;

    public static int numberOfRooms;

    public Room(String bezeichnung) {
        this.bezeichnung = bezeichnung;
        this.mPlayerList = new ArrayList<>();

    }

    public void addPlayerList(Player player){
        mPlayerList.add(player);
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public ArrayList<Player> getmPlayerList() {
        return mPlayerList;
    }

    public static void roomCount(){
        System.out.println(numberOfRooms);
    }

    public void printPlayers() {
        for (int i = 0; i < this.mPlayerList.size(); i++) {
            System.out.println(this.mPlayerList.get(i).getFullName());
        }
    }
}