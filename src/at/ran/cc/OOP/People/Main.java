package at.ran.cc.OOP.People;

public class Main {

    public static void main(String[] args) {

        Human human1 = new Human("Watts", "TJ", 26, 185);
        Human human2 = new Human("Emmitt", "Smith", 38, 177);
        Human human3 = new Human("Andre", "Dawson", 48, 180);

        OfficeWorker worker1 = new OfficeWorker("John", "Doe", 50, 165);

        Athlete athlete1 = new Athlete("Lindsey", "Von", 30, 165,
                5.0);

        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Enrique", "Futbol", 21,
                172,4.7,true);

        Goalkeeper goalie1 = new Goalkeeper("Eddie", "Block", 26, 177,
                4.7, true, true);

        Striker striker1 = new Striker("Tony", "Bigfoot", 40, 180,
                4.5, true, false);

        worker1.filling();

        goalie1.stopsBall();

        striker1.kicksBall();
    }
}
