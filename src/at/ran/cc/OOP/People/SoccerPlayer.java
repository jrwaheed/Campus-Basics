package at.ran.cc.OOP.People;

public class SoccerPlayer extends Athlete{
    private boolean playsSoccer;
    public SoccerPlayer(String firstName, String lastName, int ageOfPerson, int heightOfPerson, double fortyTime,
                        boolean playsSoccer) {
        super(firstName, lastName, ageOfPerson, heightOfPerson, fortyTime);
        this.playsSoccer = playsSoccer;
    }

    public boolean isPlaysSoccer() {
        return playsSoccer;
    }

    public void setPlaysSoccer(boolean playsSoccer) {
        this.playsSoccer = playsSoccer;
    }
}
